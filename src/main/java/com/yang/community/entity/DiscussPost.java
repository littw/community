package com.yang.community.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class DiscussPost {
    private int id;  //帖子的id
    private int userId; //评论人的id
    private String title;  //标题
    private String content;  //内容
    private int type; //类型 0:普通 1：置顶
    private int status; //状态 0:正常 1:精华 2:拉黑
    private Date createTime;  //创建时间
    private int commentCount; //评论数量
    private double score; //帖子的得分，用于以后的热排名
}
