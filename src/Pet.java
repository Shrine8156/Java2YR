public class Pet {

    // Fields (must match schema)
    private int age;
    private String name;
    private String type;

    // Default constructor
    public Pet() {
        setType("Animal");
        setName("Pet Name");
        setAge(1);
    }

    // Custom constructor (newName, newType, newAge)
    public Pet(String newName, String newType, int newAge) {
        setName(newName);
        setType(newType);
        setAge(newAge);
    }

    // Getters
    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    public String getType() {
        return type;
    }

    // Setters
    public void setAge(int newAge) {
        age = newAge;
    }

    public void setName(String newName) {
        name = newName;
    }

    public void setType(String newType) {
        type = newType;
    }

    // speak method
    public String speak() {
        if (type.equalsIgnoreCase("dog")) {
            return "Woof";
        } else if (type.equalsIgnoreCase("cat")) {
            return "Meow";
        } else {
            return "Yowl";
        }
    }

    // toString method (calls speak inside)
    public String toString() {
        String info = "Pet information:\n";
        info += "Type: " + type + "\n";
        info += "Name: " + name + "\n";
        info += "Sound: " + speak() + "\n";
        info += "Age:  " + age;
        return info;
    }
}
