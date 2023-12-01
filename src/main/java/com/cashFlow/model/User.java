package com.cashFlow.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "tab_usuario")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "usuario", nullable = false, unique = true)
    private String username;
    @Column(name = "senha", nullable = false)
    private String password;

}
