package com.xcl.demo.service;

import com.xcl.demo.model.User;

/**
 * UserService
 *
 * @author xcl
 * @date 2018/8/15 20:00
 */
public interface UserService {
    User findUser(Long id);
}
