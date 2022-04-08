package com.CreditSystem.Service.AdminService;

import com.CreditSystem.common.Result;
import com.CreditSystem.pojo.User;

import java.util.List;

public interface UserManageService {

    //5	查看用户列表
    Result<List<User>> getUserList();
}
