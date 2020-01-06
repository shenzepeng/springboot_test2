package com.example.springboot_test2.service;

import io.swagger.models.auth.In;

/**
 * @Auther: szp
 * @Date: 2020/1/6 21:46
 * @Description: 沈泽鹏写点注释吧
 */
public interface MoneyService {
    Integer increaseMoney(Long id,Double money);
    Integer discreaseMoney(Long id,Double money);
}
