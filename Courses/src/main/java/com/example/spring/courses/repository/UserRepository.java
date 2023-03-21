package com.example.spring.courses.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.example.spring.courses.entity.Users;

@Repository
public interface UserRepository extends JpaRepository<Users, Long>{

	Object findByEmail(String emailId);

	@Query(value="select * from Users where id=?1",nativeQuery = true)
	Users findByuserId(Long id);
	

}
