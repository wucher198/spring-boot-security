package com.usf.myjava.springbootsecurity.model;

import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

import lombok.Data;
import lombok.EqualsAndHashCode;

@Entity
@Table(name = "USER")
@Data
public class User {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	@Column(name = "USERNAME", nullable = false, unique = true, length = 50)
	private String username;
	@Column(name = "PASSWORD", nullable = false, unique = false, length = 256)
	private String password;
	@ManyToMany
	@JoinTable(name = "USER_TO_USER_PROFILE",
			joinColumns = @JoinColumn(name = "USER_ID", referencedColumnName = "ID"),
			inverseJoinColumns = @JoinColumn(name = "USER_PROFILE_ID", referencedColumnName = "ID"))
	private Set<UserProfile> userPorfiles;
}
