package com.brigdelabz;//created a package 
public class DackOfCard {//creating a class

	public static void main(String[] args) {//start main function
		System.out.println("Welcome to dack of card");//print the welcome message
		String[] suit = {"Clubs ", "Diamonds ", "Hearts ", "Spades "};//creating array of suit
		String[] rank = {"2 ", "3 ", "4 ", "5 ", "6 ", "7 ", "8 ", "9 ", "10 ", "Jack ", "Queen ", "King ", "Ace "};//creating array of rank
		String[] deck = new String[52];//total card in game
		
		for (int i =0; i < deck.length; i++) { //taking for loop (.length) taking total card of game
			deck[i] = rank[i%13] + suit[i/13]; 
			System.out.println(deck[i]); //print the all card 
		}//end for loop	
	}//ending of main
}//ending class of scope
