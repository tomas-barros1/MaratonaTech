package com.backend.P1.controllers;

import com.backend.P1.entities.User;
import com.backend.P1.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.Optional;

public class UserController {
    @Autowired
    private UserService userService;

    @PostMapping("/signup")
    public ResponseEntity<String> signup(@RequestBody User user) {
        // Verifica se o email já está cadastrado
        if (userService.findByEmail(user.getEmail()).isPresent()) {
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("Email already in use");
        }

        // Encripta a senha antes de salvar
        user.setPassword(userService.encodePassword(user.getPassword()));

        User savedUser = userService.saveUser(user);
        return ResponseEntity.status(HttpStatus.CREATED).body("User registered successfully");
    }

    @PostMapping("/login")
    public ResponseEntity<String> login(@RequestBody User user) {
        // Verifica se o usuário existe
        Optional<User> existingUser = userService.findByEmail(user.getEmail());
        if (existingUser.isEmpty()) {
            return ResponseEntity.status(HttpStatus.UNAUTHORIZED).body("Invalid credentials");
        }

        // Verifica se a senha está correta
        if (!userService.checkPassword(user.getPassword(), existingUser.get().getPassword())) {
            return ResponseEntity.status(HttpStatus.UNAUTHORIZED).body("Invalid credentials");
        }

        // Gera e retorna o token JWT (vamos simular um token simples para este exemplo)
        String token = "SimulatedJWTToken"; // Aqui você deve gerar um token JWT de verdade
        return ResponseEntity.ok(token);
    }
}
