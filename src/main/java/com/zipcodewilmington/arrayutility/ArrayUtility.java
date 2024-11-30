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
        T value = valueToEvaluate;
        ArrayList<T> dupes = new ArrayList<>(Arrays.asList(inputArray));
        dupes.addAll(Arrays.asList(arrayToMerge));
        int duplicates = 0;
        for (T t: dupes){
            if (t == value) duplicates++;
        } return duplicates;
    }

    public T getMostCommonFromMerge(T[] arrayToMerge) {
        ArrayList<T> merge = new ArrayList<>(Arrays.asList(inputArray));
        merge.addAll(Arrays.asList(arrayToMerge));
        System.out.print(merge);
        int max = 0;
        T maxObj = null;
        int currentNumTotal = 0;
        for (int i = 0; i < merge.size(); i++){
            T currentNum = merge.get(i);
            for (T t : merge){
                if (currentNum == t) {
                    currentNumTotal++;
                }
            } if (currentNumTotal>max){
                maxObj = currentNum;
                max = currentNumTotal;
            }
        } return maxObj;
    }
}


//can't figure out why inputArray keeps returning as null, can't get getmostcommon to work
//(but I think duplicates probably isn't working either)