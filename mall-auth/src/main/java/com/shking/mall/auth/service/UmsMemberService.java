package com.shking.mall.auth.service;

import com.shking.mall.common.domain.UserDto;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @author SHKing
 * @date 7/9/2022
 */
@FeignClient("mall-portal")
public interface UmsMemberService {

    @GetMapping("/sso/loadByUsername")
    UserDto loadUserByUsername(@RequestParam String username);
}
