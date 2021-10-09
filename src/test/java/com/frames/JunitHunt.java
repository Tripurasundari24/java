package com.frames;

import org.junit.After;

import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;



public class JunitHunt {
@BeforeClass 

public static void comp() {
	System.out.println("company name is : greens");

}
@Before
public void emp() {
	System.out.println("company name is : greens");
}
@After
public void name() {
	System.out.println("nme is sundari");

}
@Test
public void info() {
System.out.println("company info");
}

@AfterClass
public static void hi() {
	System.out.println("welcome");

}
}