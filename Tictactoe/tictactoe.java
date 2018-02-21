enum State
{
    X, O, E;
}

/**
 * Creates a tictactoe board, each square having 1 of three states.
 * @author Sean Stock
 * @version 2.20.18
 */
public class Tictactoe
{
    State state;
    private State empty;
    private State x;
    private State o;
    boolean playerWon;
    private State[][] square;
    /**
     * Constructor. Creates a new array which represents the board and sets all squares to empty.
     */
    public Tictactoe()
    {
        empty = State.E;
        x = State.X;
        o = State.O;
        playerWon = false;
        state = empty;
        square = new State[3][3];
        for (int i = 0; i < square.length; i++)
        {
            for (int j = 0; j < square.length; j++)
            {
                square[i][j] = state;
            }
        }
        printSquares();
    }

    /**
     * Adds an X to a specified square.
     */
    public void addX(int row, int column)
    {
        if (square[row][column] == empty)
        { 
            state = State.X;
            square[row][column] = state;
        }
        else
        {
           System.out.println("That square has already been used.");
           
        }
        printSquares();
        checkWin();
    }
    
    /**
     * Adds an O to a specified square.
     */
    public void addO(int row, int column)
    {
        if (square[row][column] == empty)
        {
            state = State.O;
            square[row][column] = state; 
        }
        else
        {
            System.out.println("That square has already been used.");
        }
        printSquares();
        checkWin();
    }
    
    /**
     * Checks too see if a player has one the game, and prints a message accordingly.
     */
    public void checkWin()
    {
        //Prints win for a horizontal line.
        for (int i = 0; i < square.length; i++)
        {
            if (square[i][0] == square[i][1] && square[i][0] == square[i][2] && square[i][0] != empty && playerWon == false)
            {
                if (square[i][0] == x)
                {
                    System.out.println("X Wins!");
                }
                if (square[i][0] == o)
                {
                    System.out.println("O Wins!");
                }
                playerWon = true;
            }
        }
        //Prints win for a verticle line.
        for (int i = 0; i < square.length; i++)
        {
            if (square[0][i] == square[1][i] && square[0][i] == square[2][i] && square[0][i] != empty && playerWon == false)
            {
                if (square[0][i] == x)
                {
                    System.out.println("X Wins!");
                }
                if (square[0][i] == o)
                {
                    System.out.println("O Wins!");
                }
                playerWon = true;
            }
        }
        //Prints win for diagonal from top right to bottom left.
        if (square [0][0] == square[1][1] && square [0][0] == square [2][2] && square [0][0] != empty && playerWon == false)
        {
            if (square[0][0] == x)
            {
                System.out.println("X Wins!");
            }
            if (square[0][0] == o)
            {
                System.out.println("O Wins!");
            }
            playerWon = true;
        }
        //Prints win for diagonal from top left to bottom right.
        if (square [0][2] == square[1][1] && square [0][2] == square [2][0] && square [0][2] != empty && playerWon == false)
        {
            if (square[0][2] == x)
            {
                System.out.println("X Wins!");
            }
            if (square[0][2] == o)
            {
                System.out.println("O Wins!");
            }
            playerWon = true;
        }
        //Runs checkDraw if someone didn't win.
        if (playerWon = false)
        {
            checkDraw();
        }
    }
    
    /**
     * If all squares are filled and there is no winner, a draw message is printed.
     */
    public void checkDraw()
    {
        int emptySquares = 0;
        for (int i = 0; i < square.length; i++)
        {
            for (int j = 0; j < square.length; j++)
            {
                if (square[i][j] == empty)
                {
                    emptySquares++;
                }
            }
        }
        if (emptySquares == 0)
        {            
            System.out.println("Game is a draw");
        }      
    }
    
    /**
     * Prints a visual representation of the board.
     */
    public void printSquares()
    {
        System.out.println(" " +square[0][0] + " | " + square[0][1] + " | " + square[0][2]);
        System.out.println("---+---+---");
        System.out.println(" " +square[1][0] + " | " + square[1][1] + " | " + square[1][2]);
        System.out.println("---+---+---");
        System.out.println(" " +square[2][0] + " | " + square[2][1] + " | " + square[2][2]);
    }
}
