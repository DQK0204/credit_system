package com.CreditSystem.Service.UserService;

import com.CreditSystem.common.Result;
import com.CreditSystem.pojo.Pawn;
import com.CreditSystem.pojo.User;
import com.CreditSystem.pojo.UserFaith;
import com.CreditSystem.pojo.UserRisk;

import java.util.List;

public interface PawnService {

    //9	查看个人押品列表
    Result<List<Pawn>> getMyPawnList(int user_id);

    //10	查看个人押品信息
    Result<Pawn> getMyPawnInformation(int pawn_id);

    //11	修改个人押品信息
    Result updateMyPawnInformation(int pawn_id);

    //12	新增个人押品
    Result addMyPawn(Pawn pawn);

    //13	删除个人押品
    Result deleteMyPawn(int pawn_id);
}
