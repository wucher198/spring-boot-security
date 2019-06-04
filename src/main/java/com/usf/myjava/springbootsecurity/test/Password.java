package com.usf.myjava.springbootsecurity.test;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

public class Password {
	public static void main(String[] args) {
		BCryptPasswordEncoder bCrypt = new BCryptPasswordEncoder();
		System.out.println(bCrypt.encode("abc123"));
	}
}
