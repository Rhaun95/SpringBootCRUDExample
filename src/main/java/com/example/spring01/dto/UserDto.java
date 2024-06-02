package com.example.spring01.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.apache.ibatis.annotations.Mapper;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class UserDto {
    private String id;
    private String psw;
    private String name;
    private String gender;
    private String email;

    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }
    public String getPsw() {
        return psw;
    }
    public void setPsw(String psw) {
        this.psw = psw;
    }
    public String getName() {
        return name;
    }
    public void setName(String userName) {
        this.name = userName;
    }
    public String getGender() {
        return gender;
    }
    public void setGender(String userGender) {
        this.gender = userGender;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String userEmail) {
        this.email = userEmail;
    }
    public String toString() {
        return "UserDto [id=" +id + ",psw="+psw+"UserName="+name+"UserGender="+gender+"UserEmail="+email+"]";
    }
}
