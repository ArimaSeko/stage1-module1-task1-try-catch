package com.epam.m1.exceptions;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/**
 * Complete the code, parse integers, calculate the sum of numbers in the WORDS, join strings with
 * space delimiter
 */
public class ParseIntegers {

    private static final List<String> WORDS =
            Arrays.asList(
                    "JDK 17 has released on 14 September 2021 with 10 new features, 2 feature removals and 2 feature deprecations."
                            .split(" "));

    public static void main(String[] args) {

        String justWords = "";
        int sum = 0;
        Iterator<String> words = null;
        try {
            words = WORDS.iterator();
            while (words.hasNext()) {
                String next = words.next();
                int number = 0;

                try {
                    number = Integer.parseInt(next);
                    sum = sum + number;
                } catch (NumberFormatException e) {
                    // Ignore if next is not an integer
                }

                justWords += next + " ";
            }

        } finally {
            System.out.println("Sum is " + sum);
            System.out.println("Just words:" + justWords);
        }
    }
}

