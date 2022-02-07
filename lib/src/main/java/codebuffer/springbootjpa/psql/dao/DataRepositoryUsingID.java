package codebuffer.springbootjpa.psql.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import codebuffer.springbootjpa.psql.entity.Student;

@Repository
public interface DataRepositoryUsingID extends JpaRepository<Student, Long>{
	List<Student> findByFirstName(String firstName);
}
