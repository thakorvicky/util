package com.javaquery.util;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * @author vicky.thakor
 * @since 1.0
 */
public class TestObjects {

	@Test
	public void test_isNull(){
		Assertions.assertTrue(Objects.isNull(null));
	}

	@Test
	public void test_NonNull(){
		Assertions.assertTrue(Objects.nonNull(new Object()));
	}
}
