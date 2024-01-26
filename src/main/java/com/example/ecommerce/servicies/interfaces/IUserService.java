package com.example.ecommerce.servicies.interfaces;

import com.example.ecommerce.controllers.dtos.requests.CreateUserRequest;
import com.example.ecommerce.controllers.dtos.requests.UpdateUserRequest;
import com.example.ecommerce.controllers.dtos.responses.BaseResponse;
import com.example.ecommerce.entities.User;

public interface IUserService {
    BaseResponse create (CreateUserRequest request);

    BaseResponse get(Long id);
    BaseResponse update(UpdateUserRequest request, Long id);

    BaseResponse delete(Long id);

    User findOneAndEnsureExistById(Long id);

}
