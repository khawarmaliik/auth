package com.springboot.authentication.feign;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.springboot.authentication.model.AddEmployee;
import com.springboot.authentication.model.AllEmployees;

@FeignClient(name = "employee", url= "http://localhost:8089/Employee-Management")
public interface EmployeeClient {
	@RequestMapping(method = RequestMethod.GET, value = "employee/all")
    List<AllEmployees> getAllUsers();
	
	@PostMapping(value = "/add")
    AddEmployee createEmployee(@RequestBody AddEmployee employee);
}
