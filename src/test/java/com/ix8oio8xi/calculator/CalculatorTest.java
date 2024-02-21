package com.ix8oio8xi.calculator;

import com.ix8oio8xi.parser.common.ParseException;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CalculatorTest {
    @Test
    public void example() {
        testImpl("12 + 5 * 8 - (3 / 4)", 52);
    }

    @Test
    public void simpleAddSubtract() {
        testImpl("2 + 2", 4);
        testImpl("10 + 23", 33);
        testImpl("16 - 2", 14);
        testImpl("18 - 30", -12);
        testImpl("12 + 22 - 10 - 4 + 3", 23);
    }

    @Test
    public void simpleMultiplyDivide() {
        testImpl("2 * 2", 4);
        testImpl("31 * 10", 310);
        testImpl("15 / 3", 5);
        testImpl("12 / 5", 2);
        testImpl("2 * 4 * 10 / 5 / 2", 8);
    }

    @Test
    public void correctParentheses() {
        testImpl("(2 + 2) * 2", 8);
        testImpl("(2 * 4) * (55 / 5)", 88);
        testImpl("(5 - 8) * 2", -6);
        testImpl("(777)", 777);
        testImpl("(1000) - (7)", 993);
    }

    @Test
    public void negativeNumbers() {
        testImpl("2 + -5", -3);
        testImpl("-2 - -6", 4);
        testImpl("3 + -4 * 5", -17);
        testImpl("99 / -3", -33);
    }

    @Test
    public void brackets() {
        testImpl("(4)", 4);
        testImpl("(2 + 7)", 9);
        testImpl("(2 + 3) * (7 - 4)", 15);
        testImpl("((((44 - 22))))", 22);
    }

    @Test
    public void power() {
        testImpl("2 ** 3", 8);
        testImpl("2 ** 3 ** 2", 512);
        testImpl("16 ** 2 ** 0", 16);
        testImpl("6 * 5 + 16 ** 2 ** 0", 46);
    }

    @Test
    public void invalidExample() {
        throwsImpl("/7()++(()()()3940494");
    }

    @Test
    public void skipOrDoubleSigns() {
        throwsImpl("2 - + 4");
        throwsImpl("2 4");
        throwsImpl("2 * 4 + + + 9");
        throwsImpl("(22) - (12 -* 6) - 9");
    }

    @Test
    public void invalidBrackets() {
        throwsImpl("((3 - 8)");
        throwsImpl("(2 - ) 5");
        throwsImpl("((3) + 4))");
        throwsImpl("2 + 4 (-) 8");
    }

    private static void testImpl(String input, int expected) {
        CalcParser parser = new CalcParser(input);
        Assertions.assertEquals(expected, parser.parse().res);
    }

    private static void throwsImpl(String input) {
        Assertions.assertThrows(ParseException.class, () -> new CalcParser(input).parse());
    }
}
