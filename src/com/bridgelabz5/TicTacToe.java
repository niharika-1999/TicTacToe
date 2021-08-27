package com.bridgelabz5;
import java.util.Scanner;

public class TicTacToe {
	public static char[] board = new char[10];//array of size 10
	private char[][] showboard = new char[3][3];
	Scanner sc=new Scanner(System.in);
	char CompChoice,PlayerChoice;
	int i,j,move=0;
	public void createBoard() //Initializing the board
	{
		for(int i=1;i<board.length;i++)
		{
			board[i]=' ';
		}
	}
	public void chooseLetter()//Choosing letter x or o by player
	{
		System.out.println("Choose letter x or o");
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
		
		
	}
	
	
	public void showBoard()//showBoard to display current board
	{
		for(int i =0;i<3;i++) {
			for(int j=0;j<3;j++) {
				showboard[i][j]=' ';
				
			}
		}
		System.out.println(showboard[0][0]+"|"+showboard[0][1]+"|"+showboard[0][2]);
		System.out.println("-----");
		System.out.println(showboard[1][0]+"|"+showboard[1][1]+"|"+showboard[1][2]);
		System.out.println("-----");
		System.out.println(showboard[2][0]+"|"+showboard[2][1]+"|"+showboard[2][2]);
		
	}
	
	public void DesiredLocation()//User to make a move to Desired Location
	{
		System.out.println("Select the location to move:");
		move=sc.nextInt();
		if(move>0 && move<(board.length))
		{
			System.out.println("Desired Location is present:"+move);
			requiredLocation(move);
		}
		else
		{
			System.out.println("Range to make a move from 1 to"+(board.length-1));
		}
	}
	
	public void requiredLocation(int location)//Checking free Space to make desired move
	{
		if(board[location]!='x')
		{
			System.out.println("Free Space available to make a move");
			board[move]=PlayerChoice;
		}
		else if(board[location]!='o')
		{
			System.out.println("Free Space available to make a move");
			board[move]=PlayerChoice;
		}
			
		else
			System.out.println("Free Space not available to make a move");
			
			
		
	}
	
		
	
	public static void main(String[] args) {
		System.out.println("Welcome to Tic Tac Toe");//Welcome message
		TicTacToe game=new TicTacToe();
		game.createBoard();
		game.chooseLetter();
		game.showBoard();
		game.DesiredLocation();
	
		}
		
		
	}


