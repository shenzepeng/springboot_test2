package com.example.springboot_test2.controller;

import com.example.springboot_test2.common.SzpJsonResult;
import com.example.springboot_test2.pojo.User;
import com.example.springboot_test2.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Auther: szp
 * @Date: 2020/1/6 20:47
 * @Description: 沈泽鹏写点注释吧
 */
@RestController
public class UserController {

    @Autowired
    private UserService userService;
    @PostMapping("add/user")
    public SzpJsonResult<Integer> addUser(@RequestBody User user){
        Integer result = userService.addUser(user);
        return SzpJsonResult.ok(result);
    }

    @GetMapping("all/user")
    public SzpJsonResult<User> getAllUser(Integer pageSize,Integer pageNumber){
        return SzpJsonResult.ok(userService.findAllUser(pageSize,pageNumber));
    }

}
