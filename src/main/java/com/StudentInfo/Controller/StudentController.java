package com.StudentInfo.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.StudentInfo.Entity.Student;
import com.StudentInfo.Service.StudentService;

@RestController
public class StudentController {
	@Autowired
	StudentService service;
	
	@PostMapping ("/addStudent")
	public Student saveStudent(@RequestBody Student student)
	{
		return service.save(student);
	}
	
	@PostMapping ("/addStudents")
	public List<Student> saveStudents(@RequestBody List<Student>list)
	{
		return service.SaveAll(list);
	}
	
	@GetMapping("/getAllStudentInfo")
	public List<Student> getAll()
	{
		return service.getAll();
	}
	
	@GetMapping("/getStudentById/{id}")
	public Student getStudentById(@PathVariable int id )
	{
		return service.getStudentById(id);
	}
	
	@GetMapping("/getStudentByFirstName/{firstName}")
	public List<Student> getStudentByFirstName(@PathVariable String firstName)
	{
		return (List<Student>) service.getStudentByFirstName(firstName);
	}
	
	@GetMapping("/getStudentByLastName/{lastName}")
	public List<Student> getStudentByLastName(@PathVariable String lastName)
	{
		return (List<Student>) service.getStudentByLastName(lastName);
	}
	
	@PutMapping("/updateStudent")
	public Student updateStudentInfo(@RequestBody Student student)
	{
		return service.updateStudentInfo(student);
	}
	
	@DeleteMapping("/deleteStudent/{id}")
	public void deleteStudent(@PathVariable int id)
	{
		service.deleteStudent(id);
	}
	
	@GetMapping("/getStudentInfoByEmailId/{email}")
	public Student getStudentInfoByEmail(@PathVariable String email)
	{
		return service.getStudentInfoByEmail(email);
	}
	
	@GetMapping("/getStudentInfoByCourse/{course}")
	public List<Student> getStudentInfoByCourse(@PathVariable String course)
	{
		return (List<Student>) service.getStudentInfoByCourse(course);
	}
	
	@GetMapping("/getStudentByContactNo/{contactNo}")
	public Student getStudentInfoByContact(@PathVariable String contactNo)
	{
		return service.getStudentInfoByContact(contactNo);
	}
	
	@GetMapping("/getStudentInfoByAddress/{address}")
	public List<Student> getTSudentInfoByAddress(@PathVariable String address)
	{
		return (List<Student>) service.getStudentByAddress(address);
	}
}
