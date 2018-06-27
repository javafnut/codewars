package com.ibexsys.codewars.other;

import java.util.Arrays;
import java.util.stream.Stream;

public class Xbonacci {

    public double[] tribonacci(double[] start, int n) {
        return Stream.iterate(start, tuple -> applySequenceRule(tuple))
            .mapToDouble(tuple -> tuple[0])
            .limit(n)
            .toArray();
    }
    
    private double[] applySequenceRule(double[] tuple) {
        return new double[]{tuple[1], tuple[2], tuple[0]+tuple[1]+tuple[2]};
    }
	
	
}
