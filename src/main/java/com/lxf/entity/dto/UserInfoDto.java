package com.lxf.entity.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author: lxf
 * @create: 2021-01-20 15:30
 * @description:
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class UserInfoDto {
    private  String userName;
    private  String userPassWord;
}
