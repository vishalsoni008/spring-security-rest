package com.springsecurity.request;

import lombok.Data;

@Data
public class UserRequest {
    private String name;

    private String email;

    private String password;
}
