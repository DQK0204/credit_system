package com.CreditSystem.pojo;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.util.Date;

@Data
@TableName("operator")
public class Operator {
    @TableId
    private Integer operator_id;
    private String phone_number;
    private String password;
    private String email;
    private String name;
    private Date signup_time;
    private Integer state;
    private Integer pawn_authority;
    private Integer risk_authority;
    private Integer faith_authority;
    private Integer review_authority;
    private Integer loan_authority;
    private Integer blacklist_authority;

    public Integer getOperator_id() {
        return operator_id;
    }

    public void setOperator_id(Integer operator_id) {
        this.operator_id = operator_id;
    }

    public String getPhone_number() {
        return phone_number;
    }

    public void setPhone_number(String phone_number) {
        this.phone_number = phone_number;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getSignup_time() {
        return signup_time;
    }

    public void setSignup_time(Date signup_time) {
        this.signup_time = signup_time;
    }

    public Integer getState() {
        return state;
    }

    public void setState(Integer state) {
        this.state = state;
    }

    public Integer getPawn_authority() {
        return pawn_authority;
    }

    public void setPawn_authority(Integer pawn_authority) {
        this.pawn_authority = pawn_authority;
    }

    public Integer getRisk_authority() {
        return risk_authority;
    }

    public void setRisk_authority(Integer risk_authority) {
        this.risk_authority = risk_authority;
    }

    public Integer getFaith_authority() {
        return faith_authority;
    }

    public void setFaith_authority(Integer faith_authority) {
        this.faith_authority = faith_authority;
    }

    public Integer getReview_authority() {
        return review_authority;
    }

    public void setReview_authority(Integer review_authority) {
        this.review_authority = review_authority;
    }

    public Integer getLoan_authority() {
        return loan_authority;
    }

    public void setLoan_authority(Integer loan_authority) {
        this.loan_authority = loan_authority;
    }

    public Integer getBlacklist_authority() {
        return blacklist_authority;
    }

    public void setBlacklist_authority(Integer blacklist_authority) {
        this.blacklist_authority = blacklist_authority;
    }
}
