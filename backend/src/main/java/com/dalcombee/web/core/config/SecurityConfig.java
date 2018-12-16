package com.dalcombee.web.core.config;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

import com.dalcombee.web.domain.AdminUser;
import com.dalcombee.web.repository.AdminUserRepository;
import com.google.common.collect.Lists;

import lombok.extern.slf4j.Slf4j;

/**
 * login page
 * https://howtodoinjava.com/spring5/security5/security-java-config-enablewebsecurity-example/
 */
@Slf4j
@EnableWebSecurity
public class SecurityConfig extends WebSecurityConfigurerAdapter {
	@Autowired
	PasswordEncoder passwordEncoder;
	@Autowired
	AdminUserRepository adminUserRepository;

	private static final String ROLE_ADMIN = "ADMIN";
	private static final String ROLE_USER = "USER";

	@Override
	protected void configure(AuthenticationManagerBuilder auth) throws Exception {
		List<AdminUser> adminUsers = adminUserRepository.findAll();
		log.info("SecurityConfig.configure(). adminUsers : {}", adminUsers);

		for (AdminUser adminUser : adminUsers) {
			// set roles
			List<String> roles = Lists.newArrayList(ROLE_USER);
			if (adminUser.isAdmin()) {
				roles.add(ROLE_ADMIN);
			}

			auth.inMemoryAuthentication()//
					.passwordEncoder(passwordEncoder)//
					.withUser(adminUser.getId()).password(passwordEncoder.encode(adminUser.getPw()))//
					.roles(roles.toArray(new String[roles.size()]))//
			;
		}
	}

	@Bean
	public PasswordEncoder passwordEncoder() {
		return new BCryptPasswordEncoder();
	}

	@Override
	protected void configure(HttpSecurity http) throws Exception {
		http.authorizeRequests()//
				.antMatchers("/login").permitAll()//
				.antMatchers("/admin/**").hasRole(ROLE_ADMIN)//
				.antMatchers("/**").hasAnyRole(ROLE_ADMIN, ROLE_USER)//
				.and().formLogin()//
				.and().logout().logoutSuccessUrl("/login").permitAll()//
				.and().csrf().disable();
	}
}