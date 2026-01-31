// Name: Yeshas Reddi
// Course: Computer Science II
// Assignment: Module2 Assignment 1

import java.text.DecimalFormat; //import the decimal formating function

public class Tests {
    public static void main(String[] args) {
        //decalring the test variables below
        double test1 = 20.21;
        double test2 = 20.21;
        double test3 = 29.21;

        //stating how i want the decimals to be formated
        DecimalFormat df = new DecimalFormat("0.00");

        //printing out the test score statments
        System.out.println("Test score 1: " + test1);
        System.out.println("Test score 2: " + test2);
        System.out.println("Test score 3: " + test3);
        System.out.println("The average score is: " + df.format(((test1 + test2 + test3)/3))); //did the average of the test score, and formatted it properly
}
}
