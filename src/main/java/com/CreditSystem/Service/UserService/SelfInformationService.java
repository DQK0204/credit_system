package com.CreditSystem.Service.UserService;

import com.CreditSystem.common.Result;
import com.CreditSystem.pojo.User;
import com.CreditSystem.pojo.UserFaith;
import com.CreditSystem.pojo.UserRisk;

public interface SelfInformationService {
    //3	查看个人基本信息
    Result<User> getMyInformation(int user_id);

    //4	修改个人基本信息
    Result updateMyInformation(User user);

    //5	查看个人风险信息
    Result<UserRisk> getMyRiskInformation(int user_id);

    //6	修改个人风险信息
    Result updateMyRiskInformation(UserRisk userRisk);

    //7	查看个人诚信信息
    Result<UserFaith> getMyFaithInformation(int user_id);

    //8	修改个人诚信信息
    Result updateMyFaithInformation(UserFaith userFaith);
}
