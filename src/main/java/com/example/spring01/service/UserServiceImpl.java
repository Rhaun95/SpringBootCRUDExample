package com.example.spring01.service;


import com.example.spring01.Mapper.UserMapper;
import com.example.spring01.dto.UserDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl  implements UserService{
    @Autowired
    private UserMapper uMapper;

    @Override
    public boolean login(String userId, String userPw) {
        UserDto user = uMapper.selectOneUser(userId);
        if(user!=null){
            if(user.getPsw().equals(userPw))
                return true;
        }
        return false;
    }

    @Override
    public boolean join(UserDto user) {

        if(uMapper.selectOneUser(user.getId())==null){
            uMapper.insertUser(user);
            return true;
        }else
        return false;
    }

    @Override
    public void modify(UserDto user) {
        uMapper.updateUser(user);
    }

    @Override
    public void withdraw(String userId) {
        uMapper.deleteUser(userId);
    }

    @Override
    public UserDto getUser(String userId) {
        return uMapper.selectOneUser(userId);
    }

    @Override
    public List<UserDto> getUserList() {
        return uMapper.selectAllUsers();
    }
}
