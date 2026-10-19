import java.util.Scanner;

public class Ass01_RockPaperScissors {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        String playAgain = "Y";

        while (playAgain.equalsIgnoreCase("Y")) {

            // --- Player A Input ---
            String playerA = "";
            while (true) {
                System.out.print("Player A, enter your move (R, P, S): ");
                playerA = in.nextLine().trim();

                if (playerA.equalsIgnoreCase("R") ||
                        playerA.equalsIgnoreCase("P") ||
                        playerA.equalsIgnoreCase("S")) {
                    break;
                } else {
                    System.out.println("Invalid move. Please enter R, P, or S.");
                }
            }

            // --- Player B Input ---
            String playerB = "";
            while (true) {
                System.out.print("Player B, enter your move (R, P, S): ");
                playerB = in.nextLine().trim();

                if (playerB.equalsIgnoreCase("R") ||
                        playerB.equalsIgnoreCase("P") ||
                        playerB.equalsIgnoreCase("S")) {
                    break;
                } else {
                    System.out.println("Invalid move! Please enter R, P, or S.");
                }
            }

            // --- Determine Winner ---
            System.out.println();
            System.out.println("Player A chose: " + moveName(playerA));
            System.out.println("Player B chose: " + moveName(playerB));
            System.out.println();

            if (playerA.equalsIgnoreCase(playerB)) {
                System.out.println(moveName(playerA) + " vs " + moveName(playerB) + " — It's a Tie!");
            } else if (playerA.equalsIgnoreCase("R") && playerB.equalsIgnoreCase("S")) {
                System.out.println("Rock breaks Scissors, Player A wins");
            } else if (playerA.equalsIgnoreCase("P") && playerB.equalsIgnoreCase("R")) {
                System.out.println("Paper covers Rock, Player A wins");
            } else if (playerA.equalsIgnoreCase("S") && playerB.equalsIgnoreCase("P")) {
                System.out.println("Scissors cuts Paper, Player A wins");
            } else {
                // Player B wins
                if (playerB.equalsIgnoreCase("R") && playerA.equalsIgnoreCase("S")) {
                    System.out.println("Rock breaks Scissors, Player B wins");
                } else if (playerB.equalsIgnoreCase("P") && playerA.equalsIgnoreCase("R")) {
                    System.out.println("Paper covers Rock, Player B wins");
                } else if (playerB.equalsIgnoreCase("S") && playerA.equalsIgnoreCase("P")) {
                    System.out.println("Scissors cuts Paper, Player B wins");
                }
            }

            System.out.println();
            System.out.print("Play again? (Y/N): ");
            playAgain = in.nextLine().trim();
            System.out.println();
        }

        System.out.println("Thanks for playing");
    }

    // Helper method to print full move names
    public static String moveName(String move) {
        if (move.equalsIgnoreCase("R")) return "Rock";
        if (move.equalsIgnoreCase("P")) return "Paper";
        return "Scissors";
    }
}
