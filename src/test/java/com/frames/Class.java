package com.frames;

import java.util.List;

import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.RunWith;
import org.junit.runner.notification.Failure;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({JunitHunt.class,Class2.class,Class3.class})
public class Class {
	public static void main(String[] args) {
	
	Result runClasses = JUnitCore.runClasses(JunitHunt.class,Class2.class,Class3.class);
	int runCount = runClasses.getRunCount();
	System.out.println("RunCount :"+ runCount);
	
	int ignoreCount = runClasses.getIgnoreCount();
	System.out.println("ignoreCount:"+ ignoreCount);
	
	int failureCount = runClasses.getFailureCount();
	System.out.println("failureCount:"+failureCount);
	
	List<Failure> failures = runClasses.getFailures();
	
	for (int i = 0; i < failures.size(); i++) {
		String string = failures.get(i).toString();
		System.out.println(string);
	}
	

	}

	
	
	
}
