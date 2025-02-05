package TwoD_Arrays;

import Utilities.Library;

public class As1_Bingo {
    public static void run(){
        char[] bingo = {'B', 'I', 'N', 'G', 'O'};

        int[][] card = new int[5][5];
       
        card[0] = generateArray(5, 1, 15);
        card[1] = generateArray(5, 16, 30);
        card[2] = generateArray(5, 31, 45);
        card[3] = generateArray(5, 46, 60);
        card[4] = generateArray(5, 61, 75);

        for (int i = 0; i < 5; i++) {
            System.out.print(bingo[i] + " ");
            for (int j = 0; j < 5; j++) {
                System.out.print(card[i][j] + " ");
            }
            System.out.println();
        }

        while(true) {
            Library.input.nextLine();
            int num = Library.myRandom(1, 75);

            for (int i = 0; i < 5; i++) {
                for (int j = 0; j < 5; j++) {
                    if(card[i][j] == num) {
                        card[i][j] *= -1;
                    }
                }
            }

            for (int i = 0; i < 5; i++) {
                System.out.print(bingo[i] + " ");
                for (int j = 0; j < 5; j++) {
                    System.out.print(card[i][j] + " ");
                }
                System.out.println();
            }
        }



    }

    public static int[] generateArray(int length, int min, int max) {
        int[] array = new int[length];

        for (int i = 0; i < length; i++) {
            array[i] = Library.myRandom(min, max);
        }

        return array;
    }

    public static boolean checkRow() {

    }

    public static boolean checkCol() {
        
    }

}