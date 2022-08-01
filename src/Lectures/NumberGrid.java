package Lectures;

public class NumberGrid {
    public static void main(String[] args) {

        int[][] array = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};

        int i;
        int j;
        for (i = 0; i < array.length; i++) {
            for (j = 0; j < array[i].length; j++){
                System.out.println(array[i][j] + " ");
            }
            }

         }


    }
}
