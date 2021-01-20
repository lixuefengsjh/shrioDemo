package com.lxf.entity.vo;

import lombok.Data;

import java.util.Set;

/**
 * @author: lxf
 * @create: 2021-01-20 15:54
 * @description:
 */
@Data
public class UserRoleVo {
    private Long roleId;

    private String roleName;

    private Set<MenuVo> menu;
}
