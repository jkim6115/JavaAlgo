package org.example.programmers.recursion;

public class 쿼드압축_후_개수_세기 {
    public int[] solution(int[][] arr) {
        Count count = count(0, 0, arr.length, arr);
        return new int[] {count.zero, count.one};
    }

    private static class Count {
        private final int zero;
        private final int one;

        public Count(int zero, int one) {
            this.zero = zero;
            this.one = one;
        }

        public Count add (Count other) {
            return new Count(zero + other.zero, one + other.one);
        }
    }

    private Count count(int offSetX, int offSetY, int size, int[][] arr) {
        int h = size / 2;
        for (int x = offSetX; x < offSetX + size; x++) {
            for (int y = offSetY; y < offSetY + size; y++) {
                if (arr[y][x] != arr[offSetY][offSetX]) {
                    return count(offSetX, offSetY, h, arr)
                            .add(count(offSetX + h, offSetY, h, arr))
                            .add(count(offSetX, offSetY + h, h, arr))
                            .add(count(offSetX + h, offSetY + h, h, arr));
                }
            }
        }

        if (arr[offSetY][offSetX] == 1) {
            return new Count(0, 1);
        }

        return new Count(1, 0);
    }
}
