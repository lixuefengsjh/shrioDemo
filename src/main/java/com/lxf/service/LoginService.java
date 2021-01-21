package com.lxf.service;

import com.lxf.entity.vo.UserInfoVo;
import com.lxf.mapper.SysUserMapper;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author: lxf
 * @create: 2021-01-20 15:47
 * @description:
 */
@Service
@Slf4j
public class LoginService {
    @Autowired
    private SysUserMapper sysUserMapper;


    public UserInfoVo getAllUserInfoByName(String userName){
        UserInfoVo userInfoVo= sysUserMapper.getAllUserInfoByName(userName);
        log.info("查询出来的 userInfoVo :{s%}",userInfoVo);
        return  userInfoVo;
    };
}
