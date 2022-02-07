package codebuffer.springbootjpa.psql.entity;

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.Embeddable;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Embeddable
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@AttributeOverrides(value = { 
		@AttributeOverride(column = @Column(name="guardian_name"), name = "name"),
		@AttributeOverride(column = @Column(name="guardian_email"), name = "email"),
		@AttributeOverride(column = @Column(name="guardian_mobile"), name = "mobile")
		})
public class Guardian {	
	@Column( 
			nullable = false,
			columnDefinition = "Text",
			length = 50
			)
	private String name;
	
	@Column( 
			nullable = false, 
			length = 50
			)
	private String email;
	
	@Column( 
			nullable = false,
			length = 10
			)
	private Integer mobile;

	@Override
	public String toString() {
		return "Guardian [name=" + name + ", email=" + email + ", mobile=" + mobile + "]";
	}	
	
}
