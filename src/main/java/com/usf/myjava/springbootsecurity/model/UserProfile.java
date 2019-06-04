package com.usf.myjava.springbootsecurity.model;

import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

import com.usf.myjava.springbootsecurity.consts.UserProfileType;

import lombok.Data;
import lombok.EqualsAndHashCode;

@Entity
@Table(name = "USER_PROFILE")
@Data
@EqualsAndHashCode(exclude = {"users"})
public class UserProfile {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	
	@Enumerated(EnumType.STRING)
	@Column(name = "TYPE", nullable = false, unique = true)
	private UserProfileType type;
	
	@ManyToMany(mappedBy = "userPorfiles")
	private Set<User> users;
}
