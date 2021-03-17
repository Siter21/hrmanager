package com.chen.server.exception;

import com.chen.server.pojo.RespBean;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import java.sql.SQLException;
import java.sql.SQLIntegrityConstraintViolationException;

/**
 * @author Siter21
 * @Description 全局异常处理
 * @date 2021/3/15-9:11
 */
@RestControllerAdvice
public class GlobalException {
    @ExceptionHandler(SQLException.class)
    public RespBean mySQLException(SQLException e) {
        if (e instanceof SQLIntegrityConstraintViolationException) {
            return RespBean.error("该数据有关数据，操作失败！");
        }
        return RespBean.error("数据库异常，操作失败！");
    }
}