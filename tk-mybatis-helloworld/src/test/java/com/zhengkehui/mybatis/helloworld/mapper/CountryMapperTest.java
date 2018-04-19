package com.zhengkehui.mybatis.helloworld.mapper;

import com.zhengkehui.mybatis.helloworld.bean.Country;
import org.apache.ibatis.session.RowBounds;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

import static org.junit.Assert.*;

/**
 * @Author zhengkehui
 * @Date 2018/4/20 0:07
 * @Description
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class CountryMapperTest {

    @Autowired
    private CountryMapper countryMapper;

    @Test
    public void selectByCountryName() {
    }

    @Test
    public void insertCountry() {
        Country country = new Country();
        country.setCountrycode("11");
        country.setCountryname("爪哇");
        Assert.assertEquals(1l,countryMapper.insert(country));
        System.out.println("【获取的id】"+country.getId());
    }

    @Test
    public void selectAll() {
        RowBounds rowBounds = new RowBounds();
        List<Country> countries = countryMapper.selectAll(rowBounds);
        Assert.assertNotEquals(0,countries.size());
    }
}