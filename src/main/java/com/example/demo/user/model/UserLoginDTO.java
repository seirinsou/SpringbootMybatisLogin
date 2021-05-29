package com.example.demo.user.model;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

public class UserLoginDTO {

    @NotBlank
    @Size(min = 3, max = 20)
    private String userName;
    
    @NotBlank
    @Size(min = 6, max = 10)
    private String password;
    
    
    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

}
