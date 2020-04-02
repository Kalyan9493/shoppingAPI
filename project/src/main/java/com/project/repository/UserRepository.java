package com.project.repository;

import javax.ws.rs.QueryParam;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.project.entity.User;
@Repository
public interface UserRepository extends JpaRepository<User, Long>{

	User findByUsername(String username);

	@Query("select e from user e where e.emailid=:emailid")
	User findByEmailid(@QueryParam("emailid")String emailid);

}
