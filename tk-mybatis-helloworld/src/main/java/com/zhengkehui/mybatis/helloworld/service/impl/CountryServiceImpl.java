package com.zhengkehui.mybatis.helloworld.service.impl;

import com.zhengkehui.mybatis.helloworld.bean.Country;
import com.zhengkehui.mybatis.helloworld.mapper.CountryMapper;
import com.zhengkehui.mybatis.helloworld.service.CountryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @Author zhengkehui
 * @Date 2018/4/19 22:14
 * @Description
 */
@Service
public class CountryServiceImpl implements CountryService {

    @Autowired
    private CountryMapper countryMapper;

    @Override
    public Country selectByPrimaryKey(Integer id){
        return countryMapper.selectByPrimaryKey(id);
    }

    @Override
    public Country selectByPrimaryKey(Country query) {
        return countryMapper.selectByPrimaryKey(query);
    }

    @Override
    public Country selectByCountryName(String countryName) {
        return countryMapper.selectByCountryName(countryName);
    }

}
