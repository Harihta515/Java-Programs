package com.testprogram.emmi.example;



public class TicTacToe{

    private static final String PLAY_OR_NOT = "X";
    private static final String INST = "(Y / N Quit)\n";

    private static boolean quit = false;


public static void main(String[] args){
  TicTacToeBoard game = new TicTacToeBoard();
  game.printBoard();
  int count = 1;

while(game.gameOn())
{
  if (count%2 == 0)
    game.askPlayer('X');
  else
    game.askComp('O');
  count++;
}
game.printBoard();
}
}