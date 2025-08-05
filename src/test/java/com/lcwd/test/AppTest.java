package com.lcwd.test;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;
import java.util.Arrays;
import static org.junit.jupiter.api.Assertions.*;

class AppTest {

    private final File file = new File();

    // Test for countWords
    @Test
    void testCountWords() {
        assertEquals(4, file.countWords("This is a test"));
        assertEquals(0, file.countWords(""));
        assertEquals(0, file.countWords(null));
    }

    // Parameterized test for palindrome
    @ParameterizedTest
    @ValueSource(strings = {"madam", "racecar", "Level", "noon"})
    void testIsPalindromeTrue(String word) {
        assertTrue(file.isPalindrome(word));
    }

    @Test
    void testIsPalindromeFalse() {
        assertFalse(file.isPalindrome("hello"));
    }

    // Test for averageWordLength
    @Test
    void testAverageWordLength() {
        assertEquals(4.0, file.averageWordLength(Arrays.asList("this", "test")));
    }

    @Test
    void testAverageWordLengthThrowsException() {
        Exception exception = assertThrows(IllegalArgumentException.class,
                () -> file.averageWordLength(Arrays.asList()));
        assertEquals("Word list cannot be null or empty", exception.getMessage());
    }
}
