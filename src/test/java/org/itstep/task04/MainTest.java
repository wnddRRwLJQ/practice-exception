package org.itstep.task04;

import junit.framework.TestCase;
import org.junit.Assert;
import org.junit.Test;

import static org.itstep.task04.Main.binarySearch;

public class MainTest extends TestCase {

    @Test
    public void testWork(){
        try {
            Assert.assertEquals(1, binarySearch(new int[]{2, 3, 5, 6, 7, 8, 9}, 3));
            Assert.assertEquals(4, binarySearch(new int[]{2, 3, 5, 6, 7, 8, 9}, 7));
            Assert.assertEquals(6, binarySearch(new int[]{2, 3, 5, 6, 7, 8, 9}, 9));
        } catch (SortingArrayException e) {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void testSortingArrayException(){
        boolean a = false, b = false, c = false;
        try {
            Assert.assertEquals(6, binarySearch(new int[]{30, 3, 5, 6, 7, 8, 9}, 9));
        } catch (SortingArrayException e) {
            a = true;
        }
        try {
            Assert.assertEquals(6, binarySearch(new int[]{4, 3, 7, 6, 7, 8, 9}, 9));
        } catch (SortingArrayException e) {
            b = true;
        }
        try {
            Assert.assertEquals(6, binarySearch(new int[]{2, 3, 5, 6, 7, 10, 9}, 9));
        } catch (SortingArrayException e) {
            c = true;
        }

        if (a && b && c){
            Assert.assertTrue(true);
        } else {
            Assert.fail();
        }
    }

}
