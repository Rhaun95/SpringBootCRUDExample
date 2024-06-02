package com.example.spring01.Mapper;



import com.example.spring01.dto.UserDto;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface UserMapper {
    public void insertUser(UserDto user);
    public void updateUser(UserDto user);
    public void deleteUser(String userId);
    public UserDto selectOneUser(String userId);
    public List<UserDto> selectAllUsers();

}
