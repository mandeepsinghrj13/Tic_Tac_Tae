package com.bredgelabz;
import java.util.Iterator;
public class TicTacToe 
{
	public static void main(String[] args) 
	{
		System.out.println("Tic Tac Toe");
		board();
	}
	public static void board() //creating a method
	{	
		int i;
		char[] element;
		element = new char[10];
		for(i=1; i<10; i++) 
		{
			element[i]='-';
		}
	}
}