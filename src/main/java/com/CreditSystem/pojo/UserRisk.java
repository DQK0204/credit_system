package com.CreditSystem.pojo;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;
@Data
@TableName("user_risk")
public class UserRisk {
    @TableId
    private Integer user_id;
    private Integer stable_work;
    private Integer marriage;
    private Integer annual_income;
    private Integer education;
    private Integer shopping_time;
    private Integer financial_products;
    private Integer gambling;
    private String risk_addition;
}