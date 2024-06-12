package com.example.demo.dto.response;

import lombok.*;


@Getter
    @Setter
    @NoArgsConstructor
    @Builder
    @AllArgsConstructor
    public class UserResponseSql {
        private Integer id;
        private String username;
        private String firstName;
    }

