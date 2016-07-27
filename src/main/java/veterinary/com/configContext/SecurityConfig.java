package veterinary.com.configContext;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
@Configuration
@EnableWebSecurity
public class SecurityConfig extends WebSecurityConfigurerAdapter {

	// @Autowired
	// private DataSource dataSource;

	
	@Autowired
	@Qualifier("userDetailsService")
	UserDetailsService userDetailsService;
	
	@Autowired
	public void configureGlobal(AuthenticationManagerBuilder auth)
			throws Exception {
		auth.userDetailsService(userDetailsService).passwordEncoder(passwordEncoder());
	}

	protected void configure(HttpSecurity http) throws Exception {
		/*
		 * http .authorizeRequests() .anyRequest().authenticated() .and()
		 * .formLogin() .loginPage("/login")
		 * .permitAll().successForwardUrl("/welcome");
		 */
//		 http.authorizeRequests()
//		 .antMatchers("/page1", "/page2").permitAll()
//		 .antMatchers("/welcome", "/hello").hasRole("USER").anyRequest()
//		 .authenticated()
//		 .and()
//		 .formLogin().loginPage("/login")
//		 .permitAll().defaultSuccessUrl("/welcome")//successForwardUrl("/welcome")
//		 .and()
//		 .logout().logoutUrl("/logout").
//		 logoutSuccessUrl("/login?logout")
//		 .invalidateHttpSession(true)
//		 .deleteCookies("JSESSIONID")
//		 .and()
//		 .csrf()
//		 ;

		http.authorizeRequests().antMatchers("/page1","/page2").permitAll()
				.antMatchers("/user", "/hello")
				.hasRole("USER").and().formLogin()
				.defaultSuccessUrl("/user").loginPage("/login").and()
				.logout().logoutSuccessUrl("/login?logout")
				.deleteCookies("JSESSIONID").invalidateHttpSession(true).and()
				.csrf();

		/*
		 * .and() .logout() .logoutUrl("logout") .invalidateHttpSession(true)
		 * .deleteCookies("JSESSIONID")
		 */
	}
	
	@Bean
	public PasswordEncoder passwordEncoder(){
		PasswordEncoder encoder =  new BCryptPasswordEncoder();
		return encoder;
	}
	
	
}
