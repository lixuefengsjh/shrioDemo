package com.lxf.entity.vo;

import lombok.Data;

import java.util.Set;

/**
 * @author: lxf
 * @create: 2021-01-20 15:49
 * @description:
 */
@Data
public class UserInfoVo {

    private Long userId;

    private String userName;

    private String phonenumber;

    private String password;

    private String salt;

    private Set<UserRoleVo> ro;
}
