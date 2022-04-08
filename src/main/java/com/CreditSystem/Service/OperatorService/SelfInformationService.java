package com.CreditSystem.Service.OperatorService;

import com.CreditSystem.common.Result;
import com.CreditSystem.pojo.Operator;

public interface SelfInformationService {
    //2	查看个人基本信息
    Result getMyInformation(int  operator_id);

    //3	修改个人基本信息
    Result updateMyInformation(Operator operator);
}
