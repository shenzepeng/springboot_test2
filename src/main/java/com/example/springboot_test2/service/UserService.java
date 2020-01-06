package com.example.springboot_test2.service;

import com.example.springboot_test2.pojo.User;
import io.swagger.models.auth.In;

import java.util.List;

/**
 * @Auther: szp
 * @Date: 2020/1/6 20:43
 * @Description: 沈泽鹏写点注释吧
 */
public interface UserService {
    Integer addUser(User user);
    List<User> findAllUser(Integer pageSize,Integer pageNumber);
}
