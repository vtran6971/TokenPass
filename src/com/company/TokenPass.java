package com.company;

public class TokenPass {
    private int playerCount;
    public int[] board;
    private int random;
    private int currentPlayer;
    private int tokens;

    //Constructor of tokenpass passing in the playercount desired
    public TokenPass(int playerCount)
    {
     this.playerCount = playerCount;
     currentPlayer = (int)(Math.random()*playerCount);
    }

    //getBoard method that runs through the entire board and fills it with a random number of tokens up to 10
    public int[] getBoard() {
        this.board = new int[playerCount];
        for (int i = 0; i < playerCount; i++)
        {
            random = (int) (Math.random()*10);
            board[i] = random;
        }
        return board;
    }

    public int getCurrentPlayer() {
        return currentPlayer;
    }

    //Distributes tokens one by one taking the tokens away from the currentPlayer
    //Starting distribution with the next player
public void distributeCurrentPlayerTokens()
{
    //Defines the person you're taking and distributing tokens from
    currentPlayer -= 1;
     tokens = board[currentPlayer];
     board[currentPlayer] = 0;

     //Checks end boundary condition and if there send the index back to the start
    //otherwise increments currentPlayer
    if(currentPlayer == 9)
    {
        currentPlayer = 0;
    }
    else {
        currentPlayer += 1;
    }

    //While we have tokens, distribute tokens one by one
    //Chceks end boundary condition
    //Method ends when number of tokens hits zero
if(tokens > 0) {
    for (int j = currentPlayer; j < playerCount; j++) {
        board[j] = board[j] + 1;
        tokens--;
        if (j == 9) {
            j = 0;
            board[j] = board[j] + 1;
            tokens--;
        }
        if (tokens == 0) {
            j = playerCount;
        }
    }
}

}
}



