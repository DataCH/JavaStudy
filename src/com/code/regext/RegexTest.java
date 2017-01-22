package com.code.regext;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexTest {

	public static void main(String[] args) {
		String str = "Artificial intelligence (AI) is intelligence exhibited by machines. In computer science, an ideal \"intelligent\" machine is a flexible rational agent that perceives its environment and takes actions that maximize its chance of success at some goal.";
		Pattern p = Pattern.compile("\\w+");
		Matcher m = p.matcher(str);
		while (m.find()) {
			System.out.println("At index: " + m.start() + "-" + (m.end() - 1)
					+ ", result: " + m.group());
		}

		System.out.println("================================================");

		Pattern p2 = Pattern.compile("(\\w*in\\w*)", Pattern.CASE_INSENSITIVE);
		Matcher m2 = p2.matcher(str);
		while (m2.find()) {
			System.out.println("At index: " + m2.start() + "-" + (m2.end() - 1)
					+ ", result: " + m2.group());
		}
	}
}
