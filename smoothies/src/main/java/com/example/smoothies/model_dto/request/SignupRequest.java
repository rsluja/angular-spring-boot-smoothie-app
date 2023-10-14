package com.example.smoothies.model_dto.request;

import lombok.Builder;
import lombok.Data;

import java.util.Set;

@Data
@Builder
public class SignupRequest {
    String username;
    String email;
    String password;
    Set<String> roles;
}
