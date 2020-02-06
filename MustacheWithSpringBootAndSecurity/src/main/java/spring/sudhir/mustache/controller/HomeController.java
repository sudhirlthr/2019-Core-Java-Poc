/**
 * 
 */
package spring.sudhir.mustache.controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 * @author sudhirk
 *
 */
@Controller
public class HomeController {

	@Value("${app.mustache.title}")
	String title = "Welcome to Spring securty";
	
	@Value("${app.spring.url}")
	String springUrl = "https://spring.io/guides/gs/spring-boot/";
	
	@GetMapping("/")
	String greeting() {
		return "welcome";
	}
	
	@GetMapping("/home")
	public ModelAndView home(Map<String, Object> map) {
		map.put("title", title);
		map.put("msg", "Sudhir");
		map.put("Spring", springUrl);
		ModelAndView modelAndView = new ModelAndView("index");
		modelAndView.addObject(map);
		return modelAndView;
	}
}
