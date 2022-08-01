package Homeworks;

import java.util.Arrays;

public class HW9 {
    public static void main(String[] args) {

        int[] myArray = {1,2,3,4,5,6,7,8,9,10,11,12};
        System.out.println("Source array: "+ Arrays.toString(myArray));

        int [] newArray = new int[myArray.length];
        for(int i = 0; i < myArray.length; i++){
            newArray[1] = myArray[1];
        }

        System.out.println("Source array: "+ Arrays.toString(myArray));
        System.out.println("New array: "+ Arrays.toString(newArray));




    }










}
