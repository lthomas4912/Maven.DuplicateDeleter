package com.zipcodewilmington.looplabs;


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
        for (T something : array) {
            if (getNumberOfOccurrences(something) < maxNumberOfDuplications) {
                newArray[count] = something;
                count++;
            }
        }
        return newArray;
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
        return otherArray;
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



