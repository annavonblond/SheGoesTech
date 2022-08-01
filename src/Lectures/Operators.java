package Lectures;

public class Operators {
    public static void main(String[] args) {

        // Lectures.Math.java operators + - / * %
        int x = 100;
        x += 100;
        //x = x + 100;
        System.out.println("x = " + x);

        System.out.println(20 * 100);


        //Incrementation operators
        //Post-incrementation
        int num = 10;
        System.out.println("num = " + num++);
        System.out.println("num = " + num);

        //Pre-incrementation
        int num2 = 20;
        System.out.println("num2 = " + ++num2);

        //Increase or decrease variables (4 ways)
        int var = 10;
        var += 1;
        var = var + 1;
        ++var;
        var++;

        var -=1;
        var = var - 1;
        --var;
        var--;

        //Relation operators
        // Equality ==
        int a = 1;
        int b = 10;
        System.out.println("Equality =" + (a == b)); //is a equal to b?

        //Inequality !=
                System.out.println("Inequality - " + (a != b)); // is a not equal to b?

        //Greater than > and greater than or equal to >=
        System.out.println(a > b); //if a is greater than b
        System.out.println(a >= b); // if a is greater or equal to b

        //Less than < and less than or equal to <=
        System.out.println(a < b);
        System.out.println(a <= b);

        //Logical operators
        //Logical AND
        boolean wind = false;
        boolean weather = false;
        System.out.println(wind && weather);

    }
}
