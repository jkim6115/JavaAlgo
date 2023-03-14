package org.example.programmers.recursion;

import java.util.ArrayList;
import java.util.List;

public class 모음_사전 {
    private static final char[] CHARS = "AEIOU".toCharArray();

    public int solution(String word) {
        List<String> words = new ArrayList<>();
        generate("", words);
        return words.indexOf(word);
    }

    private void generate(String word, List<String> words) {
        words.add(word);

        if (word.length() == 5) return;

        for (char c : CHARS) {
            generate(word + c, words);
        }
    }
}
