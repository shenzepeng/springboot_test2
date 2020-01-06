package com.example.springboot_test2;

import com.example.springboot_test2.pojo.Money;
import com.example.springboot_test2.service.MoneyService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.transaction.annotation.Transactional;

@SpringBootTest
class SpringbootTest2ApplicationTests {
    @Autowired
    private MoneyService moneyService;
    @Test
    @Transactional(rollbackFor = Exception.class)
    void contextLoads() {
        moneyService.discreaseMoney(1L,(double)100);
        moneyService.increaseMoney(2L,(double)100);
    }

}
