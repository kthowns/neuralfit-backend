package com.example.neuralfit.common.dto;

import com.example.neuralfit.common.entity.AppUser;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;

import java.time.LocalDateTime;

@Getter
@AllArgsConstructor
@Builder
public class AppUserInfoDto {
    private final Integer id;
    private final String email;
    private final String name;
    private final LocalDateTime createdAt;
    private final LocalDateTime updatedAt;

    public AppUserInfoDto fromEntity(AppUser appUser) {
        return AppUserInfoDto.builder()
                .id(appUser.getId())
                .email(appUser.getEmail())
                .name(appUser.getName())
                .createdAt(appUser.getCreatedAt())
                .updatedAt(appUser.getUpdatedAt())
                .build();
    }
}
