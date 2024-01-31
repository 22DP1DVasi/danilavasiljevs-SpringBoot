package rvt;

import java.util.ArrayList;
import java.util.Collections;  // Import the Collections class

public class Sorter {

    public static int smallest(int[] array){
        int smallestValue = array[0];
        for (int i : array){
            if (i < smallestValue){
                smallestValue = i;
            }
        }
        return smallestValue;
    }

    public static int indexOfSmallest(int[] array){
        int smallestValue = smallest(array);
        for (int i = 0; i < array.length; i++){
            if (array[i] == smallestValue){
                return i;
            }
        }
        return -1;
    }

    public static int indexOfSmallestFrom(int[] table, int startIndex) {
        int smallestValue = table[startIndex];
        int indexOfSmallestValue = startIndex;

        for (int i = startIndex; i < table.length; i++){
            if (table[i] < smallestValue){
                indexOfSmallestValue = i;
            }
        }
        return indexOfSmallestValue;
    }

    public static void swap(int[] array, int index1, int index2) {
        int temporaryItemHolder = array[index1];
        array[index1] = array[index2];
        array[index2] = temporaryItemHolder;
    }

    public static void sort(int[] array) {
        for (int i = array.length; i > 0; i--){
            for (int j = 0; j < i - 1; j++){
                if (array[j] > array[j+1]){
                    int temp = array[j];
                    array[j] = array[j+1];
                    array[j+1] = temp;
                }
            }
        }
    }

    public static int binarySearch(ArrayList<Integer> list, int searchedId){
        Collections.sort(list);  // Sort list

        int begin = 0;
        int end = list.size() - 1;
        int middle = 0;

        while (begin <= end){
            middle = (end + begin) / 2;

            if (list.get(middle) == searchedId){
                return middle;
            }
            
            if (list.get(middle) < searchedId){
                begin = middle + 1;
            }

            if (list.get(middle) > searchedId){
                end = middle - 1;
            }
        }
        return -1;
    }

}
