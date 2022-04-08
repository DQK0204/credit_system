package com.CreditSystem.Service.AdminService;

import com.CreditSystem.common.Result;
import com.CreditSystem.pojo.Notice;
import com.CreditSystem.pojo.Operator;
import com.CreditSystem.pojo.User;
import org.springframework.stereotype.Service;

import java.util.List;

/*（样例代码）
 *函数用于帮助你们理解springboot的三层架构，你们可以参照来写其他函数
 *
 *
 * 你们在写的时候多考虑考虑可能出现的错误类型
 * 错误类型码讨论统一:
 * 已被占用：400
 * 在数据库中没有找到：404
 * 有其他类型错误，大家统一讨论一下
 * */
@Service
public class AdminServiceImpl implements OperatorManageService,UserManageService, NoticeManageService, LoginService {


    @Override
    public Result signin(int admin_id, String password) {
        return null;
    }

    @Override
    public Result<List<Notice>> getNoticeList() {
        return null;
    }

    @Override
    public Result addNotice(Notice notice) {
        return null;
    }

    @Override
    public Result updateNotice(int notice_id) {
        return null;
    }

    @Override
    public Result hideNotice(int notice_id) {
        return null;
    }

    @Override
    public Result showNotice(int notice_id) {
        return null;
    }

    @Override
    public Result deleteNotice(int notice_id) {
        return null;
    }

    @Override
    public Result createOperator(Operator operator) {
        return null;
    }

    @Override
    public Result changeOperatorAuthority(Operator operator) {
        return null;
    }

    @Override
    public Result frozenOperator(int operator_id) {
        return null;
    }

    @Override
    public Result<List<Operator>> getOperatorList() {
        return null;
    }

    @Override
    public Result<List<User>> getUserList() {
        return null;
    }
}
