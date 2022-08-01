package Homeworks;

import java.util.Scanner;

public class HW6 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Print integral number");

        int number = scanner.nextInt();

        if (number >= 0){

            for (int i = number; i >= 0; i--){
                System.out.print(i + " ");
            }

        }else{
            for (int i = number; i <= 0;i++){
                System.out.println(i + " ");
            }
        }



    }
}