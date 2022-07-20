import java.util.Scanner;

public class MathClass {
    public static void main(String[] args){

    float num = 5.956f;
        System.out.println(num);

        //Rounding down
        System.out.println(Math.floor(num));

        //Rounding up
        System.out.println(Math.ceil(num));

        //Rounding according to Math principles
        System.out.println(Math.round(num));

        //Absolute value
        System.out.println(Math.abs(-2));

        //Power
        System.out.println(Math.pow(2,2));

        //Square root
        System.out.println(Math.sqrt(64));

        //Finding max value between two values
        System.out.println(Math.max(6,9));

        //Finding min value between two values
        System.out.println(Math.min(78,89));

        //Random value
        System.out.println(Math.random()* 10);

        //Casting (move to the small flat)
        System.out.println((int) 99.989);

        System.out.println("Miles to kilometres" + (60 * 1.6) + ".");

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter speed in mp/h");

        float speed = scanner.nextFloat();
        System.out.println(speed + "mp/h in km/h would be equal to " + speed * 1.6f + "km/h");




    }


    }


