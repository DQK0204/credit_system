package com.CreditSystem.Service.OperatorService;

import com.CreditSystem.common.Result;

public interface LoginService {
    //1	工作员登录
    Result signin(int operator_id, String password);
}
