package com.cashFlow.service;

import com.cashFlow.model.User;
import com.cashFlow.payload.UserRequest;
import com.cashFlow.repository.UserRepository;
import org.apache.coyote.BadRequestException;
import org.springframework.beans.BeanUtils;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import java.time.LocalDateTime;

@Service
public class UserService {

    private final UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public ResponseEntity<?> createUser(UserRequest userRequest) {
        User user = new User();
        user.setCreatedAt(LocalDateTime.now());
        user.setUsername(userRequest.username());
        user.setPassword(userRequest.password());
        userRepository.save(user);

        return ResponseEntity.status(HttpStatus.CREATED).build();
    }

    public ResponseEntity<?> getUserById(Long userId) throws BadRequestException {
        User user = findById(userId);
        UserRequest userRequest = new UserRequest(
                user.getUsername(),
                user.getPassword(),
                user.getCreatedAt());
        return ResponseEntity.ok().body(userRequest);
    }

    public User findById(Long userId) throws BadRequestException {
        return userRepository.findById(userId)
                .orElseThrow(() -> new BadRequestException("User not found"));
    }

    public ResponseEntity<?> updateUser(Long userId, UserRequest userRequest) throws BadRequestException {
        User user = findById(userId);
        BeanUtils.copyProperties(userRequest, user);
        return ResponseEntity.ok().body("User update successfully");
    }

    public ResponseEntity<?> deleteUser (Long userId) throws BadRequestException {
        User user = findById(userId);
        userRepository.delete(user);
        return ResponseEntity.status(HttpStatus.OK).build();
    }
}
