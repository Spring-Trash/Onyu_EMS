package com.ssafy.ems.user.service;

import com.ssafy.ems.user.domain.User;

import java.util.List;

public interface UserService {
    public User getUser(String userId);
    public List<User> getUserList();
    public boolean insertUser(User user);
    public boolean updateUser(User user);
    public boolean deleteUser(String userId);

}
