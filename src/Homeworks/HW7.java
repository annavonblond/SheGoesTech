package Homeworks;

import java.util.Scanner;

public class HW7 {
    public static void main(String[] args) {
        System.out.println("Enter positive number");
        Scanner scanner = new Scanner (System.in);
        int size = scanner.nextInt();



        int ArrayHW [] = new int [size];
        for (int i = 0; i < size; i ++){
            System.out.println("PLease enter element number " + (i + 1));
            int input = scanner.nextInt();
            ArrayHW[i] = scanner.nextInt();
        }

        //Printing out all array's elements using For-each loop
        System.out.println("Source Array: ");
        for(int temp : ArrayHW){
            System.out.println((temp + " "));
        }
    }
}
