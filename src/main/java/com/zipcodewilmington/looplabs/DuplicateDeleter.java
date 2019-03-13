package com.zipcodewilmington.looplabs;


import java.util.Arrays;

/**
 * Created by leon on 1/25/18.
 */
public abstract class DuplicateDeleter<T> implements DuplicateDeleterInterface<T> {
    protected T[] array;


    public DuplicateDeleter(T[] intArray) {
        this.array = intArray;
    }

     public T[] removeDuplicates(int maxNumberOfDuplications) {
        //Copy original array
        T[] newArray = array.clone();
        int count = 0;
        //Looking for type something in the array
        for (T something : array) {
        //used previous method// the #ofOccurrences// must be less than the max#
            if (getNumberOfOccurrences(something) < maxNumberOfDuplications) {
                newArray[count] = something;
        //the count of the arrary is
                count++;
            }
        }
        return Arrays. copyOfRange(newArray, 0, count);
     }

     public T[] removeDuplicatesExactly(int exactNumberOfDuplications){
        T[] otherArray = array.clone();
        int count = 0;
            for(T something : array){
                if(!(getNumberOfOccurrences( something) == exactNumberOfDuplications)){
                    otherArray[count] = something;
                    count++;
                }
            }
        return Arrays.copyOfRange(otherArray, 0, count);
     }


    public int getNumberOfOccurrences(T object) {
        int count = 0;

        for (T type : array) {
            if(type == object) {
                count++;
            }
        }
              return count;
    }

}



