package com.chen.server.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.chen.server.pojo.Employee;
import com.chen.server.mapper.EmployeeMapper;
import com.chen.server.pojo.RespBean;
import com.chen.server.pojo.RespPageBean;
import com.chen.server.service.IEmployeeService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.text.DecimalFormat;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.List;
import java.util.Map;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author siter21
 * @since 2021-02-10
 */
@Service
public class EmployeeServiceImpl extends ServiceImpl<EmployeeMapper, Employee> implements IEmployeeService {

    @Autowired EmployeeMapper employeeMapper;
    /**
     * 获取所有员工(分页处理)
     * @param currentPage
     * @param size
     * @param employee
     * @param beginDateScope
     * @return
     */
    @Override
    public RespPageBean getEmployeeByPage(Integer currentPage, Integer size, Employee employee, LocalDate[] beginDateScope) {
        Page<Employee> page=new Page<>(currentPage,size);
        IPage<Employee> employeeBypage = employeeMapper.getEmployeeByPage(page, employee, beginDateScope);
        RespPageBean respPageBean = new RespPageBean(employeeBypage.getTotal(), employeeBypage.getRecords());
        return respPageBean;
    }
    /**
     * 获取工号 :添加员工工号是当前最大工号+1
     *
     * @return String.format(" % 08d " = 获得固定8位长度的数字 （ 不足的前面补0 ）
     */
    @Override
    public RespBean maxWorkID() {
        List<Map<String, Object>> maps = baseMapper.selectMaps(new QueryWrapper<Employee>().select("max(workID)"));
        return RespBean.success(null, String.format("%08d", Integer.parseInt(maps.get(0).get("max(workID)").toString()) + 1));
    }

    @Override
    public RespBean addEmp(Employee employee) {
        // 处理合同期限，保留两位小数
        LocalDate beginContract = employee.getBeginContract();
        LocalDate endContract = employee.getEndContract();
        // 计算 两个日期相差多少天
        long days = beginContract.until(endContract, ChronoUnit.DAYS);
        // 保留两位小数
        DecimalFormat decimalFormat = new DecimalFormat("##.00");
        // 计算以年为单位
        employee.setContractTerm(Double.parseDouble(decimalFormat.format(days / 365.00)));
        if (1 == baseMapper.insert(employee)) {
            return RespBean.success("添加员工成功！");
        }
        return RespBean.error("添加员工失败！");
    }

    /**
     * 查询员工
     * @param id
     * @return
     */
    @Override
    public List<Employee> getEmployee(Integer id) {
        return employeeMapper.getEmploy(id);
    }

}
