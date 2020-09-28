package id.ac.ui.cs.mobileprogramming.syifa.lab1;

import org.junit.Test;

import static org.junit.Assert.*;
import static id.ac.ui.cs.mobileprogramming.syifa.lab1.MainActivity.Number;
import static id.ac.ui.cs.mobileprogramming.syifa.lab1.MainActivity.isNumeric;

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
public class ExampleUnitTest {
    @Test
    public void addition_isCorrect() {
        assertEquals(4, 2 + 2);
    }

    @Test
    public void inputText_isNumeric() {
        assertTrue(isNumeric("1"));
    }

    @Test
    public void inputText_isNotNumeric() {
        assertFalse(isNumeric("a"));
    }

    @Test
    public void inputText_isLeapYear(){
        Number number = new Number(2020);
        assertTrue(number.isLeapYear());
    }

    @Test
    public void inputText_isNotLeapYear(){
        Number number = new Number(2019);
        assertFalse(number.isLeapYear());
    }

    @Test
    public void onCreate_isActive() {
        assertFalse(isNumeric("text"));
    }
}