package com.springboot.authentication.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.springboot.authentication.feign.EmployeeClient;
import com.springboot.authentication.model.AllEmployees;

@Service
public class EmployeeServiceImpl {

	EmployeeClient empClient;
	
	public EmployeeServiceImpl(EmployeeClient empClient){
		this.empClient = empClient;
	}
	
//	@Autowired
//	EmployeeDao empDao;
//	
//	@Override
//	public AddEmployeeResponse createAnEmployee(AddEmployee employee) {
//		// TODO Auto-generated method stub
//		return empDao.createAnEmployee(employee);
//	}
//
	public List<AllEmployees> fetchAllEmployees() {
		// TODO Auto-generated method stub
		List<AllEmployees> employees = empClient.getAllUsers();
		return employees;
	}
//
//	@Override
//	public SearchEmployee fetchEmployeesById(int employeeId, AddEmployee employee) {
//		// TODO Auto-generated method stub
//		return empDao.fetchEmployeesById(employeeId, employee);
//	}
//
//	@Override
//	public void deleteAnEmployee(int employeeId) {
//		empDao.deleteAnEmployee(employeeId);
//		
//	}
//
//	@Override
//	public ResponseEntity<AddEmployee> updateEmployee(int empId, AddEmployee employee) {
//		// TODO Auto-generated method stub
//		return empDao.updateEmployee(empId, employee);
//	}
}
