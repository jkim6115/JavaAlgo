package org.example.programmers.string;

public class 삼진법_뒤집기 {
    public int solution(int n) {
        String str = Integer.toString(n, 3);
        String reversed = new StringBuilder(str).reverse().toString();

        return Integer.valueOf(reversed, 3);
    }
}
