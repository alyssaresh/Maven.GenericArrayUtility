package com.zipcodewilmington.arrayutility;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


/**
 * Created by leon on 3/6/18.
 */
public class ArrayUtility<T> {
    private T[] inputArray;

    public ArrayUtility(T[] input) {
        this.inputArray = input;
    }


    public int countDuplicatesInMerge(T[] arrayToMerge, T valueToEvaluate) {
        T[] mergedArray = (T[]) Array.newInstance(inputArray.getClass().getComponentType(), inputArray.length + arrayToMerge.length);
        System.arraycopy(inputArray, 0, mergedArray, 0, inputArray.length);
        System.arraycopy(arrayToMerge, 0, mergedArray, inputArray.length, arrayToMerge.length);
        int totalCount = 0;
        for (T t : mergedArray) {
            if (t.equals(valueToEvaluate)) totalCount++;
        }
        return totalCount;
    }

    public T getMostCommonFromMerge(T[] arrayToMerge) {
        T[] mergedArray = (T[]) Array.newInstance(inputArray.getClass().getComponentType(), inputArray.length + arrayToMerge.length);
        System.arraycopy(inputArray, 0, mergedArray, 0, inputArray.length);
        System.arraycopy(arrayToMerge, 0, mergedArray, inputArray.length, arrayToMerge.length);
        int maxCount = 0;
        T mostFrequentElement = null;
        for (int i = 0; i < mergedArray.length; i++) {
            int count = 0;
            for (int j = 0; j < mergedArray.length; j++) {
                if (mergedArray[j] == mergedArray[i]) {
                    count++;
                }
            }
            if (count > maxCount) {
                maxCount = count;
                mostFrequentElement = mergedArray[i];
            }
        }
        return mostFrequentElement;
    }


    public int getNumberOfOccurrences(T valueToEvaluate) {
        int count = 0;
        for (T t : inputArray) {
            if (t.equals(valueToEvaluate)) {
                count++;
            }
        }
        return count;
    }

    public T[] removeValue(T valueToRemove) {
    int size = 0;
        for (T t : inputArray) {
        if (!t.equals(valueToRemove)) {
            size++;
        }
    }
    // Create a new array of the correct size
    T[] removedArray = (T[]) Array.newInstance(inputArray.getClass().getComponentType(), size);

    // Now, copy the values from inputArray to removedArray, skipping valueToRemove
    int index = 0; // This will track the position in the removedArray
        for (T t : inputArray) {
        if (!t.equals(valueToRemove)) {
            removedArray[index] = t;
            index++;
        }
    }

        return removedArray;
    }
}





//can't figure out why inputArray keeps returning as null, can't get getmostcommon to work
//(but I think duplicates probably isn't working either)