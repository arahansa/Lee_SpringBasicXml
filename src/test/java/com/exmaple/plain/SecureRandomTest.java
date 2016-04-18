package com.exmaple.plain;

import java.math.BigInteger;
import java.security.SecureRandom;
import java.util.Random;
import java.util.stream.IntStream;

import org.junit.Test;

public class SecureRandomTest {
	private SecureRandom random = new SecureRandom();
	
	@Test
	public void secureRandom() throws Exception {
		System.out.println("랜덤  :"+nextSessionId());
		System.out.println("랜덤 숫자 길이 :"+nextSessionId().length());
		Random random = new Random();
        System.out.println("랜덤스트링 : "+generateRandomString(random, 10));
        System.out.println("랜덤스트링 : "+generateRandomString(random, 10));
        System.out.println("랜덤스트링 길이 : "+generateRandomString(random, 10).length());
	}

	

	public String nextSessionId() {
		return new BigInteger(130, random).toString(32);
	}
	
	
	 private static String generateRandomString(Random random, int length){
	        return new Random().ints(48,122)
	                .filter(i-> (i<57 || i>65) && (i <90 || i>97))
	                .mapToObj(i -> (char) i)
	                .limit(length)
	                .collect(StringBuilder::new, StringBuilder::append, StringBuilder::append)
	                .toString();
	    }
}
