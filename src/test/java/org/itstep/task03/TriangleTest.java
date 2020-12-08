package org.itstep.task03;

import junit.framework.TestCase;
import org.junit.Assert;
import org.junit.Test;

public class TriangleTest extends TestCase {

    @Test
    public  void testWork(){
        try {
            new Triangle(1,1,1);
            new Triangle(10,5,6);
            new Triangle(100,70,40);
        } catch (CreateTriangleException e) {
            e.printStackTrace();
            Assert.fail();
        }
        Assert.assertTrue(true);

    }
    @Test
    public void testCreateTriangleException() {
        boolean a = false, b = false, c = false;
        try {
            new Triangle(10, 3, 4);
        } catch (CreateTriangleException e) {
            Assert.assertTrue(true);
            a = true;
        }
        try {
            new Triangle(100, 40, 1);
        } catch (CreateTriangleException e) {
            Assert.assertTrue(true);
            b = true;
        }
        try {
            new Triangle(1111, 1000, 110);
        } catch (CreateTriangleException e) {
            Assert.assertTrue(true);
            c = true;
        }

        if (a && b && c) {
            return;
        } else {
            Assert.fail();
        }
    }

}