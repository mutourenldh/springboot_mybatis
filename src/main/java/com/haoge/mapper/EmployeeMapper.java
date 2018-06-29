package com.haoge.mapper;

import org.apache.ibatis.annotations.Mapper;

import com.haoge.bean.Employee;

//@Mapper或者@MapperScan将接口扫描装配到容器中
@Mapper
public interface EmployeeMapper {

    public Employee getEmpById(Integer id);

    public void insertEmp(Employee employee);
}
