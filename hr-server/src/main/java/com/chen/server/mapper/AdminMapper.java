package com.chen.server.mapper;

import com.chen.server.pojo.Admin;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.chen.server.pojo.Menu;
import com.chen.server.pojo.RespBean;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author siter21
 * @since 2021-02-10
 */

public interface AdminMapper extends BaseMapper<Admin> {
    /**
     * 获取所有操作员
     * @param id
     * @param keywords
     * @return
     */
    List<Admin> getAllAdmins(@Param("id") Integer id, @Param("keywords") String keywords);

}
