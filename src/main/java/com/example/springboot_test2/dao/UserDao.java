package com.example.springboot_test2.dao;

import com.example.springboot_test2.mapper.UserMapper;
import com.example.springboot_test2.pojo.User;
import com.example.springboot_test2.pojo.UserExample;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;
import org.w3c.dom.stylesheets.LinkStyle;

import java.util.List;

/**
 * @Auther: szp
 * @Date: 2020/1/6 20:45
 * @Description: 沈泽鹏写点注释吧
 */
@Repository
public class UserDao {
    @Autowired
    private UserMapper userMapper;

    public Integer addUser(User user){
        return userMapper.insert(user);
    }

    public List<User> findAll(){
        UserExample userExample=new UserExample();
        return userMapper.selectByExample(userExample);
    }
}
