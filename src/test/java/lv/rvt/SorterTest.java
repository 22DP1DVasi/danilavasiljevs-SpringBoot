package lv.rvt;

import org.junit.Test;

import rvt.MainProgram;
import rvt.Sorter;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;
import java.util.ArrayList;

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

    @Test
    public void testSwap(){
        int[] numbers = {3, 2, 5, 4, 8};
        int[] numbersToTest1 = {2, 3, 5, 4, 8};
        Sorter.swap(numbers, 1, 0);
        assertArrayEquals(numbersToTest1, numbers);

        int[] numbersToTest2 = {4, 3, 5, 2, 8};
        Sorter.swap(numbers, 0, 3);
        assertArrayEquals(numbersToTest2, numbers);
    }

    @Test
    public void testSort(){
        int[] numbers = {8, 3, 7, 9, 1, 2, 4};
        int[] sortedNumbers = {1, 2, 3, 4, 7, 8, 9};
        Sorter.sort(numbers);

        assertArrayEquals(sortedNumbers, numbers);
    }

    @Test
    public void testBinarySearch(){
        ArrayList<Integer> numbers = new ArrayList<Integer>();
        numbers.add(9);
        numbers.add(-2);
        numbers.add(55);
        numbers.add(0);
        numbers.add(-20);
        numbers.add(800);

        // ArrayList gets sorted. It must sorted for method to work
        assertEquals(5, Sorter.binarySearch(numbers, 800));
    }

}
