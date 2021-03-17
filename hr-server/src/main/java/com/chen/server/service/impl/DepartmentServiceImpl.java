package com.chen.server.service.impl;

import com.chen.server.pojo.Department;
import com.chen.server.mapper.DepartmentMapper;
import com.chen.server.pojo.RespBean;
import com.chen.server.service.IDepartmentService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author siter21
 * @since 2021-02-10
 */
@Service
public class DepartmentServiceImpl extends ServiceImpl<DepartmentMapper, Department> implements IDepartmentService {

    @Autowired
    private DepartmentMapper departmentMapper;
    /**
     * 获取所有部门
     * @return
     */
    @Override
    public List<Department> getAllDepartments() {
        return departmentMapper.getAllDepartments(-1);
    }

    /**
     * 添加部门
     * @param dep
     */
    @Override
    public RespBean addDep(Department dep) {
        dep.setEnabled(true);
        departmentMapper.addDep(dep);
        if(1==dep.getResult()){
            return RespBean.success("添加成功！",dep);
        }
        return RespBean.error("添加失败！");
    }

    /**
     * 删除部门
     * @param id
     * @return
     */
    @Override
    public RespBean deleteDep(Integer id) {
        Department dep=new Department();
        dep.setId(id);
        departmentMapper.deleteDep(dep);
        if(-2==dep.getResult()){
            return RespBean.error("该部门下还有子部门，删除失败！");
        }
        if(-1==dep.getResult()){
            return RespBean.error("该部门还有员工，删除失败！");
        }
        if(1==dep.getResult()){
            return RespBean.error("删除成功！");
        }
        return RespBean.error("删除失败！");
    }
}
