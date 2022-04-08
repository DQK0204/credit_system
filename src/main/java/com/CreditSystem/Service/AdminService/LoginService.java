package com.CreditSystem.Service.AdminService;

import com.CreditSystem.common.Result;
import com.CreditSystem.pojo.Notice;
import com.CreditSystem.pojo.Operator;
import com.CreditSystem.pojo.User;


import java.util.List;

public interface LoginService {
    //12 系统管理员登录
    Result signin(int admin_id, String password);
}
