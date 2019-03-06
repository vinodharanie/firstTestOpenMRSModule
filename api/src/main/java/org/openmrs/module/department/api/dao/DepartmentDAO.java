package org.openmrs.module.department.api.dao;

import org.openmrs.module.department.Department;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository("department.DepartmentDAO")
public interface DepartmentDAO {
	
	/**
	 * @see org.openmrs.module.department.api.DepartmentService#getAllDepartments()
	 */
	List<Department> getAllDepartments();
	
	/**
	 * @see org.openmrs.module.department.api.DepartmentService#getDepartment(java.lang.Integer)
	 */
	Department getDepartment(Integer departmentId);
	
	/**
	 * @see org.openmrs.module.department.api.DepartmentService#saveDepartment(org.openmrs.module.department.Department)
	 */
	Department saveDepartment(Department department);
	
	/**
	 * @see org.openmrs.module.department.api.DepartmentService#purgeDepartment(org.openmrs.module.department.Department)
	 */
	void purgeDepartment(Department department);
}
