package com.CreditSystem.pojo;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.util.Date;

@Data
@TableName("loan")
public class Loan {
    @TableId
    private Integer loan_id;
    private Integer user_id;
    private String user_name;
    private Integer user_card_id;
    private String user_phone_number;
    private Integer amount;
    private Date borrow_time;
    private String borrow_purpose;
    private Double interest_rate;
    private String guarantee_name;
    private Integer guarantee_card_id;
    private String guarantee_phone_number;
    private Date submit_time;
    private Integer state;

    private Integer pawn_sum_user_valuation;
    private Integer pawn_sum_operator_valuation;
    private Integer pawn_operator_id;
    private String pawn_operator_name;
    private Date pawn_trial_time;
    private Integer pawn_grade;

    private Integer risk_operator_id;
    private String risk_operator_name;
    private Date risk_trial_time;
    private Integer risk_grade;

    private Integer faith_operator_id;
    private String faith_operator_name;
    private Date faith_trial_time;
    private Integer faith_grade;

}