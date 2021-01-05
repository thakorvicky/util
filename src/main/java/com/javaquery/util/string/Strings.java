package com.javaquery.util.string;

import com.javaquery.util.Objects;

/**
 * @author vicky.thakor
 * @since 1.0
 */
public class Strings {

	/**
	 * Returns {@code true} if the provided String is {@code null} or empty otherwise
	 * returns {@code false}.
	 *
	 * @param str a String to be checked against {@code null} or non-empty
	 * @return {@code true} if the provided String is {@code null} or empty
	 * otherwise {@code false}
	 */
	public static boolean nullOrEmpty(String str){
		return Objects.isNull(str) || str.trim().isEmpty();
	}

	/**
	 * Returns {@code true} if the provided String is non-{@code null} and non-empty otherwise
	 * returns {@code false}.
	 *
	 * @param str a String to be checked against non-{@code null} and non-empty
	 * @return {@code true} if the provided String is non-{@code null} and non-empty
	 * otherwise {@code false}
	 */
	public static boolean nonNullNonEmpty(String str){
		return Objects.nonNull(str) && !str.trim().isEmpty();
	}
}
