import java.util.Scanner;
import java.util.Random;



public class Game {

    static private Random r;
    public static void main ( String [] args)
    {
        boolean moved = false;
        char [][] board =  resetBoard();

        Scanner scan = new Scanner(System.in);

        printBoard(board);
        while(true){
            int position;

            while (!moved) {

                System.out.print("Enter position (1-9): ");
                position = scan.nextInt();
                if (playerMove(position, board) == 1) moved  = true;

            }
            moved = false;

            checkWin(board);
            enemyMove(board);
            System.out.println();


            printBoard(board);
            if ( checkWin(board) == 1) {
                board = resetBoard();
                printBoard(board);
            }



        }


    }


    static private void printBoard(char [][] board)
    {
        for(char [] row : board)
        {
            for (char x : row)
            {
                System.out.print(x);
            }
            System.out.println();
        }
    }

    static private int playerMove(int position, char[][] board){

        switch (position)
        {
            case 1: if (board[0][0] == ' '){ board[0][0] = 'X'; return 1; }break;
            case 2: if (board[0][2] == ' '){ board[0][2] = 'X'; return 1; }break;
            case 3: if (board[0][4] == ' '){ board[0][4] = 'X'; return 1; }break;
            case 4: if (board[2][0] == ' '){ board[2][0] = 'X'; return 1; }break;
            case 5: if (board[2][2] == ' '){ board[2][2] = 'X'; return 1; }break;
            case 6: if (board[2][4] == ' '){ board[2][4] = 'X'; return 1; }break;
            case 7: if (board[4][0] == ' '){ board[4][0] = 'X'; return 1; }break;
            case 8: if (board[4][2] == ' '){ board[4][2] = 'X'; return 1; }break;
            case 9: if (board[4][4] == ' '){ board[4][4] = 'X'; return 1; }break;
            default:  System.out.println("Not a 1-9 number!"); return 0;

        }
        System.out.println("Position not empty!");
        return 0;
    }

    static private void enemyMove(char[][] board)
        {
            r = new Random();
            boolean moved = false;
            int position;
            while (!moved) {
                position = r.nextInt(8)+1;
                System.out.println("GENERATED: " + position);
                switch (position) {
                    case 1:
                        if (board[0][0] == ' ') {board[0][0] = 'O'; moved = true;}
                        break;
                    case 2:
                        if (board[0][2] == ' ') {board[0][2] = 'O'; moved = true;}
                        break;
                    case 3:
                        if (board[0][4] == ' ') {board[0][4] = 'O'; moved = true;}
                        break;
                    case 4:
                        if (board[2][0] == ' ') { board[2][0] = 'O'; moved = true;}
                        break;
                    case 5:
                        if (board[2][2] == ' ') {board[2][2] = 'O'; moved = true;}
                        break;
                    case 6:
                        if (board[2][4] == ' ') {board[2][4] = 'O'; moved = true;}
                        break;
                    case 7:
                        if (board[4][0] == ' ') {board[4][0] = 'O'; moved = true;}
                        break;
                    case 8:
                        if (board[4][2] == ' ') {board[4][2] = 'O'; moved = true;}
                        break;
                    case 9:
                        if (board[4][4] == ' ') {board[4][4] = 'O'; moved = true;}
                        break;
                    default:
                        break;

                }

            }


        }


        private static int checkWin(char[][] board){
            if (board[0][0] == board [0][2] && board[0][0] == board[0][4] && (board[0][0] == 'X' || board[0][0] == 'O' ))
            {
                System.out.println(board[0][0] + " WINS!");
                return 1;

            }
            else if (board[2][0] == board [2][2] && board[2][0] == board[0][4] && (board[2][0] == 'X' || board[2][0] == 'O' ))
            {
                System.out.println(board[2][0] + " WINS!");
                return 1;
            }
            else if (board[4][0] == board [4][2] && board[4][0] == board[0][4] && (board[4][0] == 'X' || board[4][0] == 'O' ))
            {
                System.out.println(board[4][0] + " WINS!");
                return 1;

            }
            else if (board[0][0] == board [2][0] && board[4][0] == board[0][4] && (board[0][0] == 'X' || board[0][0] == 'O' ))
            {
                System.out.println(board[0][0] + " WINS!");
                return 1;

            }
            else if (board[0][2] == board [2][2] && board[4][2] == board[0][4] && (board[0][2] == 'X' || board[0][2] == 'O' ))
            {
                System.out.println(board[0][2] + " WINS!");
                return 1;


            }
            else if (board[0][4] == board [2][4] && board[4][4] == board[0][4] && (board[0][4] == 'X' || board[0][4] == 'O' ))
            {
                System.out.println(board[0][4] + " WINS!");
                return 1;


            }
            else if (board[0][0] == board [2][2] && board[0][0] == board[4][4] && (board[0][0] == 'X' || board[0][0] == 'O' ))
            {
                System.out.println(board[0][0] + " WINS!");
                return 1;


            }
            else if (board[0][4] == board [2][2] && board[4][0] == board[0][4] && (board[0][4] == 'X' || board[0][4] == 'O' ))
            {
                System.out.println(board[0][0] + " WINS!");
                return 1;


            }

            return 0;



        }


        private static char[][] resetBoard()
        {
            char[][] board = {{' ', '|', ' ', '|', ' '},
                    {'-', '+', '-', '+', '-'},
                    {' ', '|', ' ', '|', ' '},
                    {'-', '+', '-', '+', '-'},
                    {' ', '|', ' ', '|', ' '}};
            return board;
        }



    }
