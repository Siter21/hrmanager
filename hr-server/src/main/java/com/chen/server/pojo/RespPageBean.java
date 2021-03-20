package com.chen.server.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

/**
 * @author Siter21
 * @Description 分页公共返回对象
 * @date 2021/3/17-16:55
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class RespPageBean {
    /**
     * 总条数
     */
    private long total;
    /**
     * 数组List
     */
    private List<?> data;
}