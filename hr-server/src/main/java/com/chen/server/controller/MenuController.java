package com.chen.server.controller;


import com.baomidou.mybatisplus.extension.service.IService;
import com.chen.server.pojo.Menu;
import com.chen.server.service.IAdminService;
import com.chen.server.service.IMenuService;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author siter21
 * @since 2021-02-10
 */
@RestController
@RequestMapping("/system/cfg")
public class MenuController {
    @Autowired
    private IMenuService menuService;

    @ApiOperation(value = "根据用户ID查询菜单列表")
    @GetMapping("/menu")
    public List<Menu> getMenusByAdminId(){
        return menuService.getMenusByAdminId();
    }
}
