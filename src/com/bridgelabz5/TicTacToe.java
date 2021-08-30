package com.bridgelabz5;
import java.util.Scanner;
import java.util.Random;

public class TicTacToe {
	
	public static char[] board = new char[10];//array of size 10
	public static char[][] showboard = new char[3][3];
	public static Scanner sc=new Scanner(System.in);
	public static Random rand=new Random();
	char CompChoice,PlayerChoice;
	int i,j;
	int location;
	String turn;
	
	
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
		System.out.println(""+board[1]+"|"+board[2]+"|"+board[3]);
		System.out.println("-+-+-");
		System.out.println(""+board[4]+"|"+board[5]+"|"+board[6]);
		System.out.println("-+-+-");
		System.out.println(""+board[7]+"|"+board[8]+"|"+board[9]);
		
	}
	
	
    public void DesiredLocation()//User to make a move to Desired Location
	{
    	turn="player";
    	System.out.println("Player chance to move:\nEnter index to move");
		location=sc.nextInt();
		if(location<1||location>9) {
			System.out.println("Enter location between 1 to 9");
			DesiredLocation();
		}
		requiredMove();
	}

	
	
	public void requiredMove()//check for free space before making required move
	{
		if(board[location]==' ')
		{
			board[location]=PlayerChoice;
		}
		else
		{
			System.out.println("Enter different index current one is filled");
			DesiredLocation();
			requiredMove();
			 
		}
		showBoard();
		checkingWinner();
		
	}
	
	public void toss()//Toss to check who plays first
	{
		System.out.println("Enter choice \n0.Head\n1.Tail");
		int choice=sc.nextInt();
		int toss_choice=rand.nextInt(2);
		if(choice==toss_choice)
		{
			DesiredLocation();
		
		}
		else
		{
			computerGame();
		}
	}
	
	public void checkingWinner()
	{
		if(board[1]==board[2] && board[2]==board[3] &&(board[1]==PlayerChoice||board[1]==CompChoice))
		{
			if(board[1]==PlayerChoice)
				System.out.println("Player Won!!");
			else
				System.out.println("Computer Won!!");
			System.exit(0);
				
		}
		if(board[1]==board[4] && board[4]==board[7] &&(board[1]==PlayerChoice||board[1]==CompChoice))
		{
			if(board[1]==PlayerChoice)
				System.out.println("Player Won!!");
			else
				System.out.println("Computer Won!!");
			System.exit(0);
				
		}
		if(board[1]==board[5] && board[5]==board[9] &&(board[1]==PlayerChoice||board[1]==CompChoice))
		{
			if(board[1]==PlayerChoice)
				System.out.println("Player Won!!");
			else
				System.out.println("Computer Won!!");
			System.exit(0);
				
		}
		if(board[2]==board[5] && board[5]==board[8] &&(board[2]==PlayerChoice||board[2]==CompChoice))
		{
			if(board[2]==PlayerChoice)
				System.out.println("Player Won!!");
			else
				System.out.println("Computer Won!!");
			System.exit(0);
				
		}
		if(board[3]==board[6] && board[6]==board[9] &&(board[3]==PlayerChoice||board[3]==CompChoice))
		{
			if(board[3]==PlayerChoice)
				System.out.println("Player Won!!");
			else
				System.out.println("Computer Won!!");
			System.exit(0);
				
		}
		if(board[3]==board[5] && board[5]==board[7] &&(board[3]==PlayerChoice||board[3]==CompChoice))
		{
			if(board[3]==PlayerChoice)
				System.out.println("Player Won!!");
			else
				System.out.println("Computer Won!!");
			System.exit(0);
				
		}
		if(board[4]==board[5] && board[5]==board[6] &&(board[4]==PlayerChoice||board[4]==CompChoice))
		{
			if(board[4]==PlayerChoice)
				System.out.println("Player Won!!");
			else
				System.out.println("Computer Won!!");
			System.exit(0);
				
		}
		if(board[7]==board[8] && board[8]==board[9] &&(board[7]==PlayerChoice||board[7]==CompChoice))
		{
			if(board[7]==PlayerChoice)
				System.out.println("Player Won!!");
			else
				System.out.println("Computer Won!!");
			System.exit(0);
				
		}
		
	}
	
	public void computerGame()
	{
		turn="computer";
		System.out.println("It is Computer chance to play");
		if((board[1]==' ')&&(board[2]==board[3]&&board[2]==CompChoice)||(board[4]==board[7]&&board[4]==CompChoice)||(board[5]==board[9]&&board[5]==CompChoice))
		{
			board[1]=CompChoice;
		}
		else if((board[2]==' ')&&(board[1]==board[3]&&board[3]==CompChoice)||(board[5]==board[8]&&board[8]==CompChoice))
		{
			board[2]=CompChoice;
		}
		else if((board[3]==' ')&&(board[1]==board[2]&&board[2]==CompChoice)||(board[6]==board[9]&&board[9]==CompChoice)||(board[5]==board[7]&&board[7]==CompChoice))
		{
			board[3]=CompChoice;
		}
		else if((board[4]==' ')&&(board[1]==board[7]&&board[1]==CompChoice)||(board[5]==board[6]&&board[6]==CompChoice))
		{
			board[4]=CompChoice;
		}
		else if((board[5]==' ')&&(board[1]==board[9]&&board[1]==CompChoice)||(board[7]==board[3]&&board[7]==CompChoice)||(board[2]==board[8]&&board[2]==CompChoice))
		{
			board[5]=CompChoice;
		}
		else if((board[6]==' ')&&(board[9]==board[3]&&board[3]==CompChoice)||(board[5]==board[4]&&board[4]==CompChoice))
		{
			board[6]=CompChoice;
		}
		else if((board[7]==' ')&&(board[1]==board[4]&&board[4]==CompChoice)||(board[3]==board[5]&&board[3]==CompChoice)||(board[8]==board[9]&&board[8]==CompChoice))
		{
			board[7]=CompChoice;
		}
		else if((board[8]==' ')&&(board[9]==board[7]&&board[7]==CompChoice)||(board[2]==board[5]&&board[2]==CompChoice))
		{
			board[8]=CompChoice;
		}
		else if((board[9]==' ')&&(board[1]==board[5]&&board[5]==CompChoice)||(board[6]==board[3]&&board[3]==CompChoice)||(board[8]==board[7]&&board[7]==CompChoice))
		{
			board[9]=CompChoice;
		}
		//Blocking Condition
		
		else if((board[1]==' ')&&(board[2]==board[3]&&board[2]==PlayerChoice)||(board[4]==board[7]&&board[4]==PlayerChoice)||(board[5]==board[9]&&board[5]==PlayerChoice))
		{
			board[1]=CompChoice;
		}
		else if((board[2]==' ')&&(board[1]==board[3]&&board[3]==PlayerChoice)||(board[5]==board[8]&&board[8]==PlayerChoice))
		{
			board[2]=CompChoice;
		}
		else if((board[3]==' ')&&(board[1]==board[2]&&board[2]==PlayerChoice)||(board[6]==board[9]&&board[9]==PlayerChoice)||(board[5]==board[7]&&board[7]==PlayerChoice))
		{
			board[3]=CompChoice;
		}
		else if((board[4]==' ')&&(board[1]==board[7]&&board[1]==PlayerChoice)||(board[5]==board[6]&&board[6]==PlayerChoice))
		{
			board[4]=CompChoice;
		}
		else if((board[5]==' ')&&(board[1]==board[9]&&board[1]==PlayerChoice)||(board[7]==board[3]&&board[7]==PlayerChoice)||(board[2]==board[8]&&board[2]==PlayerChoice))
		{
			board[5]=CompChoice;
		}
		else if((board[6]==' ')&&(board[9]==board[3]&&board[3]==PlayerChoice)||(board[5]==board[4]&&board[4]==PlayerChoice))
		{
			board[6]=CompChoice;
		}
		else if((board[7]==' ')&&(board[1]==board[4]&&board[4]==PlayerChoice)||(board[3]==board[5]&&board[3]==PlayerChoice)||(board[8]==board[9]&&board[8]==PlayerChoice))
		{
			board[7]=CompChoice;
		}
		else if((board[8]==' ')&&(board[9]==board[7]&&board[7]==PlayerChoice)||(board[2]==board[5]&&board[2]==PlayerChoice))
		{
			board[8]=CompChoice;
		}
		else if((board[9]==' ')&&(board[1]==board[5]&&board[5]==PlayerChoice)||(board[6]==board[3]&&board[3]==PlayerChoice)||(board[8]==board[7]&&board[7]==PlayerChoice))
		{
			board[9]=CompChoice;
		}
		showBoard();
		checkingWinner();
		DesiredLocation();
		
		
	}
	
	 
	
		
	
	public static void main(String[] args) {
		System.out.println("Welcome to Tic Tac Toe");//Welcome message
		TicTacToe game=new TicTacToe();
		game.createBoard();
		game.chooseLetter();
		game.showBoard();
		game.DesiredLocation();
		game.toss();
		game.checkingWinner();
		game.computerGame();
		}
		
		
	}


