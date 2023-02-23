package com.example.EmployeePro;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class EmployeeController {
	@Autowired
	EmployeeRepository erepo;
	@RequestMapping("/{fname}/{lname}/{age}/{city}/{country}")
	public String save(@PathVariable String fname,@PathVariable String lname,@PathVariable int age,
			@PathVariable String city,@PathVariable String country)
	{
		Employee e=new Employee();
		e.setFname(fname);
		e.setLname(lname);
		e.setAge(age);
		e.setCity(city);
		e.setCountry(country);
		erepo.save(e);
		return "Data Saved";
	}
	@RequestMapping("/all")
	public List<Employee> all()
	{
		return erepo.findAll();
	}
	@RequestMapping("/{id}")
	public Employee byid(@PathVariable int id)
	{
		return erepo.findById(id);
	}
	@RequestMapping("/by/{lname}")
	public Employee bylname(@PathVariable String lname)
	{
		return erepo.findByLname(lname);
	}
	
	

}
