package test;
import org.junit.Assert;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.Before;
public class ClassTest {
private QuizOneJunit1 quiz;
    
    @Before
    public void setUp() {
        quiz = new QuizOneJunit1();
    }
    
    @Test
    public void testSquare() {
        Assert.assertEquals(0, quiz.square(0));
        Assert.assertEquals(1, quiz.square(1));
        Assert.assertEquals(4, quiz.square(2));
        Assert.assertEquals(9, quiz.square(3));
        Assert.assertEquals(16, quiz.square(4));
    }
    
    @Test
    public void testCountLetterA() {
        Assert.assertEquals(0, quiz.countLetterA(""));
        Assert.assertEquals(0, quiz.countLetterA("bcd"));
        Assert.assertEquals(1, quiz.countLetterA("abc"));
        Assert.assertEquals(1, quiz.countLetterA("BCD"));
        Assert.assertEquals(2, quiz.countLetterA("aAbcA"));
    }
    
    @Test
    public void testCheckTwoLetter() {
        Assert.assertFalse(quiz.checkTwoLetter(""));
        Assert.assertFalse(quiz.checkTwoLetter("a"));
        Assert.assertTrue(quiz.checkTwoLetter("aa"));
        Assert.assertFalse(quiz.checkTwoLetter("ab"));
        Assert.assertTrue(quiz.checkTwoLetter("abcdefab"));
    }

	
	   

	}



