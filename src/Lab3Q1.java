
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Lab3Q1 {

	public static void main(String[] args) {
		ArrayList<Integer> arl = new ArrayList<Integer>(); 
		Random rnd = new Random();
		for(int i = 0; i < 10; i++){
			int y =  rnd.nextInt(50-1)-1;
			arl.add(y);

			System.out.println("[" + y + "]");
		}
	
		Scanner num1 = new Scanner(System.in);
		System.out.println("Enter the Number");
		int x = num1.nextInt();
		int j = arl.indexOf(x);
		if(j == -1){
		System.out.println("Your number is not in the list");
		}else{
		System.out.println("Your number is in the list");
		}
	}
}


	




/*
Create an ArrayList of Integers
Fill each of the 10 slots with a random value from 1-50.
Display those values on the screen, and then prompt the user for an integer.
Search through the ArrayList, and if the item is present, print a message that the number is in the list.
If the value is not in the ArrayList, print a message that the number is not in the list */
