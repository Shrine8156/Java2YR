import java.util.Scanner;

public class Tests {

    // Private data fields
    private double ave;
    private int count;
    private int score;

    // Default constructor
    public Tests() {
        ave = 0.0;
        count = 0;
        score = 0;
    }

    // Get methods (some fields are read-only)
    public double getAve() {
        return ave;
    }

    public int getCount() {
        return count;
    }

    public int getScore() {
        return score;
    }

    // Only score has a setter
    public void setScore(int newScore) {
        score = newScore;
    }

    // Custom method to compute average (void return type)
    public void getAverage() {

        Scanner scnr = new Scanner(System.in);

        double sum = 0.0;
        count = 0;

        System.out.println("Enter test scores (press -1 to quit):");
        setScore(scnr.nextInt());   // prime the loop

        while (getScore() != -1) {
            sum += getScore();
            count++;

            System.out.println("Enter test scores (press -1 to quit):");
            setScore(scnr.nextInt());
        }

        // This will produce NaN if count == 0 (as assignment expects)
        ave = sum / count;
    }

    // toString method
    public String toString() {
        return "The average of the " + count +
                " scores entered is " +
                String.format("%.2f", ave) + ".";
    }
}