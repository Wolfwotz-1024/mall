package com.shking.mall.auth.controller;

import io.swagger.annotations.Api;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import springfox.documentation.service.TokenEndpoint;

/**
 * 自定义Oauth2获取令牌接口
 * @Author SHKing
 * @Date 20/3/2022 20:08
 * @Version 1.0
 */
@RestController
@Api(tags = "AuthController", description = "认证中心登录认证")
@RequestMapping("/oauth")
public class AuthController {

    @Autowired
    private TokenEndpoint tokenEndpoint;


}
