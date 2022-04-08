package com.CreditSystem.Service.UserService;

import com.CreditSystem.common.Result;
import com.CreditSystem.pojo.*;

import java.util.List;

public interface LoanService {

    //14	查看个人贷款申请列表
    Result<List<Loan>> getMyLoanList(int user_id);

    //15	查看个人贷款申请信息
    Result<Loan> getMyLoanInformation(int loan_id);

    //16	贷款申请
    Result loanApplication(Loan loan);

    //17 将押品绑定到贷款申请上
    Result addLoanPawnRecord(int loan_id,int pawn_id);

    //18 将押品与贷款申请解绑
    Result deleteLoanPawnRecord(int loan_id,int pawn_id);

    //19	取消贷款申请
    Result cancelLoanApplication(int loan_id);

    //20	还款
    Result repayment(int loan_id);
}
