package bodhi.technology.backoffice.config;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.authentication.dao.DaoAuthenticationProvider;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.config.annotation.web.configuration.WebSecurityCustomizer;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.web.SecurityFilterChain;
import org.springframework.security.web.authentication.AuthenticationSuccessHandler;

import bodhi.technology.backoffice.service.userservice.CustomUserDetailsService;

@Configuration
@EnableWebSecurity
public class WebSecurityConfig extends WebSecurityConfigurerAdapter{
	
	
	 private AuthenticationSuccessHandler authenticationSuccessHandler;
	 

	@Bean
	public UserDetailsService userDetailsService() {
		return new CustomUserDetailsService();
	}
	
	@Bean
	public BCryptPasswordEncoder passwordEncoder() {
		return new BCryptPasswordEncoder();
	}
	
	@Bean
	public DaoAuthenticationProvider authenticationProvider() {
		DaoAuthenticationProvider authProvider = new DaoAuthenticationProvider();
		authProvider.setUserDetailsService(userDetailsService());
		authProvider.setPasswordEncoder(passwordEncoder());
		return authProvider;
	}
	
	
	
	
	@Override
	protected void configure(AuthenticationManagerBuilder auth) throws Exception {
		auth.authenticationProvider(authenticationProvider());
		
	}
	
	@Autowired
    public WebSecurityConfig(AuthenticationSuccessHandler authenticationSuccessHandler) {
        this.authenticationSuccessHandler = authenticationSuccessHandler;
    }
	
	 @Override
	protected void configure(HttpSecurity http) throws Exception {
		 
		 http.authorizeRequests()
		 .antMatchers("/admin/**").hasRole("Admin")
		 .antMatchers("/staff/**").hasRole("Staff")
		 .antMatchers("/**").permitAll().and().formLogin().loginPage("/")
		 .successHandler(authenticationSuccessHandler)
		 .and().csrf().disable();
		 
		 
//		 http.authorizeRequests()
////			.antMatchers("/admin/**").hasRole("Admin")
//		 .antMatchers("/**").permitAll()
//			.and()
//			.formLogin()
//			.loginPage("/")
//			.loginProcessingUrl("/loginProcess")
////			.usernameParameter("email")
//			.defaultSuccessUrl("/admin/dashboard")
//			.failureUrl("/")
//			.permitAll()
//			.and()
////         .rememberMe().key("AbcdEfghIjklmNopQrsTuvXyz_0123456789")
////			.and()
//			.logout()
//			.logoutSuccessUrl("/")
//			.invalidateHttpSession(true)
//			.clearAuthentication(true)
//			.permitAll()
//			.and().csrf().disable();
	       
	 
	}
    
}	    




// https://github.com/hellokoding/hellokoding-courses/tree/master/springboot-examples/springboot-security-login-thymeleaf

//https://www.codejava.net/frameworks/spring-boot/spring-security-add-roles-to-user-examples