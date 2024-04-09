package com.yang.community.dao;

import com.yang.community.entity.DiscussPost;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface DiscussPostMapper {

    List<DiscussPost> pageQuery();
}
