package com.chen.server.service;

import com.chen.server.pojo.Employee;
import com.baomidou.mybatisplus.extension.service.IService;
import com.chen.server.pojo.RespBean;
import com.chen.server.pojo.RespPageBean;

import java.time.LocalDate;
import java.util.List;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author siter21
 * @since 2021-02-10
 */
public interface IEmployeeService extends IService<Employee> {

    /**
     * 获取所有员工(分页处理)
     * @param currentPage
     * @param size
     * @param employee
     * @param beginDateScope
     * @return
     */
    RespPageBean getEmployeeByPage(Integer currentPage, Integer size, Employee employee, LocalDate[] beginDateScope);

    /**
     * 获取工号 :添加员工工号是当前最大工号+1
     * @return
     */
    RespBean maxWorkID();

    /**
     * 添加员工
     * @param employee
     * @return
     */
    RespBean addEmp(Employee employee);

    /**
     * 查询员工
     * @param id
     * @return
     */
    List<Employee> getEmployee(Integer id);
}
