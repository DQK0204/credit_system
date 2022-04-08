package com.CreditSystem.pojo;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;
import java.util.Date;
@Data
@TableName("notice")
public class Notice {
    @TableId
    private Integer notice_id;
    private String notice_title;
    private String notice_content;
    private Date publish_time;
    private Integer state;
}