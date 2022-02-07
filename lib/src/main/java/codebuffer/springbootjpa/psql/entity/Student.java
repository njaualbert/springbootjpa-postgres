package codebuffer.springbootjpa.psql.entity;

import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Table(name="student")
@SequenceGenerator(
		sequenceName = "student_sequence",
		name="student_sequence",
		allocationSize=1
		)
public class Student {
	@Id
	@GeneratedValue(
			strategy = GenerationType.SEQUENCE,
			generator = "student_sequence"
			)
	@Column(
			name = "student_id",
			columnDefinition = "SERIAL",
			nullable = false,
			updatable = false,
			insertable = false
			)
	private Long studentId;
	
	@Column( 
			nullable = false,
			length = 30
			)
	private String firstName;
	
	@Column( 
			nullable = false,
			length = 30
			)
	private String lastName;
	
	@Column(
			name = "email_address",
			nullable = false,
			unique = true,
			length = 50
			)
	private String emailId;
	
	@Embedded
	private Guardian guardian;

	@Override
	public String toString() {
		return "Student [studentId=" + studentId + ", firstName=" + firstName + ", lastName=" + lastName + ", emailId="
				+ emailId + ", guardian=" + guardian + "]";
	}
	
	
	

}
