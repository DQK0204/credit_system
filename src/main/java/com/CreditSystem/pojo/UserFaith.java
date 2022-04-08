package com.CreditSystem.pojo;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

@Data
@TableName("user_faith")
public class UserFaith {
    @TableId
    private int user_id;
    private int illegal_record;
    private int loan_record;
    private int outstanding_loan_record;
    private int faith_addition;

}