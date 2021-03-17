package com.chen.server.service;

import com.chen.server.pojo.Menu;
import com.baomidou.mybatisplus.extension.service.IService;
import com.chen.server.pojo.Role;

import java.util.List;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author siter21
 * @since 2021-02-10
 */
public interface IMenuService extends IService<Menu> {

    /**
     * 根据用户ID查询菜单列表
     * @return
     */
    List<Menu> getMenusByAdminId();

    /**
     *根据角色查询菜单列表
     * @return
     */
    List<Menu> getAllMenusWithRole();

    /**
     * 查询所有菜单
     * @return
     */
    List<Menu> getAllMenus();
}
