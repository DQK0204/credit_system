package com.CreditSystem.pojo;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

@Data
@TableName("pawn")
public class Pawn {
    @TableId
    private Integer pawn_id;
    private Integer owner_id;
    private String name;
    private String description;
    private Integer user_valuation;
    private Integer operator_valuation;
    private Integer state;

}
