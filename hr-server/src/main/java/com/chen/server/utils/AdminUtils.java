package com.chen.server.utils;

import com.chen.server.pojo.Admin;
import org.springframework.security.core.context.SecurityContextHolder;

/**
 * @author Siter21
 * @Description 操作员工工具类
 * @date 2021/3/16-21:36
 */
public class AdminUtils {
    /**
     * 获取当前登录操作员
     * @return
     */
    public static Admin getCurrentAdmin(){
        return (Admin) SecurityContextHolder.getContext().getAuthentication().getPrincipal();
    }
}