package com.chen.server.mapper;

import com.chen.server.pojo.Menu;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author siter21
 * @since 2021-02-10
 */
public interface MenuMapper extends BaseMapper<Menu> {
    /**
     * 通过用户id获取菜单列表
     * @param
     * @return
     */
    List<Menu> getMenusByAdminId(Integer id);

    /**
     * 根据角色获取查询菜单列表
     * @return
     */
    List<Menu> getAllMenusWithRole();

    /**
     * 查询所有菜单
     * @return
     */
    List<Menu> getAllMenus();

}
