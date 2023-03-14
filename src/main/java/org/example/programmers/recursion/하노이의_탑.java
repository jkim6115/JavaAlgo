package org.example.programmers.recursion;

import java.util.ArrayList;
import java.util.List;

public class 하노이의_탑 {
    public int[][] solution(int n) {
        List<int[]> process = new ArrayList<>();
        hanoi(n, 1, 3, process);
        return process.toArray(new int[0][]);
    }

    private void hanoi(int n, int from, int to, List<int[]> process) {
        if (n == 1) {
            process.add(new int[] {from, to});
            return;
        }

        int empty = 6 - from - to;

        List<int[]> result = new ArrayList<>();
        hanoi(n - 1, from, empty, process);
        hanoi(1, from, to, process);
        hanoi(n - 1, empty, to, process);
    }
}
