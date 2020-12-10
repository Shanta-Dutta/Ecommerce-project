package com.tts.TechTalentEcommerce1.model;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import javax.persistence.Column;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Transient;
import javax.validation.constraints.NotEmpty;
import org.hibernate.validator.constraints.Length;
import org.springframework.security.core.GrantedAuthority;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class User {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "user_id")
	private Long id;
	
	@NotEmpty(message = "username cannot be empty")
	@Length(max = 30, message = "username cannot have more than 30 characters")
	private String username;
	
	@NotEmpty(message = "password cannot be empty")
	@Length(max = 30, message = "password cannot have more than 30 characters")
	private String password;
	//Creates a HashMap  that uses Product and Integer pairs called "cart"
	@ElementCollection	
	private Map<Product, Integer> cart;   // private HashMap<Product, Integer> cart;
	
}
