package com.example.springboot_test2.service.impl;

import com.example.springboot_test2.dao.MoneyDao;
import com.example.springboot_test2.pojo.Money;
import com.example.springboot_test2.service.MoneyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @Auther: szp
 * @Date: 2020/1/6 21:47
 * @Description: 沈泽鹏写点注释吧
 */
@Service
public class MoneyServiceImpl implements MoneyService {
    @Autowired
    private MoneyDao moneyDao;
    @Override
    public Integer increaseMoney(Long id, Double money) {
        Money moneyDaoMoney = moneyDao.findMoney(id);
        moneyDaoMoney.setMoney(moneyDaoMoney.getMoney()+money);
        return moneyDao.updateMoney(moneyDaoMoney);
    }

    @Override
    public Integer discreaseMoney(Long id, Double money) {
        Money moneyDaoMoney = moneyDao.findMoney(id);
        moneyDaoMoney.setMoney(moneyDaoMoney.getMoney()-money);
        return moneyDao.updateMoney(moneyDaoMoney);
    }
}
