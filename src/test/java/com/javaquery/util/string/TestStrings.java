package com.javaquery.util.string;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * @author vicky.thakor
 * @since 1.0
 */
public class TestStrings {

	private static final String HELLO = "Hello World!";

	@Test
	public void test_nullOrEmpty1(){
		Assertions.assertTrue(Strings.nullOrEmpty(null));
	}

	@Test
	public void test_nullOrEmpty2(){
		Assertions.assertTrue(Strings.nullOrEmpty(""));
	}

	@Test
	public void test_nullOrEmpty3(){
		Assertions.assertFalse(Strings.nullOrEmpty(HELLO));
	}

	@Test
	public void test_nonNullNonEmpty1(){
		Assertions.assertTrue(Strings.nonNullNonEmpty(HELLO));
	}

	@Test
	public void test_nonNullNonEmpty2(){
		Assertions.assertFalse(Strings.nonNullNonEmpty(null));
	}

	@Test
	public void test_nonNullNonEmpty3(){
		Assertions.assertFalse(Strings.nonNullNonEmpty(""));
	}
}
