package com.company;

public class Main {

    public static void main(String[] args) {
	//Create a testGame using the contstructor
        TokenPass testGame = new TokenPass(10);
        int[] testBoard = testGame.getBoard();

        //Print the board to see what's in it.
        System.out.println("Constructed a testBoard:");
        for (int i = 0; i < testBoard.length; i++)
        {
            System.out.print(testBoard[i]+" ");
        }
        System.out.println();

        //Now test distributeCurrentPlayerTokens
        //and prints out board after token distribution
        testGame.distributeCurrentPlayerTokens();
        System.out.println("After distributing tokens from player " + testGame.getCurrentPlayer()+": ");
        for(int i = 0; i < testBoard.length; i++)
        {
            System.out.print(testBoard[i] + " ");
        }

    }
}
