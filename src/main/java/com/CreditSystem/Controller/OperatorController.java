package com.CreditSystem.Controller;


import com.CreditSystem.common.Result;
import com.CreditSystem.pojo.Operator;
import com.CreditSystem.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import com.CreditSystem.Service.OperatorService.SelfInformationService;
import com.CreditSystem.Service.OperatorService.BlacklistManageService;
import com.CreditSystem.Service.OperatorService.LoginService;
import com.CreditSystem.Service.OperatorService.LoanManageService;
import com.CreditSystem.Service.OperatorService.QueryService;
import java.util.List;

@Controller
@RequestMapping("/operator")
public class OperatorController {

    @Autowired
    private BlacklistManageService blacklistManageService;

    @Autowired
    private LoanManageService loanManageService;

    @Autowired
    private LoginService loginService;

    @Autowired
    private QueryService queryService;

    @Autowired
    private SelfInformationService selfInformationService;
    /*
     *  1  2为样例代码，你们仿照着写
     *
     * 浏览器中访问后端无参接口路径方法：url例:   http://localhost:8085/operator/query/queryUserList
     *
     * 浏览器中访问后端有参接口路径方法：url例:   http://localhost:8085/operator/query/queryUserById?user_id=201892256
     *
     * 浏览器中访问后端有参接口路径方法：（当参数是一个对象时）下载postman  app，用该app进行传参
     *
     * 注意接口路径的设计方式，已经在浏览器中，和在前端中的调用方式
     *
     * */
    //1按id查询用户 --(已完成)
    @RequestMapping("/query/queryUserById")
    @ResponseBody
    public Result<User> queryUser(@RequestParam(value = "user_id",required = true) int user_id){
        return queryService.queryUserById(user_id);
    }

    //1按查询全部用户 --（已完成）
    @RequestMapping("/query/queryUserList")
    @ResponseBody
    public Result<List<User>> queryUserList(){
        return queryService.queryUserList();
    }
    //	工作员登录--（已完成）
    @RequestMapping("/login/signin")
    @ResponseBody
    public  Result signin(@RequestParam(value = "operator_id",required = true)int operator_id,
                          @RequestParam(value = "password",required = true)String password) {
        return loginService.signin(operator_id, password);
    }
    //2	查看个人基本信息--（已完成）
    @RequestMapping("/query/getMyInformation")
    @ResponseBody
    public Result getMyInformation(@RequestParam(value = "operator_id",required = true) int  operator_id){
        return selfInformationService.getMyInformation(operator_id);
    }

    //3	修改个人基本信息--（已完成）
    @RequestMapping("/me/updateMyInformation")
    @ResponseBody
    public Result updateMyInformation(@RequestBody Operator operator){
        return selfInformationService.updateMyInformation(operator);
    }
}
