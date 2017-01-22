package com.code.regext;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class FileFind {

	public static void main(String[] args) {
		Pattern p = Pattern.compile("\\w*the\\w*", Pattern.CASE_INSENSITIVE);
		File file = new File(
				"E:\\Git\\Code\\JavaStudy\\src\\com\\code\\regext\\AI.txt");
		BufferedReader reader = null;
		try {
			reader = new BufferedReader(new FileReader(file));
			String lineContent = null;
			int lineNum = 1;
			while (null != (lineContent = reader.readLine())) {
				System.out.println("line " + lineNum + " : " + lineContent);
				lineNum++;
				Matcher m = p.matcher(lineContent);
				while (m.find()) {
					System.out.println("At index: " + m.start() + "-"
							+ (m.end() - 1) + ", result: " + m.group());
				}
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			if (null != reader) {
				try {
					reader.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}

	}

}
