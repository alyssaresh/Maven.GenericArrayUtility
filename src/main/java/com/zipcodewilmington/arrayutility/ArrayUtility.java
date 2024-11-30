package com.zipcodewilmington.arrayutility;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
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
        ArrayList<T> dupes = new ArrayList<>();
        dupes.addAll(Arrays.asList(inputArray));
        dupes.addAll(Arrays.asList(arrayToMerge));
        int duplicates = 0;
        for (T t: dupes){
            if (t == valueToEvaluate){
                duplicates++;
            }
        } return duplicates;
    }
}
