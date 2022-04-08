package com.CreditSystem.Service.OperatorService;

import com.CreditSystem.common.Result;
import com.CreditSystem.pojo.Loan;
import com.CreditSystem.pojo.User;

import java.util.List;

public interface QueryService {
    //--0--查看全部用户  --（已实现）--(测试)
    Result<List<User>> queryUserList();

    //12	查看我初审理过的贷款列表
    Result<List<Loan>> getLoanPreviewByMe(int operator_id);

    //13	查看我复审理过的贷款列表
    Result<List<Loan>> getLoanReviewByMe(int operator_id);

    //14	查看我放款过的贷款列表
    Result<List<Loan>> getLoanGiveByMe(int operator_id);

    //15	查看贷款申请信息
    Result <Loan> getLoanInformation(int loan_id);

    //--16--	按id查找用户 --(已实现)--
     Result<User> queryUserById(int user_id);

    //17	按姓名查找用户
    Result<User> queryUserByName(int user_name);
}
