/**
 * 
 */
package com.sudhir.spock.com.sudhir.spock;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sudhir.spock.com.sudhir.spock.groovy.GroovyServices;

/**
 * @author sudhirk
 *
 */
@RestController(value = "/")
public class DefaultController {
	
	@Autowired
	GroovyServices groovyServices;

	@GetMapping(path = "/")
	public String greetings() {
		String resp = groovyServices.customrGeetings();
		if(resp != null)
			return resp;
		else	return "Greetings";
	}
}
