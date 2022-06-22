import java.util.ArrayList;
import java.util.Random;

public class Lab3Q2 {

	public static void main(String[] args) {
		ArrayList<Integer> num = new ArrayList<Integer>();
        Random r = new Random();
        for (int i = 0; i < 10; i++){
            num.add((r.nextInt(50-1)-1));
            }
            ArrayList<Integer> copyArray = new ArrayList<>(num);

            num.set(9,-5);

            System.out.println(num);
            System.out.println(copyArray);

        }

}






/*
Create an ArrayList of Integers
Fill the ArrayList with ten random numbers (1-50)
Copy each value from the ArrayList into another ArrayList of the same capacity
Change the last value in the first (original) ArrayList to a -5
Display the contents of both ArrayLists

 */