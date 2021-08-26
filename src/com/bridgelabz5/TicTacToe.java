package com.bridgelabz5;
import java.util.Scanner;

public class TicTacToe {
	public static char[] board = new char[10];//array of size 10
	char CompChoice,PlayerChoice;
	public void createBoard() //Initializing the board
	{
		for(int i=1;i<board.length;i++)
		{
			board[i]=' ';
		}
	}
	public void chooseLetter()
	{
		System.out.println("Choose letter x or o");
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Player choice of letter:");
		PlayerChoice=sc.next().charAt(0);
		if(PlayerChoice=='x')
		{
			CompChoice='o';
			System.out.println("Player Letter:"+PlayerChoice+" and Computer Letter:"+CompChoice);
		}
		else if(PlayerChoice=='o')
		{
			CompChoice='x';
			System.out.println("Player Letter:"+PlayerChoice+" and Computer Letter:"+CompChoice);
		}
		sc.close();
		
	}
	
	public static void main(String[] args) {
		System.out.println("Welcome to Tic Tac Toe");//Welcome message
		TicTacToe game=new TicTacToe();
		game.createBoard();
		game.chooseLetter();
	
		}
		
		
	}


