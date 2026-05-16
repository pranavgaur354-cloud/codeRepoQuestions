package knowBasicRecursion;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static com.google.common.truth.Truth.assertThat;

class StringPalindromeTest {


    @Test
    void oddTest() {
        String sample = "hello";
        boolean expected = false;

        assertThat(StringPalindrome.isPalindrome(sample)).isEqualTo(expected);
        sample = "wow";
        expected = true;
        assertThat(StringPalindrome.isPalindrome(sample)).isEqualTo(expected);


    }

    @Test
    void evenTest() {
        String sample = "gaur";
        boolean expected = false;

        assertThat(StringPalindrome.isPalindrome(sample)).isEqualTo(expected);

        sample = "moom";
        expected = true;
        assertThat(StringPalindrome.isPalindrome(sample)).isEqualTo(expected);

    }

    @Test
    void nullTest() {
        String sample = "";
        boolean expected = true;

        assertThat(StringPalindrome.isPalindrome(sample)).isEqualTo(expected);


    }

    @Test
    void singleElementTest() {
        String sample = "a";
        boolean expected = true;

        assertThat(StringPalindrome.isPalindrome(sample)).isEqualTo(expected);


    }


}