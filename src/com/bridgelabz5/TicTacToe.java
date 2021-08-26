package com.bridgelabz5;

public class TicTacToe {
	public static char[] board = new char[10];//array of size 10
	public void createBoard() //Initializing the board
	{
		for(int i=1;i<board.length;i++)
		{
			board[i]=' ';
		}
	}
	
	public static void main(String[] args) {
		System.out.println("Welcome to Tic Tac Toe");//Welcome message
		TicTacToe game=new TicTacToe();
		game.createBoard();
	
		}
		
		
	}


