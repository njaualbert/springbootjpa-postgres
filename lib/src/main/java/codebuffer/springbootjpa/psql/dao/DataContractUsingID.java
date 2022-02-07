package codebuffer.springbootjpa.psql.dao;

import java.util.List;

import codebuffer.springbootjpa.psql.entity.Student;

public interface DataContractUsingID {
	Student saveStudent(Student student);
	List<Student> returnAllStudents();
	List<Student> returnStudentsByFirstName(String firstName);
}
