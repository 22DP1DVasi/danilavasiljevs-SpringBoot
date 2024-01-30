package rvt;

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
        int temporaryIndexHolder = index1;
        array[index1] = array[index2];
        array[index2] = array[temporaryIndexHolder];
    }    

}
