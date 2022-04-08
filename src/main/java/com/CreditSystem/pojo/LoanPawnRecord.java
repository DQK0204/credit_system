package com.CreditSystem.pojo;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

@Data
@TableName("loan_pawn_record")
public class LoanPawnRecord {
    @TableId
    private Integer record_id;
    private Integer loan_id;
    private Integer pawn_id;
    private Integer user_valuation;
    private Integer operator_valuation;
}