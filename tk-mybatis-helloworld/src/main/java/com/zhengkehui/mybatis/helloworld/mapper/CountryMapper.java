package com.zhengkehui.mybatis.helloworld.mapper;

import com.zhengkehui.mybatis.helloworld.bean.Country;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.session.RowBounds;
import tk.mybatis.mapper.annotation.NameStyle;
import tk.mybatis.mapper.code.Style;
import tk.mybatis.mapper.common.Mapper;

import java.util.List;

@NameStyle(Style.camelhumpAndUppercase)
public interface CountryMapper extends Mapper<Country> {

    //@Select("select * from country where countryname = #{countryname}")
    Country selectByCountryName(String countryname);

    List<Country> selectAll(RowBounds rowBounds);
}