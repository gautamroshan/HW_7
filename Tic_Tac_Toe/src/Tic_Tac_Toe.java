/*
 * ***8.9 (Game: play a tic-tac-toe game) In a game of tic-tac-toe, two players take turns
marking an available cell in a 3 * 3 grid with their respective tokens (either
X or O). When one player has placed three tokens in a horizontal, vertical, or
diagonal row on the grid, the game is over and that player has won. A draw (no
winner) occurs when all the cells on the grid have been filled with tokens and
neither player has achieved a win. Create a program for playing tic-tac-toe.
The program prompts two players to enter an X token and O token alternately.
Whenever a token is entered, the program redisplays the board on the
console and determines the status of the game (win, draw, or continue).
 */
import java.util.Scanner;
public class Tic_Tac_Toe {
	public static void main(String[]args){
		String [][] matrix = new String [3][3];
		Scanner input = new Scanner(System.in);
		boolean continued = true;
		String player ="X";
		String matcher[]=new String[3];
		int Status=1;
		int counter =1;
		while (continued){
			if (counter%2==0){
				player="O";
			}
			else {
				player="X";
			}
			for (int i=0; i<=2; i++){
				matcher[2]+=matrix[i][i];
				if (matcher[2].equals("XXX")||matcher[2].equals("OOO")){
					continued=false;
					 Status=0;
					break ;
					}
				//This checking process should be made a separate method
				matcher[2]="";
				for (int j=0; j<=2; j++){
					
					System.out.print(matrix[i][j]+" ");
					matcher[1]+=matrix[i][j];
					matcher[0]+=matrix[j][i];
					
					if (matcher[1].equals("XXX")||matcher[1].equals("OOO")){
						continued=false;
						 Status=0;
						break ;
						}
					if (matcher[0].equals("XXX")||matcher[0].equals("OOO")){
						continued=false;
						 Status=0;
						break ;
						}
				}
				System.out.println();
				matcher[1]="";
				matcher[0]="";
			
			}
			if (Status==1){
			System.out.println("Enter the row for Player " +player );
			int row = input.nextInt();
			System.out.println("Enter the column for Player "+player);
			int column = input.nextInt();
			matrix[row][column]=player;
			counter++;
			}
		}
		System.out.println("The winner is Player "+player+"! Thank you for Playing");
		//This part needs to be worked on!
	
	}
	
		
			
}
			