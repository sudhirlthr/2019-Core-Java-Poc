package com.wavemaker.insta;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

@SpringBootApplication
public class InstaPocApplication {

	public static void main(String[] args) throws IOException {
		SpringApplication.run(InstaPocApplication.class, args);
		GetURL.getUrl().get("url").forEach(value -> System.out.println(value));
		
	}
	
}

class GetURL{
	 
	public static Map<String, List<String>> getUrl() throws IOException {
		
		String url = "https://www.instagram.com/explore/tags/dog/?__a=1";
		RestTemplate restTemplate = new RestTemplate();
		ResponseEntity<String> responseEntity = restTemplate.getForEntity(url, String.class);
		ObjectMapper mapper = new ObjectMapper();
		JsonNode root = mapper.readTree(responseEntity.getBody());
		
		//System.out.println(root.get("graphql").get("hashtag"));
		root = root.get("graphql").get("hashtag").get("edge_hashtag_to_media");
		//System.out.println(root);
		List<JsonNode> listOfFNodes = root.findValues("edges");
		//System.out.println(listOfFNodes);
		List<String> listOfUrl = new ArrayList<>();
		Map<String, List<String>> urlMap = new HashMap();
		for(JsonNode jNode:listOfFNodes.get(0)) {
			//System.out.println(jNode.findValuesAsText("display_url").get(0));
			listOfUrl.add(jNode.findValuesAsText("display_url").get(0));
		}		
		urlMap.put("url", listOfUrl);
		return urlMap;
	}
}
