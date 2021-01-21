
/**
 * Write a description of class Matching_Game here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.Scanner;

public class Matching_Game
{
    static void clearScreen() {
        System.out.print('\u000C');
    }
    
    static String[][] buildBoard() {
        String[][] board = {{"0","0","0","0","0"},{"0","0","0","0","0"},{"0","0","0","0","0"},{"0","0","0","0","0"},{"0","0","0","0","0"}};
        
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                board[i][j] = "Empty";
            }
        }
        
        return board;
    }
    
    static void printBoard(String[][] board) {
        
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5;j++) {
                System.out.print("    " + board[i][j] + "     ");
            }
            System.out.println();
        }
        
    }
    
    static String[][] customizeBoard(String[][] board) {
        int number = 5;
        int icount = 0;
        int jcount = 0;
        Scanner key = new Scanner(System.in);
        
            for (int i = 0; i < number; i++) {
                for (int j = 0; j < number; j++) {
                    icount = i + 1;
                    jcount = j + 1;
                
                    System.out.println("Give me the value for the string in position " + icount + ", " + jcount + ": ");
                    board[icount][jcount] = key.next();
                }
            }
        
        return board;
    }
    
    static String[][] takeAGuess(String[][] board) {
        Scanner myScanner = new Scanner(System.in);
        int choice;
        
        int x = (int)(Math.random() * 5);
        int y = (int)(Math.random() * 5);
    
        int xLetter = (int)(Math.random() * 5);
        int yLetter = (int)(Math.random() * 5);
        
        System.out.println("You now need to choose what card to pick. Give us the x-coordinate: ");
        choice = myScanner.nextInt();
        if (choice < x)
        {
            System.out.println("I'm sorry, but that is not correct. Try again.");
            System.out.println("Give us the x-coordinate: ");
            choice = myScanner.nextInt();
            if (choice < x)
           {
                System.out.println("I'm sorry, but that is not correct. Try again.");
                System.out.println("Give us the x-coordinate: ");
                choice = myScanner.nextInt();
                if (choice < x)
                {
                    System.out.println("I'm sorry, but that is not correct. Try again.");
                    System.out.println("Give us the x-coordinate: ");
                    choice = myScanner.nextInt();
                    if (choice < x)
                    {
                        System.out.println("I'm sorry, but that is not correct. Try again.");
                        System.out.println("Give us the x-coordinate: ");
                        choice = myScanner.nextInt();
                        if (choice < x)
                        {
                            System.out.println("I'm sorry, but that is not correct. Try again.");
                            System.out.println("Give us the x-coordinate: ");
                            choice = myScanner.nextInt();
                            if (choice < x)
                            {
                                System.out.println("I'm sorry, but that is not correct. Try again.");
                                System.out.println("Give us the x-coordinate: ");
                                choice = myScanner.nextInt();
                            }
                        }
                    }
                }
           }
        }
        if (choice > x)
        {
            System.out.println("I'm sorry, but that is not correct. Try again.");
            System.out.println("Give us the x-coordinate: ");
            choice = myScanner.nextInt();
            if (choice > x)
           {
                System.out.println("I'm sorry, but that is not correct. Try again.");
                System.out.println("Give us the x-coordinate: ");
                choice = myScanner.nextInt();
                if (choice > x)
                {
                    System.out.println("I'm sorry, but that is not correct. Try again.");
                    System.out.println("Give us the x-coordinate: ");
                    choice = myScanner.nextInt();
                    if (choice > x)
                    {
                        System.out.println("I'm sorry, but that is not correct. Try again.");
                        System.out.println("Give us the x-coordinate: ");
                        choice = myScanner.nextInt();
                        if (choice > x)
                        {
                            System.out.println("I'm sorry, but that is not correct. Try again.");
                            System.out.println("Give us the x-coordinate: ");
                            choice = myScanner.nextInt();
                            if (choice > x)
                            {
                                System.out.println("I'm sorry, but that is not correct. Try again.");
                                System.out.println("Give us the x-coordinate: ");
                                choice = myScanner.nextInt();
                            }
                        }
                    }
                }
           }
        }
        if (choice == x)
        {
            System.out.println("Nice job, now try and get the y coordinate."); 
        }
        System.out.println("Now give us the y-coordinate: ");
        choice = myScanner.nextInt();
        if (choice < y)
        {
            System.out.println("I'm sorry, but that is not correct. Try again.");
            System.out.println("Give us the y-coordinate: ");
            choice = myScanner.nextInt();
            if (choice < y)
            {
                System.out.println("I'm sorry, but that is not correct. Try again.");
                System.out.println("Give us the y-coordinate: ");
                choice = myScanner.nextInt();
                if (choice < y)
                {
                    System.out.println("I'm sorry, but that is not correct. Try again.");
                    System.out.println("Give us the y-coordinate: ");
                    choice = myScanner.nextInt();
                    if (choice < y)
                    {
                        System.out.println("I'm sorry, but that is not correct. Try again.");
                        System.out.println("Give us the y-coordinate: ");
                        choice = myScanner.nextInt();
                        if (choice < y)
                        {
                            System.out.println("I'm sorry, but that is not correct. Try again.");
                            System.out.println("Give us the y-coordinate: ");
                            choice = myScanner.nextInt();
                            if (choice < y)
                            {
                                System.out.println("I'm sorry, but that is not correct. Try again.");
                                System.out.println("Give us the y-coordinate: ");
                                choice = myScanner.nextInt();
                            }
                        }
                    }
                }
            }
        }
        if (choice > y)
        {
            System.out.println("I'm sorry, but that is not correct. Try again.");
            System.out.println("Give us the x-coordinate: ");
            choice = myScanner.nextInt();
            if (choice > y)
            {
                System.out.println("I'm sorry, but that is not correct. Try again.");
                System.out.println("Give us the x-coordinate: ");
                choice = myScanner.nextInt();
                if (choice > y)
                {
                    System.out.println("I'm sorry, but that is not correct. Try again.");
                    System.out.println("Give us the x-coordinate: ");
                    choice = myScanner.nextInt();
                    if (choice > y)
                    {
                        System.out.println("I'm sorry, but that is not correct. Try again.");
                        System.out.println("Give us the x-coordinate: ");
                        choice = myScanner.nextInt();
                        if (choice > y)
                        {
                            System.out.println("I'm sorry, but that is not correct. Try again.");
                            System.out.println("Give us the x-coordinate: ");
                            choice = myScanner.nextInt();
                            if (choice > y)
                            {
                                System.out.println("I'm sorry, but that is not correct. Try again.");
                                System.out.println("Give us the x-coordinate: ");
                                choice = myScanner.nextInt();
                            }
                        }
                    }
                }
            }
        }
        if (choice == y)
        {
            System.out.println("Nice job!  "); 
        }
        Scanner key = new Scanner(System.in);
        
        System.out.println("Take the correct locations and put them into this scanner to  change the element to match.");
        System.out.println("Give the value for the string in position " + x + ", " + y + ": ");
        board[x][y] = key.next();
        
        System.out.println("You now need to choose what card to pick. Give us the x-coordinate: ");
        choice = myScanner.nextInt();
        if (choice < x)
        {
            System.out.println("I'm sorry, but that is not correct. Try again.");
            System.out.println("Give us the x-coordinate: ");
            choice = myScanner.nextInt();
            if (choice < x)
           {
                System.out.println("I'm sorry, but that is not correct. Try again.");
                System.out.println("Give us the x-coordinate: ");
                choice = myScanner.nextInt();
                if (choice < x)
                {
                    System.out.println("I'm sorry, but that is not correct. Try again.");
                    System.out.println("Give us the x-coordinate: ");
                    choice = myScanner.nextInt();
                    if (choice < x)
                    {
                        System.out.println("I'm sorry, but that is not correct. Try again.");
                        System.out.println("Give us the x-coordinate: ");
                        choice = myScanner.nextInt();
                        if (choice < x)
                        {
                            System.out.println("I'm sorry, but that is not correct. Try again.");
                            System.out.println("Give us the x-coordinate: ");
                            choice = myScanner.nextInt();
                            if (choice < x)
                            {
                                System.out.println("I'm sorry, but that is not correct. Try again.");
                                System.out.println("Give us the x-coordinate: ");
                                choice = myScanner.nextInt();
                            }
                       }
                    }
                }
           }
        }
        if (choice > x)
        {
            System.out.println("I'm sorry, but that is not correct. Try again.");
            System.out.println("Give us the x-coordinate: ");
            choice = myScanner.nextInt();
            if (choice > x)
           {
                System.out.println("I'm sorry, but that is not correct. Try again.");
                System.out.println("Give us the x-coordinate: ");
                choice = myScanner.nextInt();
                if (choice > x)
                {
                    System.out.println("I'm sorry, but that is not correct. Try again.");
                    System.out.println("Give us the x-coordinate: ");
                    choice = myScanner.nextInt();
                    if (choice > x)
                    {
                        System.out.println("I'm sorry, but that is not correct. Try again.");
                        System.out.println("Give us the x-coordinate: ");
                        choice = myScanner.nextInt();
                        if (choice > x)
                        {
                            System.out.println("I'm sorry, but that is not correct. Try again.");
                            System.out.println("Give us the x-coordinate: ");
                            choice = myScanner.nextInt();
                            if (choice > x)
                            {
                                System.out.println("I'm sorry, but that is not correct. Try again.");
                                System.out.println("Give us the x-coordinate: ");
                                choice = myScanner.nextInt();
                            }
                       }
                    }
                }
           }
        }
        if (choice == x)
        {
            System.out.println("Nice job! Now give us the y coordinate."); 
        }
        System.out.println("Now give us the y-coordinate: ");
        choice = myScanner.nextInt();
        if (choice < y)
        {
            System.out.println("I'm sorry, but that is not correct. Try again.");
            System.out.println("Give us the y-coordinate: ");
            choice = myScanner.nextInt();
            if (choice < y)
            {
                System.out.println("I'm sorry, but that is not correct. Try again.");
                System.out.println("Give us the y-coordinate: ");
                choice = myScanner.nextInt();
                if (choice < y)
                {
                    System.out.println("I'm sorry, but that is not correct. Try again.");
                    System.out.println("Give us the y-coordinate: ");
                    choice = myScanner.nextInt();
                    if (choice < y)
                    {
                        System.out.println("I'm sorry, but that is not correct. Try again.");
                        System.out.println("Give us the y-coordinate: ");
                        choice = myScanner.nextInt();
                        if (choice < y)
                        {
                            System.out.println("I'm sorry, but that is not correct. Try again.");
                            System.out.println("Give us the y-coordinate: ");
                            choice = myScanner.nextInt();
                            if (choice < y)
                            {
                                System.out.println("I'm sorry, but that is not correct. Try again.");
                                System.out.println("Give us the y-coordinate: ");
                                choice = myScanner.nextInt();
                            }
                        }
                    }
                }
            }
        }
        if (choice > y)
        {
            System.out.println("I'm sorry, but that is not correct. Try again.");
            System.out.println("Give us the x-coordinate: ");
            choice = myScanner.nextInt();
            if (choice > y)
            {
                System.out.println("I'm sorry, but that is not correct. Try again.");
                System.out.println("Give us the x-coordinate: ");
                choice = myScanner.nextInt();
                if (choice > y)
                {
                    System.out.println("I'm sorry, but that is not correct. Try again.");
                    System.out.println("Give us the x-coordinate: ");
                    choice = myScanner.nextInt();
                    if (choice > y)
                    {
                        System.out.println("I'm sorry, but that is not correct. Try again.");
                        System.out.println("Give us the x-coordinate: ");
                        choice = myScanner.nextInt();
                        if (choice > y)
                        {
                            System.out.println("I'm sorry, but that is not correct. Try again.");
                            System.out.println("Give us the x-coordinate: ");
                            choice = myScanner.nextInt();
                            if (choice > y)
                            {
                                System.out.println("I'm sorry, but that is not correct. Try again.");
                                System.out.println("Give us the x-coordinate: ");
                                choice = myScanner.nextInt();
                            }
                        }
                    }
                }
            }
        }
        if (choice == y)
        {
            System.out.println("Nice job!"); 
        }
        
        System.out.println("Take the correct locations and put them into this scanner to  change the element to match.");
        System.out.println("Give the value for the string in position " + x + ", " + y + ": ");
        board[x][y] = key.next();
        
        return board;
    }
    
    public static void main(String[] args) {
        boolean playAgain = true;
        boolean fillAnElement = true;
        
        int choice;
        
        int number = 5;
        String[][] myBoard = {{"0","0","0","0","0"},{"0","0","0","0","0"},{"0","0","0","0","0"},{"0","0","0","0","0"},{"0","0","0","0","0"}};
        
        int elementNumber;
        
        Scanner myScanner = new Scanner(System.in);
        
        do {
            clearScreen();
            
            System.out.println("There is a board to create.");
            
            myBoard = buildBoard();
            
            printBoard(myBoard);
            
            int x = (int)(Math.random() * 5);
            int y = (int)(Math.random() * 5);
    
            int xLetter = (int)(Math.random() * 5);
            int yLetter = (int)(Math.random() * 5);
            
            takeAGuess(myBoard); 
            
            printBoard(myBoard);
            
            System.out.println("Do you want to play again?");
            playAgain = myScanner.nextBoolean();
            System.out.println("Type True to continue: ");
        } while(playAgain);
    }
}    
