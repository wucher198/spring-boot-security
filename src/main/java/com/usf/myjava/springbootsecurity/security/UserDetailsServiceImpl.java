package com.usf.myjava.springbootsecurity.security;

import java.util.HashSet;
import java.util.Optional;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.usf.myjava.springbootsecurity.model.User;
import com.usf.myjava.springbootsecurity.repository.UserRepository;

@Service
public class UserDetailsServiceImpl implements UserDetailsService {
	@Autowired
	private UserRepository userRepository;
	
	@Override
	@Transactional(readOnly = true)
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		Optional<User> user = userRepository.findByUsername(username);
		
		if (user.isEmpty()) {
			throw new UsernameNotFoundException(username);
		}
		
		final Set<GrantedAuthority> grantedAuthorities = new HashSet<>();
		
		user.get().getUserPorfiles().forEach(profile -> {
			grantedAuthorities.add(new SimpleGrantedAuthority(profile.getType().name()));
		});
		
		return user
				.map(one ->	new org.springframework.security.core.userdetails.User(
								one.getUsername(), 
								one.getPassword(), 
								grantedAuthorities))
				.get();
	}
}
