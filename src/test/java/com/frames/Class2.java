package com.frames;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class Class2 {

		@BeforeClass 

		public static void comp1() {
			System.out.println("company name is : greens...1");

		}
		@Before
		public void emp1() {
			System.out.println("company name is : greens.......1");
		}
		@After
		public void name1() {
			System.out.println("nme is sundari......1");

		}
		@Test
		public void info1() {
		System.out.println("company info......1");
		}

		@AfterClass
		public static void hi1() {
			System.out.println("welcome......1");

		}
		}

