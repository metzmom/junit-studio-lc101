package test;

import main.BalancedBrackets;
import org.junit.Test;

import static org.junit.Assert.*;

public class BalancedBracketsTest {

    //TODO: add tests here
    @Test
    public void emptyTest() {
        assertEquals(true, true);
    }

    @Test
    public void onlyBracketsReturnsTrue() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("[]"));
    }

    @Test
    public void hasRightBracketBeforeLeftBracketReturnsFalse() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("]["));
    }

    @Test
    public void hasLeftBracketBeforeRightBracketReturnsTrue() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("[]"));
    }

    @Test
    public void hasOnlyRightBracketReturnsFalse() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("]"));
    }
    @Test
    public void hasOnlyLeftBracketReturnsFalse() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("["));
    }
    @Test
    public void worksWithTextBetweenBalancedBrackets() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("[abcdef]xyz"));
    }
    @Test
    public void worksWithTextBetweenUnbalancedBrackets() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("[abcdef]x[yz"));
    }
    @Test
    public void worksWithNestedBrackets() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("[ab[cdef]x]yz"));
    }
    @Test
    public void worksWithMultipleSetsOfBrackets() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("[abcdef]x[yz]"));
    }

    @Test
    public void hasTooManyLeftBrackets() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("[[abcdef]x[yz]"));
    }
    @Test
    public void hasTooManyRightBrackets() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("[[abcdef]x][yz]]"));
    }
    @Test
    public void worksWithStringWithNoBrackets() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("abcdefg"));
    }

}
