package codebuffer.springbootjpa.psql.services;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import codebuffer.springbootjpa.psql.dao.DataContractUsingID;
import codebuffer.springbootjpa.psql.dao.DataRepositoryUsingID;
import codebuffer.springbootjpa.psql.entity.Guardian;
import codebuffer.springbootjpa.psql.entity.Student;

@SpringBootTest
public class StudentServiceUsingIDTest {
	private DataContractUsingID dataContractUsingID;
	
	@Autowired	
	public StudentServiceUsingIDTest(DataContractUsingID dataContractUsingID) {
		super();
		this.dataContractUsingID = dataContractUsingID;
	}
	
	@Test
	public void saveStudent() {
		Guardian guardian = Guardian.builder()
				.name("Albert")
				.email("albert@gmail.com")
				.mobile(181282227)
				.build();

		Student student = Student.builder()
				.emailId("herald@gmail.com")
				.firstName("Herald")
				.lastName("Njau")
				.guardian(guardian)
				.build();
		
		System.out.println(this.dataContractUsingID.saveStudent(student));
	}
	
	@Test
	public void printAllStudents() {
		System.out.println("Student List:");
		for( Student student : this.dataContractUsingID.returnAllStudents() ) {
			System.out.println(student);
		}
	}
	
	@Test
	public void printStudentByFirstName() {
		List<Student> students = this.dataContractUsingID.returnStudentsByFirstName("Herald");
		System.out.println("students = " + students.toString());
	}
}
