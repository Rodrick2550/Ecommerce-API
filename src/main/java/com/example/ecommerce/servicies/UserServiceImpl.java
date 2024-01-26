package com.example.ecommerce.servicies;

import com.example.ecommerce.repositories.IUserRepository;
import com.example.ecommerce.servicies.interfaces.IRoleService;
import com.example.ecommerce.servicies.interfaces.IUserRoleService;
import com.example.ecommerce.servicies.interfaces.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

public class UserServiceImpl implements IUserService {

    @Autowired
    private IUserRepository repository;

    @Autowired
    private IRoleService roleService;

    @Autowired
    private IUserRoleService userRoleService;



}
