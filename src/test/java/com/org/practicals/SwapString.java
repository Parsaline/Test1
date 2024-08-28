package com.org.practicals;

public class SwapString {
	public static void main(String[] args) {
		String str1 = "Selenium";
		String str2 = "JAVA";
		System.out.println(str1 +" " +str2);
		str1 = str1 + str2;
		System.out.println (str1);
		System.out.println (str1.length());
		System.out.println (str2.length());
		str2 = str1.substring(0, 8);
		System.out.println (str2);
		str1 = str1.substring(8);
		System.out.println (str1);
		System.out.println(str1 +" " +str2);
	}	
}