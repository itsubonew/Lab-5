import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import javax.lang.model.util.ElementScanner14;
import javax.swing.event.SwingPropertyChangeSupport;

public class Lab3Q3{
    public static void main(String[] args) {
        ArrayList<Car> c = new ArrayList<>();
        c.add(new Car("Toyota","Prius",2020));
        c.add(new Car("Mazda","Outback",2018));
        c.add(new Car("Audi","Peace",2016));
        
        Collections.sort(c);
        for(Car v :c){
            System.out.println(v.getMadeBy());  
            System.out.println(v.getModel());
            System.out.println(v.getWhatYear());
            System.out.println();
        }
    }
}

class Car implements Comparable<Car>{

    private String madeBy;
    private String model;
    private int whatYear;

    public Car(String madeBy, String model, int whatYear){
        this.madeBy = madeBy;
        this.model = model;
        this.whatYear= whatYear;
    }

    public String getMadeBy() {
        return madeBy;
    }



    public void setMadeBy(String madeBy) {
        this.madeBy = madeBy;
    }



    public String getModel() {
        return model;
    }



    public void setModel(String model) {
        this.model = model;
    }



    public int getWhatYear() {
        return whatYear;
    }

    public void setWhatYear(int whatYear) {
        this.whatYear = whatYear;
    }

    @Override 
    public int compareTo(Car x){
        if(this.whatYear == x.whatYear){
            return 0;
         }else if (this.whatYear < x.whatYear){
            return -1;
         }else{
            return 1;
         }
        
    }

}

/*
Make a record to store information about a car. It should contain fields for: - make (String) - model (String) - year (int)
Create an ArrayList of Car objects.
Sort the ArrayList of cars by year (Ascending) and print them out.
*/
