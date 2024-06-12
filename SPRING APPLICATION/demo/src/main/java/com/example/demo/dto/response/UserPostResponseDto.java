package com.example.demo.dto.response;

import lombok.*;


@Getter
    @Setter
    @NoArgsConstructor
    @Builder
    @AllArgsConstructor
    public class UserPostResponseDto {
        private Integer id;
        private String username;
        private String firstName;
    }

