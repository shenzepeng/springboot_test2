package com.example.springboot_test2.dao;

import com.example.springboot_test2.mapper.MoneyMapper;
import com.example.springboot_test2.pojo.Money;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

/**
 * @Auther: szp
 * @Date: 2020/1/6 21:48
 * @Description: 沈泽鹏写点注释吧
 */
@Repository
public class MoneyDao {
    @Autowired
    private MoneyMapper moneyMapper;

    public Integer updateMoney(Money money){
        return moneyMapper.updateByPrimaryKeySelective(money);
    }

    public Money findMoney(Long id){
        return moneyMapper.selectByPrimaryKey(id);
    }
}
