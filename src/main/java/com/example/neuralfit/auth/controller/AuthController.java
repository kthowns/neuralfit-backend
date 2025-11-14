package com.example.neuralfit.auth.controller;

import com.example.neuralfit.auth.dto.LoginRequest;
import com.example.neuralfit.auth.dto.LoginResponse;
import com.example.neuralfit.auth.dto.PatientSignUpRequest;
import com.example.neuralfit.auth.dto.TherapistSignUpRequest;
import com.example.neuralfit.auth.service.AuthService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/auth")
public class AuthController {
    private final AuthService authService;

    @PostMapping("/login")
    public ResponseEntity<LoginResponse> login(@RequestBody @Valid LoginRequest loginRequest) {
        return ResponseEntity.ok(authService.login(loginRequest));
    }

    @PostMapping("/signup/patient")
    public ResponseEntity<Void> patientSignUp(
            @RequestBody @Valid PatientSignUpRequest patientSignUpRequest
    ) {
        authService.patientSignUp(patientSignUpRequest);

        return ResponseEntity.ok().build();
    }

    @PostMapping("/signup/therapist")
    public ResponseEntity<Void> therapistSignUp(
            @RequestBody @Valid TherapistSignUpRequest therapistSignUpRequest
    ) {
        authService.therapistSignUp(therapistSignUpRequest);

        return ResponseEntity.ok().build();
    }
}
