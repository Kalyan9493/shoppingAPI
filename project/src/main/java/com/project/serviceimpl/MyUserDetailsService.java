package com.project.serviceimpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.project.UserPrinciple;
import com.project.entity.User;
import com.project.repository.UserRepository;

@Service
public class MyUserDetailsService implements UserDetailsService {

	@Autowired
	private UserRepository repo;
	@Override
	public UserDetails loadUserByUsername(String emailid) throws UsernameNotFoundException {
		User user=repo.findByEmailid(emailid);
		
		if(user==null) {
			throw new UsernameNotFoundException("User not found");
		}
		return new UserPrinciple(user);
		
	}

}
