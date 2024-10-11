/*
Daily Coding Problem
Good morning! Here's your coding interview problem for today.

This problem was asked by Microsoft.

Given an array of numbers and a number k, determine if there are three entries in the array
which add up to the specified number k.
For example, given [20, 303, 3, 4, 25] and k = 49,
return true as 20 + 4 + 25 = 49.
*/


package y2024.m10.d10;

import java.util.HashSet;
import java.util.Set;

public class First {
    int[] numbers = new int[]{20, 303, 3, 4, 25};
    int k = 49;

    int result = 0;
    int counter = 0;
    Set<Set<Integer>> tableOfSets = new HashSet<>();

    public boolean addUpThreeEntries() {
        for (int i = 0; i < numbers.length; i++) {
            for (int j = 0; j < numbers.length; j++) {
                if (i == j) continue;
                for (int l = 0; l < numbers.length; l++) {
                    if (l == i || l == j) continue;
                    if (doesSetOfNumbersAlreadyExist(i, j, l)) continue;
                    result = numbers[i] + numbers[j] + numbers[l];
                    counter++;
                    if (result == k) {
                        System.out.println(numbers[i] + " + " + numbers[j] + " + " + numbers[l] + " = " + result);
                        System.out.println("true - iterations: " + counter);
                        return true;
                    }
                }
            }
        }
        System.out.println("false - iterations: " + counter);
        return false;
    }

    private boolean doesSetOfNumbersAlreadyExist(int a, int b, int c) {
        Set<Integer> numbers = Set.of(a, b, c);
        if (tableOfSets.contains(numbers)) {
            return true;
        }
        tableOfSets.add(numbers);
        return false;
    }
}
