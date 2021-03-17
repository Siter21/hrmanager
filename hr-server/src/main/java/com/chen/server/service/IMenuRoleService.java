package com.chen.server.service;

import com.chen.server.pojo.MenuRole;
import com.baomidou.mybatisplus.extension.service.IService;
import com.chen.server.pojo.RespBean;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author siter21
 * @since 2021-02-10
 */
public interface IMenuRoleService extends IService<MenuRole> {

    /**
     * 更新角色菜单
     * @param rid
     * @param mids
     * @return
     */
    RespBean updateMenusRole(Integer rid, Integer[] mids);
}
