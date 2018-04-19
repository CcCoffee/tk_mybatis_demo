package com.zhengkehui.mybatis.helloworld.service;

import com.zhengkehui.mybatis.helloworld.bean.Country;

/**
 * @Author zhengkehui
 * @Date 2018/4/19 22:14
 * @Description
 */
public interface CountryService {

    Country selectByPrimaryKey(Integer id);
    Country selectByPrimaryKey(Country query);
    Country selectByCountryName(String countryName);
}
