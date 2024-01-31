package com.StudentInfo.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.StudentInfo.Entity.Student;
import com.StudentInfo.Repository.StudentRepository;

@Service
public class StudentService {
	@Autowired
	StudentRepository repository;

	public Student save(Student student)
	{
		return repository.save(student);
	}
	
	public List<Student> SaveAll(List<Student>list)
	{
		return repository.saveAll(list);
	}
	
	public List<Student> getAll()
	{
		return repository.findAll();
	}
	
	public Student getStudentById(int id)
	{
		return repository.findById(id).orElse(null);
	}
	
	public List<Student> getStudentByFirstName(String firstName)
	{
		return (List<Student>) repository.findByFirstName(firstName);
	}
	
	public List<Student> getStudentByLastName(String lastName)
	{
		return (List<Student>) repository.findByLastName(lastName);
	}
	
	public Student updateStudentInfo(Student student)
	{
		Student existingStudent=repository.findById(student.getId()).orElse(null);
		existingStudent.setFirstName(student.getFirstName());
		existingStudent.setLastName(student.getLastName());
		existingStudent.setEmail(student.getEmail());
		existingStudent.setCourse(student.getCourse());
		existingStudent.setContactNo(student.getContactNo());
		existingStudent.setAddress(student.getAddress());
		return repository.save(existingStudent);
	}
	
	public void deleteStudent(int id)
	{
		repository.deleteById(id);
	}
	
	public Student getStudentInfoByEmail(String email)
	{
		return repository.findByEmail(email);
	}

	public List<Student> getStudentInfoByCourse(String course)
	{
		return repository.findByCourse(course);
	}
	
	public Student getStudentInfoByContact(String contactNo)
	{
		return repository.findByContactNo(contactNo);
	}
	
	public List<Student> getStudentByAddress(String address)
	{
		return repository.findByAddress(address);
	}
}
