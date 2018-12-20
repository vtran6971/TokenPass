package com.company;

public class TokenPass {
    private int playerCount;
    private int[] board;
    private int random;
    private int currentPlayer;
    private int tokens;

    public TokenPass(int playerCount)
    {
     this.playerCount = playerCount;
     currentPlayer = (int)(Math.random()*playerCount);
    }

    public int[] getBoard() {
        int[] board = new int[playerCount];
        for (int i = 0; i < playerCount; i++)
        {
            random = (int) (Math.random()*10)+1;
            board[i] = random;
            System.out.println(board[i]);
        }
        return board;
    }

public void distributeCurrentPlayerTokens()
    {
        int[] board = getBoard();
     tokens = board[currentPlayer];
     currentPlayer += 1;
     if(tokens > 0) {
         for (int j = currentPlayer; j < playerCount; j++)
         {
             board[j] = board[j]+1;
             tokens--;
             if (tokens == 0)
             {
                 j = playerCount;
             }
         }
     }
    }

    public int getCurrentPlayer() {
        return currentPlayer;
    }
}



