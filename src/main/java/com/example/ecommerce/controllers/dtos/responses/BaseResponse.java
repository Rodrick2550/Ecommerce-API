package com.example.ecommerce.controllers.dtos.responses;

import lombok.Builder;
import lombok.Getter;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

@Builder
@Getter
public class BaseResponse {

    private HttpStatus status;

    private Integer statusCode;

    private Object data;

    private String message;

    private Boolean success;

    private HttpStatus httpStatus;


}
