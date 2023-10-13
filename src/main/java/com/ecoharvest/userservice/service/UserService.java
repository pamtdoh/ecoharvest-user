package com.ecoharvest.userservice.service;

import com.ecoharvest.userservice.dto.*;
import com.ecoharvest.userservice.exception.UserException;
import com.ecoharvest.userservice.model.User;

import java.util.List;
import java.util.Optional;

public interface UserService {
    RegisterResDTO saveUser(RegisterReqDTO user);

    Optional<User> findByUsername(String username);

    List<User> retrieveUserList();

    UserDTO retrieveUserById(Long id) throws UserException;

    UpdateUserDetailsResDTO updateUserDetails(Long id, String name, String email, String contactNo) throws UserException;

    UpdateUserDetailsResDTO changePassword(Long id, String password) throws UserException;

    List<User> deleteUser(Long id) throws UserException;

    LoginResDTO signInAndReturnJWT(LoginReqDTO loginReqDTO);
}
