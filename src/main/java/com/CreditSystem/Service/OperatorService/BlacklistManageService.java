package com.CreditSystem.Service.OperatorService;

import com.CreditSystem.common.Result;

public interface BlacklistManageService {
    //10	将用户拉入黑名单
    Result enterBlacklist(int operator_id, int user_id);

    //11	将用户拉出黑名单
    Result dropBlacklist(int operator_id,int user_id);
}
