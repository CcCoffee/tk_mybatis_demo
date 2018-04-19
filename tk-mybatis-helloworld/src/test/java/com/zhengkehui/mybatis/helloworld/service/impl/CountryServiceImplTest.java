package com.zhengkehui.mybatis.helloworld.service.impl;

import com.zhengkehui.mybatis.helloworld.bean.Country;
import com.zhengkehui.mybatis.helloworld.service.CountryService;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.*;

/**
 * @Author zhengkehui
 * @Date 2018/4/19 22:17
 * @Description
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class CountryServiceImplTest {

    @Autowired
    private CountryService countryService;

    @Test
    public void selectByPrimaryKey() {
        Country country = countryService.selectByPrimaryKey(1);
        Assert.assertEquals(1L,(long)country.getId());
    }
    @Test
    public void selectByPrimaryKey2() {
        Country query = new Country();
        query.setId(2);
        Country country = countryService.selectByPrimaryKey(query);
        Assert.assertEquals(2L,(long)country.getId());
    }

    @Test
    public void selectByCountryName(){
        Country country = countryService.selectByCountryName("中国");
        Assert.assertEquals("中国",country.getCountryname());
    }
}