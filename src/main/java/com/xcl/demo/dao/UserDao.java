package com.xcl.demo.dao;

import com.xcl.demo.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * UserDao
 *
 * @author xcl
 * @date 2018/8/15 20:01
 */
public interface UserDao extends JpaRepository<User, String> {

    /**
     * 根据id查找记录
     * @param id
     * @return
     */
    User findById(Long id);
}
