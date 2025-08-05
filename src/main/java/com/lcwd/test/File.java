package com.lcwd.test;

import java.util.List;

public class File {

    // Method 1: Count words in a sentence
    public int countWords(String sentence) {
        if (sentence == null || sentence.isBlank()) {
            return 0;
        }
        return sentence.trim().split("\\s+").length;
    }

    // Method 2: Calculate average length of words
    public double averageWordLength(List<String> words) {
        if (words == null || words.isEmpty()) {
            throw new IllegalArgumentException("Word list cannot be null or empty");
        }
        int totalLength = words.stream().mapToInt(String::length).sum();
        return (double) totalLength / words.size();
    }

    // Method 3: Check if a word is a palindrome
    public boolean isPalindrome(String word) {
        if (word == null) {
            return false;
        }
        String clean = word.replaceAll("\\s+", "").toLowerCase();
        return clean.equals(new StringBuilder(clean).reverse().toString());
    }
}
