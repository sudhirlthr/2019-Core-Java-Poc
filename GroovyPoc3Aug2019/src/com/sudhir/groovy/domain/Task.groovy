package com.sudhir.groovy.domain

import groovy.transform.EqualsAndHashCode
import groovy.transform.ToString

@EqualsAndHashCode
@ToString
class Task {
	String name;
	int priority;
	Date startDate;
	Date endDate;
}
