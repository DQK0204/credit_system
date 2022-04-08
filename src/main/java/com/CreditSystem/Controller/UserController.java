package com.CreditSystem.Controller;

import com.CreditSystem.Service.UserService.LoanService;
import com.CreditSystem.Service.UserService.PawnService;
import com.CreditSystem.Service.UserService.SelfInformationService;
import com.CreditSystem.Service.UserService.UserLoginService;
import com.CreditSystem.common.Result;
import com.CreditSystem.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/user")
public class UserController {

    @Autowired
    private LoanService loanService;

    @Autowired
    private PawnService pawnService;

    @Autowired
    private SelfInformationService selfInformationService;

    @Autowired
    private UserLoginService userLoginService;
    /*
    *0  1  2为样例代码，你们仿照着写
    *
    * 浏览器中访问后端无参接口路径方法：url例:   http://localhost:8085/user/hello
    *
    * 浏览器中访问后端有参接口路径方法：url例:   http://localhost:8085/user/login/signin?user_id=201892256&password=123456
    *
    * 浏览器中访问后端有参接口路径方法：（当参数是一个对象时）下载postman  app，用该app进行传参
    *
    * 注意接口路径的设计方式，已经在浏览器中，和在前端中的调用方式
     * */

    //0 web测试 --(已完成)
    @RequestMapping("/hello")
    @ResponseBody
    public  String hello(){
        return "hello word";
    }

    //1用户注册 --(已完成)
    @RequestMapping("/login/signup")
    @ResponseBody
    public Result signup(@RequestBody User user){
        return userLoginService.signup(user);
    }

    //2用户登录 --(已完成)
    @RequestMapping("/login/signin")
    @ResponseBody
    public  Result signin(@RequestParam(value = "user_id",required = true)int user_id,
                          @RequestParam(value = "password",required = true)String password){
        return userLoginService.signin(user_id,password);
    }
}
