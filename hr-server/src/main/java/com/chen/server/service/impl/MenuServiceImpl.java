package com.chen.server.service.impl;

import com.chen.server.pojo.Menu;
import com.chen.server.mapper.MenuMapper;
import com.chen.server.service.IMenuService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author siter21
 * @since 2021-02-10
 */
@Service
public class MenuServiceImpl extends ServiceImpl<MenuMapper, Menu> implements IMenuService {

}
