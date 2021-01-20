package com.lxf.controller;

import com.lxf.entity.dto.UserInfoDto;
import com.lxf.service.LoginService;
import lombok.extern.slf4j.Slf4j;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.UnknownAccountException;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.authz.AuthorizationException;
import org.apache.shiro.subject.Subject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author: lxf
 * @create: 2021-01-20 10:58
 * @description:
 */
@RestController
@RequestMapping("/login")
@Slf4j
public class LoginController {
    @Autowired
    private LoginService loginService;

    @RequestMapping("/test")
    public String login(@RequestBody UserInfoDto user ){
        loginService.getAllUserInfoByName(user.getUserName());
//        if(StringUtils.isEmpty(user.getUserName())
//                ||
//                StringUtils.isEmpty(user.getUserPassWord())){
//            return "用户名或者密码不能为空";
//        };
//        Subject subject = SecurityUtils.getSubject();
//        UsernamePasswordToken usernamePasswordToken = new UsernamePasswordToken(
//                user.getUserName(),
//                user.getUserPassWord()
//        );
//        try {
//            //进行验证，这里可以捕获异常，然后返回对应信息
//            subject.login(usernamePasswordToken);
//        } catch (UnknownAccountException e) {
//            log.error("用户名不存在！", e);
//            return "用户名不存在！";
//        } catch (AuthenticationException e) {
//            log.error("账号或密码错误！", e);
//            return "账号或密码错误！";
//        } catch (AuthorizationException e) {
//            log.error("没有权限！", e);
//            return "没有权限";
//        }
        return  "登陆成功";
    }
}
