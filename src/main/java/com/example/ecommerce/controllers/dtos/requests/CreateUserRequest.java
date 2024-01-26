package com.example.ecommerce.controllers.dtos.requests;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class CreateUserRequest {


    private String email;

    private String password;

    private String name;

    private String lastName;

    private String phone;
}
