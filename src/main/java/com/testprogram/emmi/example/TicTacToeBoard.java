package com.testprogram.emmi.example;

public class TicTacToeBoard {
	
		private char[][] ttBoard;//initializes the type of array for the board
		private boolean gameActive = true;
	
	
	public TicTacToeBoard(){ //Constructs our board as an object

		ttBoard = new char[3][3]; //initialize the 2D array

		for(int i = 0; i < ttBoard.length ; i++){
		  Arrays.fill(ttBoard[i], ' '); 
		}
		}


		public void printBoard(){ //we print our board object using this method
		for(int i = 0; i<ttBoard.length; i++){
		  for(int j = 0; j<ttBoard[i].length; j++){
		    System.out.print(ttBoard[i][j]);
		    if(j==0 || j==1)   //this loop helps separate indices, makes it look like a real board.
		      System.out.print("|"); 
		  }
		  if(i==0||i==1)
		  System.out.print("\n-----\n");
		}
		System.out.println();
		}


		  public boolean makeMove(char player , int i, int j)//here it prompts the player for a move 
		//and also uses boolean to make the move
		  {
		   if(i >= 0 && i<= 2 && j >= 0 && j<= 2)
		   {
		      if(ttBoard[i][j] != ' ')
		    return false;
		   else
		   {
		    ttBoard[i][j] = player;
		    return true;
		   }
		  } 
		else
		  return false;
		}


		public boolean gameOn()//this method will determine whether the game continues
		{
		 return gameActive
		}

		public void askPlayer(char player) //prompts users turn
		{

		}

		public void askComp(char c)  //prompts computers turn
		{
		}



}
