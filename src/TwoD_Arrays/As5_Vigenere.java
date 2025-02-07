package TwoD_Arrays;

public class As5_Vigenere {
    public static void run() {
        char[] alphabet = {'A','B','C','D','E','F','G','H','I','J','K',
                'L','M','N','O','P','Q','R','S','T','U','V','W','X','Y','Z'};
        char[][] vigenere =createVSquare(alphabet);
        printSquare(vigenere, alphabet);

        char[] a = {'O', 'G', 'O', 'G', 'T', 'S', 'E', 'Y', 'N', 'T', 'V', 'C', 'K', 'A'};

        int[] c = {18, 2, 14, 13, 0};


        int[] b = new int[a.length];
        for (int i = 0; i < a.length; i++) {
            b[i] = linearSearch(alphabet, a[i]);
        }


        char[] d = new char[a.length];


        for (int i = 0; i < a.length; i++) {
            int row = c[i % 5];
            int col = 0;
            for (int j = 0; j < 26; j++) {
                if(vigenere[row][j] == alphabet[b[i]]) {
                    col = j;
                }
            }
            d[i] = alphabet[col];

        }

        for (int i = 0; i < d.length; i++) {
            System.out.print(d[i]);
        };

    }

    private static char[][] createVSquare(char[] alphabet) {
        char[][] square = new char[alphabet.length][alphabet.length];
//code to be written

        for (int i = 0; i < 26; i++) {
            for (int j = 0; j < 26; j++) {
                square[j][i] = alphabet[(i + j) % 26];
            }
        }

        return square;

    }//createVSquare

    public static void printSquare(char[][] square, char[] alphabet) {
        for (int i = 0; i < 26; i++) {
            for (int j = 0; j < 26; j++) {
                System.out.print(square[i][j] + " ");
            }
            System.out.println();
        }
    }//end printSquare

    public static int linearSearch (char[] arr, char searchTerm){
        for(int i=0;i<arr.length;i++){
            if(arr[i] == searchTerm){
                return i;
            }
        }
        return -1;
    }

    public static char getChar(char[][] square, int row, int col) {
        return square[row][col];
    }

}//end class
