package Lectures;

public class LoopsBreak {
    public static void main(String[] args) {
        //Break to stop loop before end
        for (int i = 0; i < 10; i++) {
            System.out.println("Hello World");
            if(i == 4) {
                break;
            }
        }

    }
}
