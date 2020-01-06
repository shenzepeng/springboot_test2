package com.example.springboot_test2.service.impl;

import com.example.springboot_test2.dao.UserDao;
import com.example.springboot_test2.pojo.User;
import com.example.springboot_test2.service.UserService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Auther: szp
 * @Date: 2020/1/6 20:44
 * @Description: 沈泽鹏写点注释吧
 */
@Slf4j
@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserDao userDao;
    @Override
    public Integer addUser(User user) {
        return userDao.addUser(user);
    }

    @Override
    public List<User> findAllUser(Integer pageSize,Integer pageNumber) {
        //开始分页，必须写在上面
        PageHelper.startPage(pageNumber,pageSize);
        List<User> all = userDao.findAll();
        PageInfo<User> pageInfo=new PageInfo<>(all);
        log.info("all-{}",all);
        log.info("pageInfo.getList()-{}",pageInfo.getList());
        log.info("pagesize-{},pageNumber-{}",pageSize,pageNumber);
        return pageInfo.getList();
    }
}
