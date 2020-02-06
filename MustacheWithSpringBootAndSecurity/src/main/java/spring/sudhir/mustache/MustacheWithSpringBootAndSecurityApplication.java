package spring.sudhir.mustache;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

@SpringBootApplication
public class MustacheWithSpringBootAndSecurityApplication extends WebSecurityConfigurerAdapter {

	public static void main(String[] args) {
		SpringApplication.run(MustacheWithSpringBootAndSecurityApplication.class, args);
	}

	@Override
	protected void configure(HttpSecurity http) throws Exception {
		
		  http.authorizeRequests() .antMatchers("/login").permitAll()
		  .antMatchers("/**").authenticated() .and().formLogin();
		  //.authenticationEntryPoint(new LoginUrlAuthenticationEntryPoint("/login"));
		 

		/*
		 * http.authorizeRequests().antMatchers("/login").permitAll().antMatchers("/**")
		 * .authenticated().and() .exceptionHandling().authenticationEntryPoint(new
		 * LoginUrlAuthenticationEntryPoint("/login"));
		 */

	}

}
