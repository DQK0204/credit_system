package com.CreditSystem.pojo;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.util.Date;

    @Data
    @TableName("blacklist")
    public class BlackList {
    @TableId
    private Integer blacklist_id;
    private Integer user_id;
    private String user_name;
    private Integer operation;
    private Date  operation_time;
    private Integer operator_id;
    private String operator_name;
    private String record_description;
}
