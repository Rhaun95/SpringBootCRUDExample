package com.example.spring01.service;

import com.example.spring01.dto.UserDto;

import java.util.List;

public interface UserService {
    public boolean login (String userId, String userPw);
    public boolean join (UserDto user);
    public void modify(UserDto user);
    public void withdraw(String userId);
    public UserDto getUser(String userId);
    public List<UserDto> getUserList();

}
