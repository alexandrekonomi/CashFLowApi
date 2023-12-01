package com.cashFlow.payload;

import java.time.LocalDateTime;

public record UserRequest(
        String username,
        String password,
        LocalDateTime createdAt
) {
}
