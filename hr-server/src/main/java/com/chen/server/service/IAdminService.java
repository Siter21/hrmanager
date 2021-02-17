package com.chen.server.service;

import com.chen.server.pojo.Admin;
import com.baomidou.mybatisplus.extension.service.IService;
import com.chen.server.pojo.RespBean;

import javax.servlet.http.HttpServletRequest;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author siter21
 * @since 2021-02-10
 */
public interface IAdminService extends IService<Admin> {

    /**
     * 登录之后返回token
     * @param username
     * @param password
     * @param request
     * @return
     */
    RespBean login(String username, String password, HttpServletRequest request);

    /**
     *根据用户名获取用户
     * @param username
     * @return
     */
    Admin getAdminByUserName(String username);
}
