package com.appliance.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

@Configuration
@EnableWebSecurity
public class SecurityConfiguration extends WebSecurityConfigurerAdapter {
	/**
	 * It allows configuring web based security for specific http requests. By
	 * default it will be applied to all requests, but can be restricted
	 * 
	 * @param http
	 * @throws Exception
	 */
	@Override
	protected void configure(HttpSecurity http) throws Exception {
		http.csrf().disable().authorizeRequests().anyRequest().authenticated().and().httpBasic().and().formLogin();
	}

	/**
	 * The configuration will require that any URL that is requested, will require a
	 * User with the role "ROLE_USER". It also defines an in memory authentication
	 * scheme with a user that has the following username, password and the role.
	 * 
	 * @param auth
	 * @throws Exception
	 */

	@Autowired
	public void configureGlobal(AuthenticationManagerBuilder auth) throws Exception {
		auth.inMemoryAuthentication().withUser("spring").password("{noop}test123").roles("USER");
	}
}
