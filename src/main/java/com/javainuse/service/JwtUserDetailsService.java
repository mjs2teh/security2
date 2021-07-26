package com.javainuse.service;

import java.util.ArrayList;
import java.util.Optional;

import com.javainuse.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class JwtUserDetailsService implements UserDetailsService {

	@Autowired
	private UserRepository userRepository;
	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		Optional<com.javainuse.model.User> byId = userRepository.findById(username);
		if (byId.isPresent()) {
			return new User(byId.get().getUsername(), byId.get().getPassword(),
					new ArrayList<>());
		}
		 else {
			throw new UsernameNotFoundException("User not found with username: " + username);
		}
	}

}