/**
 * 
 */
package spring.sudhir.mustache;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author sudhirk
 *
 */
@RestController("/")
public class Controller {

	@GetMapping("/")
	public String greeting() {
		return "Sudhir";
	}
}
