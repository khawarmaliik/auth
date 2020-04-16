package com.springboot.authentication.controller;

import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.springboot.authentication.model.AllEmployees;
import com.springboot.authentication.service.EmployeeServiceImpl;

@RestController
@RequestMapping("/auth")
public class AuthenticatedController {

	EmployeeServiceImpl employeeService;
	
	public AuthenticatedController(EmployeeServiceImpl employeeService) {
		this.employeeService = employeeService;
	}
	
	@RequestMapping("/public")
	public String publicApi() {
		return "Welcome to Public API!!!";
	}
	
	@RequestMapping("/all")
	@ResponseBody
	public List<AllEmployees> getAllEmployees() {
		return employeeService.fetchAllEmployees();
        
    }
//	
//	@PostMapping("/add")
//	@ResponseBody
//	public ResponseEntity createEmployee(@RequestBody AddEmployee employee) {
//		RestTemplate restTemplate = new RestTemplate();
//        HttpEntity<AddEmployee> request = new HttpEntity<>(employee);
//        ResponseEntity exchange = restTemplate
//                .exchange("http://localhost:8089/Employee-Management/employee/add", HttpMethod.POST, request, String.class);
//        return exchange;
//    }
}
