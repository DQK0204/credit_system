package com.CreditSystem.Service.OperatorService;

import com.CreditSystem.common.Result;

public interface LoanManageService {
    //4	押品估价
    Result valuatePawn(int pawn_id, int valuation);

    //5	押品评估
    Result gradePawn(int operator_id,int pawn_id,int pawn_grade);

    //6	风险评估
    Result gradeRisk(int operator_id,int pawn_id,int risk_grade);

    //7	诚信评估
    Result gradeFaith(int operator_id,int pawn_id,int faith_grade);

    //8	复审
    Result review(int operator_id, int pawn_id);

    //9	放款
    Result giveLoan(int operator_id, int pawn_id);
}
