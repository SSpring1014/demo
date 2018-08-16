package com.xcl.demo.service.impl;

import com.xcl.demo.dao.UserDao;
import com.xcl.demo.model.User;
import com.xcl.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * UserServiceImpl
 *
 * @author xcl
 * @date 2018/8/15 20:00
 */
@Service
@Transactional(rollbackFor = Exception.class)
public class UserServiceImpl implements UserService {
    @Autowired
    private UserDao userDao;

    @Override
    public User findUser(Long id) {
        return userDao.findById(id);
    }
}
