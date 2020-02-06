package com.sudhir.date

import java.text.DateFormat
import java.text.SimpleDateFormat

class DateExample {
	
	def somemethod(){
		println("Hello world")
		DateFormat inputFormat = new SimpleDateFormat("yyyy-MM-ddTHH:mm:ss.Z");
		Date date = inputFormat.parse("2018-10-06T00:00:00Z");
		
		// Format date into output format
		DateFormat outputFormat = new SimpleDateFormat("dd-MM-yyyy");
		String outputString = outputFormat.format(date);
		println(outputString)
	}
}


