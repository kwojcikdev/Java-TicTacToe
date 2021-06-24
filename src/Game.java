


public class Game {

    int [][] table = {{0,0,0},{0,0,0}, {0,0,0}}

    public static void main ( String [] args)
    {

        System.out.println();
        printTable();

    }



    static move
    static private void printTable()
    {
        for(int k=0;k<3;k++)
        {


            for (int i = 0; i < 3; i++) {
                System.out.print("|------");
            }
            System.out.print("|");
            System.out.println();
            for (int i = 0; i < 3; i++) {
                System.out.print("|      ");
            }
            System.out.print("|");
            System.out.println();
            for (int i = 0; i < 3; i++) {
                System.out.print("|      ");
            }
            System.out.print("|");
            System.out.println();


        }

        for (int i = 0; i < 3; i++) {
            System.out.print("|------");
        }
        System.out.print("|");



    }
}
