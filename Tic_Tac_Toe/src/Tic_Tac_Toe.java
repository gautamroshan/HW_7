
import java.util.Scanner;
public class Tic_Tac_Toe {
	public static void main(String[]args){
		String [][] matrix = new String [3][3];
		// creating an array object;
		Scanner input = new Scanner(System.in);
		boolean continued = true;
		// for the loop
		String player ="X";
		String matcher[]=new String[3];
		// declaration of some string variables to check the game.
		int Status=1;
		int counter =1;
		for (int m=0; m<=2; m++){
			for(int n=0; n<=2; n++){
				matrix[m][n]=" ";
			}
		}
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
				matcher[2]="";
				for (int j=0; j<=2; j++){
					
					System.out.print("| "+ matrix[i][j]+" | ");
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
			System.out.println("Enter the row, (0,1,2) for Player " +player );
			int row = input.nextInt();
			System.out.println("Enter the column, (0,1,2) for Player "+player);
			int column = input.nextInt();
			matrix[row][column]=player;
			counter++;
			}
		}
		System.out.println("Game over! Thank you for Playing");
	
	}
}
			