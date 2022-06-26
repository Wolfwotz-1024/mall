package com.shking.mall.common.domain;

import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * Controller曾的日志封装类
 * @Author SHKing
 * @Date 14/6/2022 21:39
 * @Version 1.0
 */

@Data
@EqualsAndHashCode(callSuper = false)
public class WebLog {

    /**
     * 操作描述
     */
    private String description;

    /**
     * 操作用户
     */
    private String username;

    /**
     * 操作时间
     */
    private Long startTime;

    /**
     * 消耗时间
     */
    private Integer spendTime;

    /**
     * 根路径
     */
    private String basePath;

    /**
     * URL
     */
    private String url;

    /**
     * 请求类型
     */
    private String method;

    /**
     * ip地址
     */
    private String ip;

    /**
     * 请求参数
     */
    private Object parameter;

    /**
     * 返回结果
     */
    private Object result;
}
