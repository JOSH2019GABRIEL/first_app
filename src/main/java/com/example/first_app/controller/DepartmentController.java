package com.example.first_app.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.first_app.entity.Department;
import com.example.first_app.service.DepartmentService;

@RestController
@CrossOrigin
public class DepartmentController {
	
	@Autowired
	private DepartmentService departmentService;
	

	
	@PostMapping("/departments")
	public Department saveDepartment(@RequestBody Department department) {
	
			return departmentService.saveDepartment(department);	
	}
	
	@GetMapping("/departments")
	public List <Department> fetchDepartmentList() {
		return departmentService.fetchDepartment();
	}
	
	@GetMapping("/departments/{id}")
	public Department fetchDepatmentById(@PathVariable("id")Long departmentId) {
		return departmentService.fetchDepartmentById(departmentId);
	}
	
	@DeleteMapping("/departments/{id}")
	public String deleteDepartmentById(@PathVariable("id") Long departmentId) {
		departmentService.deleteDepartmentById(departmentId);
		return "Department Successfully Deleted...";
	}
	
	@PutMapping("/{id}")
	public Department updateDepartment(@PathVariable("id") Long departmentId, Department department) {
		return departmentService.updateDepartment(departmentId, department);
		
	}
	
	@GetMapping("/department/name/{name}")
	public Department fetchDepartmentByName(@PathVariable ("name") String departmentName) {
		return departmentService.fetchDepartmentByName(departmentName);
	}
}