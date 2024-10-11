/*Daily Coding Problem
Good morning! Here's your coding interview problem for today.

This problem was asked by Facebook.

Given three 32-bit integers x, y, and b, return
x if b is 1 and
y if b is 0, using only mathematical or bit operations.
You can assume b can only be 1 or 0.*/


package y2024.m10.d11;

public class First {
    public int result(int x, int y, int b) {
        return x * b + y * (1 - b);
//        return y + b * (x - y);
    }
}
