package com.example.ecommerce.controllers.dtos.responses;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class UserResponse {

    private Long id;

    private String email;

    private String password;

    private String name;

    private String lastName;

    private String phone;


}
