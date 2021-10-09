package com.frames;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class Class3 {

	
		@BeforeClass 

		public static void comp2() {
			System.out.println("company name is : greens.....2");

		}
		@Before
		public void emp2() {
			System.out.println("company name is : greens.......2");
		}
		@After
		public void name2() {
			System.out.println("nme is sundari.......2");

		}
		@Test
		public void info2() {
		System.out.println("company info........2");
		}

		@AfterClass
		public static void hi2() {
			System.out.println("welcome........2");

		}
		}
}
