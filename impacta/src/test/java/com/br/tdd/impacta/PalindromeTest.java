
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;;

public class PalindromeTest {

    private Palindrome palindrome;
    private String input;

    @Test
    public void emptyStringTest() throws Exception {

        input = "";

        assertTrue(palindrome.isPalindrome(input));

    }

    
    @Test
    public void validPalindromeRotatorTest() throws Exception {

        input = "Rotator";

        assertTrue(palindrome.isPalindrome(input));
    }

    @Test
    public void validPalindromeBobTest() throws Exception {

        input = "bob";

        assertTrue(palindrome.isPalindrome(input));
    }

    @Test
    public void invalidPalindromeMadamTest() throws Exception {

        input = "madam";

        assertTrue(palindrome.isPalindrome(input));
    }

    @Test
    public void invalidPalindromeMAlAyAlamTest() throws Exception {

        input = "mAlAyAlam";

        assertTrue(palindrome.isPalindrome(input));
    }

    @Test
    public void singleCharTest() throws Exception {

        input = "1";

        assertTrue(palindrome.isPalindrome(input));

    }


    @Test
    public void punctuationTest() throws Exception {

        input = "Able was I, ere I saw Elba";

        assertTrue(palindrome.isPalindrome(input));
    }

    @Test
    public void punctuationTest2() throws Exception {

        input = "Madam I’m Adam";

        assertTrue(palindrome.isPalindrome(input));
    }

    @Test
    public void punctuationTest3() throws Exception {

        input = "Step on no pets.";

        assertTrue(palindrome.isPalindrome(input));
    }

    @Test
    public void punctuationTest4() throws Exception {

        input = "Top spot!";

        assertTrue(palindrome.isPalindrome(input));
    }

    @Test
    public void unicodeTest() throws Exception {

        input = "02/02/2020";

        assertTrue(palindrome.isPalindrome(input));
    }

     //VALIDE FALSO


    @Test
    public void invalidPalindromeTest() throws Exception {

        input = "xyz";

        assertFalse(palindrome.isPalindrome(input));
    }

    @Test
    public void invalidPalindromeTest1() throws Exception {

        input = "elephant";

        assertFalse(palindrome.isPalindrome(input));
    }

    @Test
    public void invalidPalindromeTest2() throws Exception {

        input = "Country";

        assertFalse(palindrome.isPalindrome(input));
    }

    @Test
    public void invalidPalindromeTest3() throws Exception {

        input = "Top . post!";

        assertFalse(palindrome.isPalindrome(input));
    }

    @Test
    public void invalidPalindromeTest4() throws Exception {

        input = "Wonderful-fool";

        assertFalse(palindrome.isPalindrome(input));
    }
    @Test
    public void invalidPalindromeTest5() throws Exception {

        input = "Wild imagination!";

        assertFalse(palindrome.isPalindrome(input));
    }

}