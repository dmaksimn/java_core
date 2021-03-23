package com.Lesson;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task9 {

	public static void main(String[] args) {

		String  string  = "I love java";
		Pattern pattern = Pattern.compile("(\\w+)");
		Matcher matcher = pattern.matcher(string);

		if(matcher.find()) {
			String[] split = string.split("(\\w+)+");
			System.out.println("The number of words = " + split.length);
		}else {
			System.out.println("Delimiters not find");
		}
	}
}
