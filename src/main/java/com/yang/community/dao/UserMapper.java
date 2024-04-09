package com.yang.community.dao;

import com.yang.community.entity.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface UserMapper {


    @Select("select * from user where id=#{id}")
    User selectById(int id);
}
