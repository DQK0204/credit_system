package com.CreditSystem.Service.UserService;

import com.CreditSystem.common.Result;
import com.CreditSystem.pojo.User;

public interface UserLoginService {
    //1注册 --（已实现）
    Result signup(User user);

    //2登录 --（已实现）
    Result signin(int user_id, String password);
}
