/**
 *@PROBLEM_STATEMENT UC1
 *Setup the initial game with deck of cards and make sure we have unique cards, 
 *The number of cards are 52. Should be able to make unique deck. Maintain the ranks to further compare.
 *@author Suraj Chaudhary
 *@Date 07-Mar-2022
 */
package com.bridgelabz.workshop;

import java.util.ArrayList;

public class DeckOfCards {
	public static ArrayList<String> deckCards = new ArrayList<>();

//Welcome message 
	public void welcome() {
		System.out.println("Welcome to the Deck of Card DashBoard");
	}

	/**
	 * @Purpose :To shuffle Cards and display accordingly in consecutive sequence
	 * @Param :suits , ranks, no of cards
	 * @Function :For loop to get cards
	 * @Return :Int string
	 */
	public void deckOfCard() {
		String[] suits = { "Clubs", "Diamonds", "Hearts", "Spades" };
		String[] ranks = { "2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "King", "Queen", "Ace" };
		int numOfCards = suits.length * ranks.length;
		System.out.println("\nNumber of cards in the deck:" + numOfCards);
		for (int i = 0; i < ranks.length; i++) {
			for (int j = 0; j < suits.length; j++) {
				deckCards.add(ranks[i] + "->" + suits[j]);
			}
		}
		toDisplay(deckCards);
	}

	/**
	 * @Purpose :To dispaly arraylist created
	 * @Param :Cards in Deck
	 * @Function :For loop ,SOP
	 * @Return :Card Sequence
	 */
	public static void toDisplay(ArrayList<String> cardsDeck) {
		System.out.println("\nCards in Deck:");
		for (String element : cardsDeck) {
			System.out.println(element);
		}
		System.out.println();
	}

//Main class
	public static void main(String[] args) {
		DeckOfCards deckOfCardsGame = new DeckOfCards();
		deckOfCardsGame.welcome();
		deckOfCardsGame.deckOfCard();
	}
}
