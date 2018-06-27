package com.ibexsys.codewars.other;

import java.util.Collections;

public class Accumul {

	
    public static String accum(String s) {
        String result = "";
        
        for(int i = 0; i < s.length(); i++) {
            result += Character.toUpperCase(s.charAt(i))
            + String.join("", Collections.nCopies(i,  Character.toLowerCase(s.charAt(i)) + "")) + "-";
        } 
        return result.substring(0,result.length()-1);
      } 
	
}
