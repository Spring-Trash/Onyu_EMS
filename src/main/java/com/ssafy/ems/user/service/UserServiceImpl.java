package com.ssafy.ems.user.service;

import com.ssafy.ems.user.domain.User;
import com.ssafy.ems.user.domain.UserDao;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    private final UserDao userDao;

    public UserServiceImpl(UserDao userDao) {
        this.userDao = userDao;
    }

    @Override
    public User getUser(String userId) {
        List<User> users = userDao.selectByUserId(userId);
        if(!users.isEmpty()) return users.get(0);
        return null;
    }

    @Override
    public List<User> getUserList() {
        return userDao.select();
    }

    @Override
    public boolean insertUser(User user) {
        int result = userDao.insert(user);
        return result == 1 ? true : false;
    }

    @Override
    public boolean updateUser(User user) {
        int result = userDao.update(user);
        return result == 1 ? true : false;
    }

    @Override
    public boolean deleteUser(String userId) {
        int result = userDao.delete(userId);
        return result == 1 ? true : false;
    }
}
