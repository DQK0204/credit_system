package com.CreditSystem.Service.OperatorService;

import com.CreditSystem.Mapper.OperatorMapper;
import com.CreditSystem.Mapper.UserMapper;
import com.CreditSystem.common.Result;
import com.CreditSystem.pojo.Loan;
import com.CreditSystem.pojo.Operator;
import com.CreditSystem.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
/*（样例代码）
 *函数用于帮助你们理解springboot的三层架构，你们可以参照来写其他函数
 *
 * 1按id搜索用户
 *输入：Controller层提供用户对象
 *返回：Result 类对象
 *
 ** 你们在写的时候多考虑考虑可能出现的错误类型
 * 错误类型码讨论统一:
 * 已被占用：400
 * 在数据库中没有找到：404
 * 有其他类型错误，大家统一讨论一下
 * */
@Service
public class OperatorServiceImpl implements LoginService,SelfInformationService,LoanManageService,BlacklistManageService,QueryService {
    @Autowired
    UserMapper userMapper;
    @Autowired
    OperatorMapper operatorMapper;
    //1按id搜索用户--（已完成）
    @Override
    public Result<User> queryUserById(int user_id) {
        User user = userMapper.selectById(user_id);
        if(user!=null){
            return Result.success(user);
        }else {
            return Result.error("404","未搜索到用户，请检查用户ID是否正确");
        }
    }

    @Override
    public Result<User> queryUserByName(int user_name) {
        return null;
    }

    //2查看全部用户  （已实现）
    @Override
    public Result<List<User>> queryUserList() {
        return Result.success(userMapper.selectList(null));
    }
    //	工作员登录  --（已完成）
    @Override
    public Result signin(int operator_id, String password) {
        Operator operator = operatorMapper.selectById(operator_id);
        //如果传入的参数user_id在数据库中有该用户存在
        if(operator!=null) {
            //如果传入的user_id对应的数据库中的用户的密码与传入的密码相等
            if (operator.getPassword().equals(password)) {
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
    //2	查看个人基本信息 --（已完成）
    @Override
    public Result getMyInformation(int operator_id) {
        Operator operator = operatorMapper.selectById(operator_id);
        if(operator!=null){
            return Result.success(operator);
        }else {
            return Result.error("404","未搜索到id，请检查ID是否正确");
        }
    }
    //3	修改个人基本信息--（已完成）
    @Override
    public Result updateMyInformation(Operator operator) {
        //将传入的数据对象加入数据库
        operatorMapper.updateById(operator);
        //返回正确类型结果
        return Result.success();
    }


    @Override
    public Result valuatePawn(int pawn_id, int valuation) {
        return null;
    }

    @Override
    public Result gradePawn(int operator_id, int pawn_id, int pawn_grade) {
        return null;
    }

    @Override
    public Result gradeRisk(int operator_id, int pawn_id, int risk_grade) {
        return null;
    }

    @Override
    public Result gradeFaith(int operator_id, int pawn_id, int faith_grade) {
        return null;
    }

    @Override
    public Result review(int operator_id, int pawn_id) {
        return null;
    }

    @Override
    public Result giveLoan(int operator_id, int pawn_id) {
        return null;
    }

    @Override
    public Result enterBlacklist(int operator_id, int user_id) {
        return null;
    }

    @Override
    public Result dropBlacklist(int operator_id, int user_id) {
        return null;
    }

    @Override
    public Result<List<Loan>> getLoanPreviewByMe(int operator_id) {
        return null;
    }

    @Override
    public Result<List<Loan>> getLoanReviewByMe(int operator_id) {
        return null;
    }

    @Override
    public Result<List<Loan>> getLoanGiveByMe(int operator_id) {
        return null;
    }

    @Override
    public Result<Loan> getLoanInformation(int loan_id) {
        return null;
    }
}
