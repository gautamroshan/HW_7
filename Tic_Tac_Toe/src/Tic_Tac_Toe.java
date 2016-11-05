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
		int counter =1;
		while (continued){
			if (counter%2==0){
				player="Y";
			}
			else {
				player="X";
			}
			for (int i=0; i<=2; i++){
				for (int j=0; j<=2; j++){
					System.out.print(matrix[i][j]+" ");
				}
				System.out.println();
			}
			System.out.println("Enter the row for Player " +player );
			int row = input.nextInt();
			System.out.println("Enter the column for Player "+player);
			int column = input.nextInt();
			matrix[row][column]=player;
			counter++;
			
		} 
	}

}
