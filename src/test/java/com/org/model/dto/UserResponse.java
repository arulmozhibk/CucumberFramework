package com.org.model.dto;


import com.org.model.User;
import com.org.model.Status;
import org.jetbrains.annotations.NotNull;

public class UserResponse {


    public Status status;


    public User userInfo;

    public UserResponse() {
    }


    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    public User getUserInfo() {
        return userInfo;
    }

    public void setUserInfo(User userInfo) {
        this.userInfo = userInfo;
    }

    @NotNull
    @Override
    public String toString() {
        return "UserResponse{" +
                "status=" + status +
                ", userInfo=" + userInfo +
                '}';
    }
}
