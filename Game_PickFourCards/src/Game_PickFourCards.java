//Program that picks four cards from a deck of 52 cards and computes their sum.
// An Ace, King, Queen, and Jack represent 1,13,12, and 11 respectively.
//Program should display the number of picks that yields the sum of 24.

public class Game_PickFourCards {
	public static void main(String[]args){
		final int deck = 52;
		// int constant deck
		int Sum=0;
		String [] named = {"Ace","2","3","4","5","6","7","8","9","10","Jack","Queen","King"};
		// array for storing cards
		System.out.println("The random cards are:");
		for (int i=0; i<4; i++){
			int RandomCard = (int)(Math.random()*13);
			//getting a random card
			System.out.println(named[RandomCard]);
			if (RandomCard==0){
				Sum++;
			}
			else if (RandomCard==10){
				Sum+=11;
			}
			else if (RandomCard==11){
				Sum+=12;
			}
			else if (RandomCard==12){
				Sum+=13;
			}
			else{
			Sum+=Integer.parseInt(named[RandomCard]);
			// summing the picked cards by converting the string to int type
			}
			
		}
		System.out.println("The sum is "+ Sum);
		int num = 0, picks = 0;
		  while (num != 24) {
		   num = Card() + Card() + Card() +Card();
		   //calling the method for picking the card
		   picks++;
		 
		  }
		 
		  System.out.println("Number of picks:" + picks*4);
		 }
	public static int Card() {
		  int card = (int) (Math.random() * 52.0); 
		  return card;
		 }
						
		
	}
