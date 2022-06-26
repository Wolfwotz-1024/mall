package com.shking.mall.common.api;

import com.github.pagehelper.PageInfo;
import org.springframework.data.domain.Page;
import lombok.Data;

import java.util.List;

/**
 * 分页数据封装类
 * @Author SHKing
 * @Date 20/3/2022 21:31
 * @Version 1.0
 */
@Data
public class CommonPage<T> {
    private Integer pageNum; // 当前页数
    private Integer pageSize; // 一页大小
    private Integer totalPage; // 总页数
    private Long total; // 总数是多少
    private List<T> list;

    /**
     * 将pageHelper 分页后的list转换为分页信息
     * @param pageInfo
     * @param <T>
     * @return
     */
    public static <T> CommonPage<T> restPage(PageInfo<T> pageInfo){
        CommonPage<T> result = new CommonPage<>();
//        PageInfo<T> pageInfo = new PageInfo<>(list);
        result.setTotalPage(pageInfo.getPages());
        result.setPageNum(pageInfo.getPageNum());
        result.setPageSize(pageInfo.getPageSize());
        result.setTotal(pageInfo.getTotal());
        result.setList(pageInfo.getList());
        return result;
    }

    /**
     * 将SpringData分页后的list转换为分页信息
     * @param pageInfo
     * @param <T>
     * @return
     */
    public static <T> CommonPage<T> restPage(Page<T> pageInfo){
        CommonPage<T> result = new CommonPage<>();
        result.setTotalPage(pageInfo.getTotalPages());
        result.setPageNum(pageInfo.getNumber());
        result.setPageSize(pageInfo.getSize());
        result.setTotal(pageInfo.getTotalElements());
        result.setList(pageInfo.getContent());
        return result;
    }
}
