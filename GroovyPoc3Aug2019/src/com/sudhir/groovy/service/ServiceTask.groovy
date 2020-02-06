package com.sudhir.groovy.service

import org.codehaus.groovy.classgen.ReturnAdder

import com.sudhir.groovy.domain.Task

class ServiceTask {
	
	Task task;
	Task set() {
		task = new Task();
		task.setName("sudhir");
		task.setPriority(5);
		task.setStartDate(new Date());
		task.setEndDate(new Date(1533299458));
		return task;
		
	}
	
	void print(){
		set();
		println task.getName()+"," + task.getPriority()+"," + task.getStartDate()+"," + task.getEndDate();
		println task.toString();// haha
	}
}
