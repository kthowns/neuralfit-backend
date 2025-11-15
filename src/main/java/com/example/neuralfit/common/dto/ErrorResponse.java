package com.example.neuralfit.common.dto;

import lombok.*;

import java.util.HashMap;

@Getter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@ToString
public class ErrorResponse {
    private Integer status;
    private String message;
    private HashMap<String, String> errors;
}
