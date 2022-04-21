package com.example.first_app.service;


import java.util.List;


import com.example.first_app.entity.Department;

public interface DepartmentService {
	public	Department saveDepartment(Department department);

	public List<Department> fetchDepartment();

	public Department fetchDepartmentById(Long departmentId);

	public void deleteDepartmentById(Long departmentId);

	public Department updateDepartment(Long departmentId, Department department);

	public Department fetchDepartmentByName(String departmentName);
 
}
