package com.tts.TechTalentEcommerce.repository;



	import org.springframework.data.repository.CrudRepository;
	import org.springframework.stereotype.Repository;
	import com.tts.TechTalentEcommerce.repository.UserRepository;
	import com.tts.TechTalentEcommerce.model.User;


	@Repository
	public interface UserRepository extends CrudRepository<User, Long> {
	   User findByUsername(String username);

	}


