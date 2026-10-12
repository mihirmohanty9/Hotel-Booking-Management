package com.hotelbooking.system.service;

import com.hotelbooking.system.dto.ProfileUpdateRequestDto;
import com.hotelbooking.system.dto.UserDto;
import com.hotelbooking.system.entity.User;

public interface UserService {

    User getUserById(Long id);

    void updateProfile(ProfileUpdateRequestDto profileUpdateRequestDto);

    UserDto getMyProfile();
}
