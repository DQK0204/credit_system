package com.CreditSystem.Service.UserService;

import com.CreditSystem.Mapper.UserMapper;
import com.CreditSystem.common.Result;
import com.CreditSystem.pojo.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
/*（样例代码）
 *函数用于帮助你们理解springboot的三层架构，你们可以参照来写其他函数
 *
 * 1用户注册
 *输入：Controller层提供用户对象
 *返回：Result 类对象
 *
 * 2用户登录
 * 输入：Controller层提供的账号，密码
 * 返回：Result 类对象
 *
 *
 * 你们在写的时候多考虑考虑可能出现的错误类型
 * 错误类型码讨论统一:
 * 已被占用：400
 * 在数据库中没有找到：404
 * 有其他类型错误，大家统一讨论一下
 * */
@Service
public class UserServiceImpl implements UserLoginService, SelfInformationService,PawnService,LoanService {
    @Autowired
    UserMapper userMapper;


    //1用户注册--（已完成）
    @Override
    public Result signup(User user){
        //如果传入的user对象的id 在数据库user表里里已经存在
        if(userMapper.selectById(user.getUser_id())!=null){
            //返回错误类型结果
            return Result.error("400","该ID已经被注册，请尝试其他ID");
        }
        //否则
        else {
            //将传入的数据对象加入数据库
            userMapper.insert(user);
            //返回正确类型结果
            return Result.success();
        }
    }

    //2用户登录--（已完成）
    @Override
    public Result signin(int user_Id, String password) {
        User user = userMapper.selectById(user_Id);
        //如果传入的参数user_id在数据库中有该用户存在
        if(user!=null) {
            //如果传入的user_id对应的数据库中的用户的密码与传入的密码相等
            if (user.getPassword().equals(password)) {
                return Result.success();
            }//否则
            else
                return Result.error("400","账号或密码错误");
        }
        //该id不存在
        else {
            return Result.error("404", "账号不存在");
        }
    }

    @Override
    public Result<User> getMyInformation(int user_id) {
        return null;
    }

    @Override
    public Result updateMyInformation(User user) {
        return null;
    }

    @Override
    public Result<UserRisk> getMyRiskInformation(int user_id) {
        return null;
    }

    @Override
    public Result updateMyRiskInformation(UserRisk userRisk) {
        return null;
    }

    @Override
    public Result<UserFaith> getMyFaithInformation(int user_id) {
        return null;
    }

    @Override
    public Result updateMyFaithInformation(UserFaith userFaith) {
        return null;
    }

    @Override
    public Result<List<Pawn>> getMyPawnList(int user_id) {
        return null;
    }

    @Override
    public Result<Pawn> getMyPawnInformation(int pawn_id) {
        return null;
    }

    @Override
    public Result updateMyPawnInformation(int pawn_id) {
        return null;
    }

    @Override
    public Result addMyPawn(Pawn pawn) {
        return null;
    }

    @Override
    public Result deleteMyPawn(int pawn_id) {
        return null;
    }

    @Override
    public Result<List<Loan>> getMyLoanList(int user_id) {
        return null;
    }

    @Override
    public Result<Loan> getMyLoanInformation(int loan_id) {
        return null;
    }

    @Override
    public Result loanApplication(Loan loan) {
        return null;
    }

    @Override
    public Result addLoanPawnRecord(int loan_id, int pawn_id) {
        return null;
    }

    @Override
    public Result deleteLoanPawnRecord(int loan_id, int pawn_id) {
        return null;
    }

    @Override
    public Result cancelLoanApplication(int loan_id) {
        return null;
    }

    @Override
    public Result repayment(int loan_id) {
        return null;
    }
}
