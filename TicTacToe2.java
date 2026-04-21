import java.util.Random;

public class TicTacToe2 {
    public static void main(String[] args) {
        Random rand = new Random();

        int toss = rand.nextInt(2);

        char userSymbol, computerSymbol;
        boolean userTurn;

        if (toss == 0) {
            userSymbol = 'X';
            computerSymbol = 'O';
            userTurn = true;
        } else {
            userSymbol = 'O';
            computerSymbol = 'X';
            userTurn = false;
        }

        System.out.println("User Symbol: " + userSymbol);
        System.out.println("Computer Symbol: " + computerSymbol);

        if (userTurn)
            System.out.println("User plays first");
        else
            System.out.println("Computer plays first");
    }
}