package com.example.EmployeePro;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee,Integer>
{
	Employee findById(int id);
	Employee findByLname(String lname);

}
