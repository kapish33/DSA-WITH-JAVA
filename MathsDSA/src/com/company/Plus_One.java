package com.company;

public class Plus_One {
    public int[] plusOne(int[] digits) {

        return addToGivenIndex(digits, digits.length - 1);

    }

    private int[] addToGivenIndex(int[] arr, int index) {

        if(arr[index] != 9) {
            arr[index] += 1;
            return arr;
        }

        arr[index] = 0;

        if(index == 0) {
            int[] newArr = new int[arr.length + 1];
            newArr[0] = 1;
            for(int i = 0; i < arr.length; i++) {
                newArr[i + 1] = arr[i];
            }
            return newArr;
        }

        return addToGivenIndex(arr, index - 1);
    }
}
