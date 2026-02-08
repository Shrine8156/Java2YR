public class Pet {

    // Private data field
    private String name;

    // Default constructor
    public Pet() {
        setName("Pet Name"); // using set method as instructed
    }

    // Getter method
    public String getName() {
        return name;
    }

    // Setter method
    public void setName(String newName) {
        name = newName;
    }

    // toString method
    public String toString() {
        String info = "Pet information:\n";
        info += "Name: " + name;
        return info;
    }

    // main method
    public static void main(String[] args) {

        // First Pet using default constructor
        Pet p1 = new Pet();
        System.out.println(p1.toString());


        // Second Pet using set method
        Pet p2 = new Pet();
        p2.setName("Buster");
        System.out.println(p2.toString());
    }
}
