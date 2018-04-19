package com.zhengkehui.mybatis.helloworld.bean;

import tk.mybatis.mapper.annotation.KeySql;
import tk.mybatis.mapper.code.IdentityDialect;
import tk.mybatis.mapper.code.ORDER;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 * @Author zhengkehui
 * @Date 2018/4/19 22:22
 * @Description
 */
public class Country {

    @Id
    //@GeneratedValue(generator = "JDBC",strategy = GenerationType.IDENTITY)
    @KeySql(dialect = IdentityDialect.MYSQL)
    private Integer id;
    private String  countryname;
    private String  countrycode;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCountryname() {
        return countryname;
    }

    public void setCountryname(String countryname) {
        this.countryname = countryname;
    }

    public String getCountrycode() {
        return countrycode;
    }

    public void setCountrycode(String countrycode) {
        this.countrycode = countrycode;
    }
}