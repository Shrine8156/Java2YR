public class Towers {

    private int numDiscs; // number of discs

    // Constructor
    public Towers(int n) {
        this.numDiscs = n;

        // Start moving discs
        moveDiscs(this.numDiscs, 1, 3, 2);
    }

    // Recursive method
    private void moveDiscs(int num, int fromPeg, int toPeg, int tempPeg) {

        // Base case
        if (num > 0) {

            // Move n-1 discs to temp peg
            moveDiscs(num - 1, fromPeg, tempPeg, toPeg);

            // Move current disc
            System.out.println("Move a disc from peg " + fromPeg + " to peg " + toPeg);

            // Move n-1 discs from temp to target
            moveDiscs(num - 1, tempPeg, toPeg, fromPeg);
        }
    }
}