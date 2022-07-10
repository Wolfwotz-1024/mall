package com.shking.mall.common.domain;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import java.util.List;

/**
 * 登录用户信息
 */
@Data
@EqualsAndHashCode
@NoArgsConstructor
public class UserDto {

    private Long id;
    private String username;
    private String password;
    private Integer status;
    private String clientId;
    private List<String> role;
}