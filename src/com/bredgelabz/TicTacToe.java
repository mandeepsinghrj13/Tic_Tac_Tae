package com.bredgelabz; //creating package
import java.util.*;
public class TicTacToe 
{
	private static char[] Board() {
		char[] boardArray = new char[11];
		for(char c : boardArray) {
			c = ' ';
		}
		return boardArray;
	}
	
private static void ChooseLetter() {
	
	char firstCharacterInput = ' ';
	char computerCharacterInput = ' ';
	Scanner sc = new Scanner(System.in);
	
	System.out.println("Enter input Mr. player");
	System.out.println("Enter 'X' or 'O' : ");
	firstCharacterInput = sc.next().charAt(0);
	
	switch (firstCharacterInput) {
	case 'X': {
		firstCharacterInput = 'X';
		computerCharacterInput = 'O';
		break;
	}
	case 'O': {
		firstCharacterInput = 'O';
		computerCharacterInput = 'X';
		break;
	}
	default:
	}
	
	System.out.println("User input is : " + firstCharacterInput + " and computer input is : " + computerCharacterInput);
	sc.close();
}

public static void main(String[] args) {		
	char[] boardArray = Board();
	ChooseLetter();
}
}