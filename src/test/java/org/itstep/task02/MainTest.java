package org.itstep.task02;

import junit.framework.TestCase;
import org.junit.Assert;
import org.junit.Test;

import static org.itstep.task02.Main.getPositiveLessHundredNumber;

public class MainTest extends TestCase {
    @Test
    public void testWork() {
        try {
            getPositiveLessHundredNumber(2);
            getPositiveLessHundredNumber(20);
            getPositiveLessHundredNumber(99);
        } catch (NegativeNumberException e) {
            e.printStackTrace();
        }
    }


    @Test
    public void testNegativeNumberException() {
        try {
            getPositiveLessHundredNumber(-1);
        } catch (NegativeNumberException e) {
            Assert.assertTrue(true);
            return;
        }
        Assert.fail();

    }

    @Test
    public void testGreatHundredException() {
        try {
            getPositiveLessHundredNumber(101);
        } catch (NegativeNumberException | GreatHundredException e) {
            if (e instanceof GreatHundredException) {
                Assert.assertTrue(true);
                return;
            }
        }
        Assert.fail();
    }


}