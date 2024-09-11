package com.mayank.MayankHotel.service.interfac;


import com.mayank.MayankHotel.dto.LoginRequest;
import com.mayank.MayankHotel.dto.Response;
import com.mayank.MayankHotel.entity.User;

public interface IUserService {
    Response register(User user);

    Response login(LoginRequest loginRequest);

    Response getAllUsers();

    Response getUserBookingHistory(String userId);

    Response deleteUser(String userId);

    Response getUserById(String userId);

    Response getMyInfo(String email);

}

