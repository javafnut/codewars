package com.ibexsys.codewars.mine;

public class Accumul {

	public static String accum(String s) {

		char[] chars = s.toCharArray();
		StringBuilder sb = new StringBuilder();

		for (int i = 0; i < chars.length; i++) {

			sb.append(Character.toUpperCase(chars[i]));

			for (int n = 0; n < i; n++) {
				if (Character.isUpperCase(chars[i])) {
					sb.append(Character.toLowerCase(chars[i]));
				} else {
					sb.append(chars[i]);
				}
			}

			if (i < chars.length - 1) {
				sb.append('-');
			}
		}

		return sb.toString();

	}
	
}
