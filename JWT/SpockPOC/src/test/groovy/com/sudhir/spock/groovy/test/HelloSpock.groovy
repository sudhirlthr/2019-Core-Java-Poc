package com.sudhir.spock.groovy.test

import static org.junit.jupiter.api.Assertions.*
import static org.mockito.Mockito.when

import org.junit.jupiter.api.Test
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest

import com.sudhir.spock.com.sudhir.spock.DefaultController
import com.sudhir.spock.com.sudhir.spock.groovy.GroovyServices

import spock.lang.Shared
import spock.lang.Specification

@WebMvcTest(controllers=[DefaultController])
class HelloSpock extends Specification{
	
	@Shared groovyServices
	@Shared String resp
	
	
	// Fixture methods (all 4 are optional)
	
	def setupSpec() {    // Fixture methods : runs once -  before the first feature method
		groovyServices = new GroovyServices()
	}
	
	def setup() {        // Fixture methods : runs before every feature method
		
	}
	
	def cleanup() {      // Fixture methods : runs after every feature method
		
	}
	
	def cleanupSpec() {  // Fixture methods : runs once -  after the last feature method
		
	}
	
	// Feature method : 

	def "default greeting"(){
		 
		when:
				resp = groovyServices.customrGeetings()
		then:
				resp.equals("Sudhir")
	}

}
