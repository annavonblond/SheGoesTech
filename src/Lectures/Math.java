package Lectures;

import java.util.Scanner;

public class Math {
    public static void main(String[] args){

    float num = 5.956f;
        System.out.println(num);

        //Rounding down
        System.out.println(java.lang.Math.floor(num));

        //Rounding up
        System.out.println(java.lang.Math.ceil(num));

        //Rounding according to Lectures.Math principles
        System.out.println(java.lang.Math.round(num));

        //Absolute value
        System.out.println(java.lang.Math.abs(-2));

        //Power
        System.out.println(java.lang.Math.pow(2,2));

        //Square root
        System.out.println(java.lang.Math.sqrt(64));

        //Finding max value between two values
        System.out.println(java.lang.Math.max(6,9));

        //Finding min value between two values
        System.out.println(java.lang.Math.min(78,89));

        //Random value
        System.out.println(java.lang.Math.random()* 10);

        //Casting (move to the small flat)
        System.out.println((int) 99.989);

        System.out.println("Miles to kilometres" + (60 * 1.6) + ".");

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter speed in mp/h");

        float speed = scanner.nextFloat();
        System.out.println(speed + "mp/h in km/h would be equal to " + speed * 1.6f + "km/h");




    }


    }


