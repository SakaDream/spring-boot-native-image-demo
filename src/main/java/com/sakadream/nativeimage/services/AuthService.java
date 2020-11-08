package com.sakadream.nativeimage.services;

import com.sakadream.nativeimage.dto.LoginDto;
import com.sakadream.nativeimage.dto.MessageDto;
import com.sakadream.nativeimage.dto.TokenDto;
import com.sakadream.nativeimage.dto.UserDto;

public interface AuthService {

    MessageDto signup(UserDto userDto);
    TokenDto login(LoginDto loginDto);
    MessageDto logout(String username);
    
}
