package TwoD_Arrays;

public class As5_Vigenere {
    public static void run() {
        char[] alphabet = {'A','B','C','D','E','F','G','H','I','J','K',
                'L','M','N','O','P','Q','R','S','T','U','V','W','X','Y','Z'};
        char[][] vigenere =createVSquare(alphabet);
        printSquare(vigenere);
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

    public static void printSquare(char[][] square) {
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

}//end class
