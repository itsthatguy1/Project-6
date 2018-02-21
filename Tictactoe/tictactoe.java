enum State
{
    X, O, EMPTY;
}

/**
 *
 * @author Sean Stock
 * @version 2.20.18
 */
public class tictactoe
{
    State state;
    private State empty;
    private State[][] square;
    /**
     * Constructor for objects of class tictactoe
     */
    public tictactoe()
    {
        state = State.EMPTY;
        empty = State.EMPTY;
        square = new State[3][3];
        for (int i = 0; i < square.length; i++)
        {
            for (int j = 0; j < square.length; j++)
            {
                square[i][j] = state;
            }
        }
    }

    /**
     * 
     */
    public void addX(int column, int row)
    {
        if (square[column][row] == State.EMPTY)
        { 
            state = State.X;
            square[column][row] = state;
        }
        else
        {
           System.out.println("You can't put an X over an O!");
           
        }
        checkWin();
    }
    
    /**
     * 
     */
    public void addO(int column, int row)
    {
        if (square[column][row] == State.EMPTY)
        {
            state = State.O;
            square[column][row] = state; 
        }
        else
        {
            System.out.println("You can't put an X over an O!");
        }
        checkWin();
    }
    
    /**
     * 
     */
    public void checkWin()
    {
        for (int i = 0; i < square.length; i++)
        {
            if (square[i][0] == square[i][1] && square[i][0] == square[i][2] && square[i][0] != empty)
            {
                System.out.println("WOW YOU WON VERY GOOD");
            }
        }
        for (int i = 0; i < square.length; i++)
        {
            if (square[0][i] == square[1][i] && square[0][i] == square[2][i] && square[0][i] != empty)
            {
                System.out.println("WOW YOU WON VERY GOOD");
            }
        }
    }
}
