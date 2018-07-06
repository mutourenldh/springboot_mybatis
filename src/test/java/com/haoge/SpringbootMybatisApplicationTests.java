package com.haoge;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.haoge.bean.Employee;
import com.haoge.mapper.EmployeeMapper;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SpringbootMybatisApplicationTests {
	@Autowired
	private EmployeeMapper employeeMapper;

	@Test
	public void contextLoads() {
		Employee employee = employeeMapper.getEmpById(1);
		System.out.println(employee);
		System.out.println(employee.toString());
		employeeMapper.insertEmp(employee);
	}

}
