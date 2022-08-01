package Lectures;

public class CharExamples {
    public static void main(String[] args) {

        char ch = 'a';
        System.out.println(ch);

        ch++;
        System.out.println(ch);

        //Cast from int to char
        System.out.println((char) 122);


        //Print out all lower case alphabet letters
        char letter = 'a';
        for (letter = 'a'; letter < 123; letter++){
            System.out.print(letter + " ");
        }


    }
}
