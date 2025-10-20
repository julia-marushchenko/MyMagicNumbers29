// Java program to find numbers dividable by 3

package com.numbers;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

// Main class
public class Main {

    // Main method to run java program
    public static void main(String[] args) {

        // Creating set of unic numbers
        Set<Integer> set = new HashSet<>();

        // Adding numbers to a set
        for (int index = 100; index > 0; index--) {

            // Adding numbers to set
            set.add(index);
        }

        // Checking if numbers are dividable by 3 and printing the result
        // Creating iterator to go through all elements of the set
        Iterator<Integer> it = set.iterator();

        // Checking if set contains next element
        while (it.hasNext()) {

            // Saving value of current element of the set
            int number = it.next();

            // Condition to be dividable by 3
            if (number % 3 == 0) {

                // Printing result to console
                System.out.println(number + " is dividable by 3.");
            } else {

                // Printing result to console
                System.out.println(number + " is not dividable by 3.");
            }
        }
    }
}