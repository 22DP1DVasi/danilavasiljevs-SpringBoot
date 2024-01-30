package lv.rvt;

import org.junit.Test;

import rvt.MainProgram;
import rvt.Sorter;
import scala.collection.immutable.ArraySeq;

import static org.junit.Assert.assertEquals;
import Arrays;

public class SorterTest {

    @Test
    public void testSmallest() {
        int[] intArray = {3, 7, 0, 6, 4356, 4, 12};
        assertEquals(0, Sorter.smallest(intArray));
    }

    @Test
    public void testIndexOfSmallest() {
        int[] intArray = {3, 7, 0, 6, 4356, 4, 12};
        assertEquals(2, Sorter.indexOfSmallest(intArray));
    }

    @Test
    public void testIndexOfSmallestFrom() {
        // indices:       0  1  2  3   4
        int[] numbers = {-1, 6, 9, 8, 12};
        assertEquals(0, Sorter.indexOfSmallestFrom(numbers, 0));
        assertEquals(1, Sorter.indexOfSmallestFrom(numbers, 1));
        assertEquals(3, Sorter.indexOfSmallestFrom(numbers, 2));
    }

    
    public void testSwap() {
        int[] numbers = {3, 2, 5, 4, 8};
        
        System.out.println(Arrays.toString(numbers));

        Sorter.swap(numbers, 1, 0);
        System.out.println(Arrays.toString(numbers));

        Sorter.swap(numbers, 0, 3);
        System.out.println(Arrays.toString(numbers));
    }
}
