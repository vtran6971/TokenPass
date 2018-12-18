package com.company;

public class TokenPass {
    private int playerCount;
    private  int[] testGame;

    public TokenPass(int playerCount)
    {
     this.playerCount = playerCount;

    }

    public int[] getBoard()
    {
        for (int i = 0; i<playerCount; i++)
        {
            testGame[i] = (int) Math.random()*10+1;
         System.out.println(testGame[i]);
        }
return testGame;
    }
}
