package codebuffer.springbootjpa.psql.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import codebuffer.springbootjpa.psql.dao.DataContractUsingID;
import codebuffer.springbootjpa.psql.dao.DataRepositoryUsingID;
import codebuffer.springbootjpa.psql.entity.Student;

@Service
public class StudentServiceUsingID implements DataContractUsingID{
	private DataRepositoryUsingID dataRepositoryUsingID;
	
	@Autowired
	public StudentServiceUsingID(DataRepositoryUsingID dataRepositoryUsingID) {
		super();
		this.dataRepositoryUsingID = dataRepositoryUsingID;
	}

	@Override
	public Student saveStudent(Student student) {
		return this.dataRepositoryUsingID.save(student);
	}

	@Override
	public List<Student> returnAllStudents() {
		return this.dataRepositoryUsingID.findAll();
	}

	@Override
	public List<Student> returnStudentsByFirstName(String firstName) {
		return this.dataRepositoryUsingID.findByFirstName(firstName);
	}

}
