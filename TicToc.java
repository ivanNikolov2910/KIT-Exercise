import java.util.Scanner;

public class TicToc {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char[][] board = new char[3][3];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                board[i][j] = ' ';
            }
        }
        char player = 'x';
        for (int i = 0; i < 9; i++) {
            String[] command = scanner.nextLine().split(",");
            int x = Integer.parseInt(command[0]);
            int y = Integer.parseInt(command[1]);
            if ((x >= 0 && x < 3) && (y >= 0 && y < 3) && (board[x][y] == ' ')){
                board[x][y] = player;
            }else {
                i--;
                System.out.println("WRONG!!!");
            }
            if (player == 'x'){
                player = 'o';
            }else {
                player = 'x';
            }
            for (int k = 0; k < 3; k++) {
                System.out.print("|");
                for (int j = 0; j < 3; j++) {
                    System.out.print(board[k][j] + "|");
                }
                System.out.println();
            }
            for (int j = 0; j < 3; j++) {
                if (board[j][0] == board[j][1] && board[j][0] == board[j][2] && board[j][0] != ' '){
                    System.out.println("Player " + board[j][0] + " won!");
                    return;
                }
                if (board[0][j] == board[1][j] && board[0][j] == board[2][j] && board[0][j] != ' '){
                    System.out.println("Player " + board[j][0] + " won!");
                    return;
                }
            }
            if (board[0][0] == board[1][1] && board[0][0] == board[2][2] && board[0][0] != ' '){
                System.out.println("Player " + board[0][0] + " won!");
                return;
            }else if (board[0][2] == board[1][1] && board[0][2] == board[2][0] && board[0][2] != ' '){
                System.out.println("Player " + board[2][0] + " won!");
                return;
            }
        }
        System.out.println("No winner");
    }
}
