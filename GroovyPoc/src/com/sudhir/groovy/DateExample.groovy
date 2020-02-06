package com.sudhir.groovy

import java.text.DateFormat
import java.text.SimpleDateFormat

class DateExample {
	
	def someMethod() {
		println("Hello world")
		DateFormat inputFormat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss'Z'");
		//inputFormat.setTimeZone(TimeZone.getTimeZone("GMT"));
		Date date = inputFormat.parse("2018-10-06T00:00:00Z");
		
		// Format date into output format
		DateFormat outputFormat = new SimpleDateFormat("dd MMM yyyy");
		String outputString = outputFormat.format(date);
		println(outputString)
	}
}
