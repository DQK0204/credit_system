package com.CreditSystem.Service.AdminService;

import com.CreditSystem.common.Result;
import com.CreditSystem.pojo.Operator;

import java.util.List;

public interface OperatorManageService {
    //1	生成系统工作员账号
    Result createOperator(Operator operator);

    //2	更改系统工作员权限
    Result changeOperatorAuthority(Operator operator);

    //3	冻结系统工作员账号
    Result frozenOperator(int operator_id);

    //4	查看系统工作员列表
    Result<List<Operator>> getOperatorList();
}
