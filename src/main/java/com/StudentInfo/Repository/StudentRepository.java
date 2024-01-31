package com.StudentInfo.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.StudentInfo.Entity.Student;

@Repository
public interface StudentRepository extends JpaRepository<Student, Integer>{
	public List<Student> findByFirstName(String firstName);
	public List<Student> findByLastName(String lastName);
	public Student findByEmail(String email);
	public List<Student> findByCourse(String course);
	public Student findByContactNo(String contactNo);
	public List<Student> findByAddress(String address);
}
