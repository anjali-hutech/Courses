package com.example.spring.courses.config;

import java.util.Collection;
import java.util.Set;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import com.example.spring.courses.entity.Users;

public class CustomUserDetails implements UserDetails {


	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	private static final long serialVersionUID = 1L;

	private User user;

	private Set<GrantedAuthority> authorities = null;

	@Override
	public Collection<? extends GrantedAuthority> getAuthorities() {
		return authorities;
	}

//	@Override
//	public String getPassword() {
//		return user.getPassword();
//	}

	@Override
	public String getUsername() {
		return user.getEmail();
	}

	@Override
	public boolean isAccountNonExpired() {
		return true;
	}

	@Override
	public boolean isAccountNonLocked() {
		return true;
	}

	@Override
	public boolean isCredentialsNonExpired() {
		return true;
	}

	@Override
	public boolean isEnabled() {
		return true;
	}

	@Override
	public String getPassword() {
		// TODO Auto-generated method stub
		return null;
	}

	

}
