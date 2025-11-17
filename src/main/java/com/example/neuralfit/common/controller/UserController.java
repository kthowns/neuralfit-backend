package com.example.neuralfit.common.controller;

import com.example.neuralfit.common.dto.AppUserInfoDto;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/user")
public class UserController {
    @GetMapping("/me")
    public ResponseEntity<AppUserInfoDto> getMe(){
        return ResponseEntity.ok(AppUserInfoDto.builder().build());
    }
}
