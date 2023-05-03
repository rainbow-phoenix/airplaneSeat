/** Class that assigns passenger seats in a small airplane.
 * @author ranis
 * @version Feb 20, 2021
 */
import java.util.Scanner;
public class airlineSeats {
	public static void main(String [] args) {
	Scanner keyboard = new Scanner(System.in);
	int x=0;
	
/** Amount of seats on the plane.  */
	String [][] seats = {{"A", "B", "C", "D"}, {"A", "B", "C", "D"}, {"A", "B", "C", "D"}, {"A", "B", "C", "D"},
	{"A", "B", "C", "D"}, {"A", "B", "C", "D"}, {"A", "B", "C", "D"}};
	
/** First showing of the seats to prompt the user. */
	seatSelection(seats);
	
/** For loop that goes until there are no more seats left. */
	for(int i=0; i<seats.length; i++) {
		for(int j=0; j<seats[0].length; j++) {
		System.out.println("Which row would you like?");
			int r = keyboard.nextInt();
			System.out.println("Which seat would you like that is available? Please enter an integer."
						+ "\n1:A | 2:B | 3:C | 4|D");
			int c = keyboard.nextInt();
			System.out.println();
			
/** While loop that makes sure the same seat is not picked twice.  */
			while(x==0) {
				System.out.println();
				if(seats[r-1][c-1]=="X") {
					System.out.println("Sorry this seat is already taken.\nPlease pick another.");
					seatSelection(seats);
					System.out.println("Which row would you like?");
						r = keyboard.nextInt();
					System.out.println("Which seat would you like? Please enter an integer."
							+ "\n1:A | 2:B | 3:C | 4|D");
						c = keyboard.nextInt();
					}
				if(seats[r-1][c-1]!="X") {
					takeSeat(seats,r-1,c-1);
					x=1;
					}
			}
			x=0;
			seatSelection(seats);
		}
	}
	System.out.println("All the seats have been taken.");
	seatSelection(seats);
	
}//end main
	
/** Method that takes a 2d String array parameter and prints out the contents of the 2d array.
 * @param a a 2d String array
 */
	public static void seatSelection(String [][]a) {
		System.out.println("Rows");
		for(int i=0; i<a.length; i++) {
				System.out.print((i+1) + "\t");
			for(int j=0; j<a[0].length; j++) {
				System.out.print(a[i][j] + "\t");
				}
			System.out.println();
		}
	}
	
/** Method that replaces any value of a 2d String array with the String X.
 * @param a a 2d string array
 * @param r an int of the row of the 2d array
 * @param c an int of the column of the 2d array
 */
	public static void takeSeat(String [][] a, int r, int c) {
		a[r][c] = "X";
		
	}
}