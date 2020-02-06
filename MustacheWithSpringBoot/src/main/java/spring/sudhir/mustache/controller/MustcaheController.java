/**
 * 
 */
package spring.sudhir.mustache.controller;

import java.nio.charset.Charset;
import java.util.Map;
import java.util.Random;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

import org.fluttercode.datafactory.impl.DataFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import spring.sudhir.mustache.model.Article;

/**
 * @author sudhirk
 *
 */
@RestController("/")
public class MustcaheController {

	@GetMapping(path = "/")
	public String greeting() {
		return "Hi";
	}
	
	@GetMapping(path = "/article")
	public ModelAndView getArticles(Map<String, Object> model) {
		java.util.List<Article> articles = IntStream.range(0, 10).mapToObj(i -> getArticle("Article title "+ i)).collect(Collectors.toList());
		model.put("articles", articles);
		return new ModelAndView("index", model);
	}
	
	private Article getArticle(String title) {
		Article article = new Article();
		DataFactory dataFactory = new DataFactory();
		article.setTitle(title);
		byte[] array = new byte[100];
		new Random().nextBytes(array);
		article.setBody(new String(array, Charset.forName("UTF-8")));
		article.setPublishDate(dataFactory.getBirthDate().toString());
		article.setBody(dataFactory.getName());
		return article;
	}
}
