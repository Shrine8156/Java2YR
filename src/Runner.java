import java.util.Scanner;

public class Runner {

    public static void main(String[] args) {
        // Create a scanner for user input
        Scanner scnr = new Scanner(System.in);

        // First Pet: Using default constructor
        Pet pet1 = new Pet();
        System.out.println(pet1.toString());

        System.out.println(); // For spacing

        // Second Pet: Using custom constructor
        Pet pet2 = new Pet("Buster", "Dog", 11);
        System.out.println(pet2.toString());

        System.out.println(); // For spacing

        // Third Pet: Taking user input for type, name, and age
        System.out.print("Enter animal type: ");
        String type = scnr.nextLine();

        System.out.print("Enter animal name: ");
        String name = scnr.nextLine();

        System.out.print("Enter animal age: ");
        int age = scnr.nextInt();

        // Create third pet using the custom constructor
        Pet pet3 = new Pet(name, type, age);
        System.out.println(pet3.toString());
    }
}
