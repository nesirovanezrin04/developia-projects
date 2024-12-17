package com.developia.librariann_nezrin_nesirova.config;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpMethod;
import org.springframework.security.authentication.AuthenticationProvider;
import org.springframework.security.authentication.dao.DaoAuthenticationProvider;
import org.springframework.security.config.annotation.method.configuration.EnableMethodSecurity;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.http.SessionCreationPolicy;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.jdbc.JdbcDaoImpl;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
@EnableWebSecurity

@EnableMethodSecurity(prePostEnabled = true)
public class SecurityConfig {
	@Autowired
	private DataSource dataSource;
	
	@Bean
	public UserDetailsService userDetailsService() {
		JdbcDaoImpl jdbcDao = new JdbcDaoImpl();
		jdbcDao.setDataSource(dataSource);
		return jdbcDao;
	}

	@Bean
	public AuthenticationProvider authenticationProvider() {
		DaoAuthenticationProvider authProvider = new DaoAuthenticationProvider();
		authProvider.setUserDetailsService(userDetailsService());

		return authProvider;
	}

	@Bean
	public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
		return http.csrf().disable().authorizeRequests()

				.requestMatchers(HttpMethod.OPTIONS, "/**").permitAll()
				.requestMatchers("/**").permitAll()
				.requestMatchers(HttpMethod.POST, "/users/librarian").permitAll().anyRequest().authenticated().and()
				.httpBasic().and().sessionManagement().sessionCreationPolicy(SessionCreationPolicy.STATELESS).and()
				.headers().frameOptions().disable().and().build();

	}

}
