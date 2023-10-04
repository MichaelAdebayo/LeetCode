public class Solution17Recursive {
    /**
     * Calculates the number of matches in a tournament based on the number of teams.
     *
     * @param n the number of teams in the tournament
     * @return the total number of matches in the tournament
     */
    public int numberOfMatches(int n) {
        // Base case: If there's only one team or no teams, no matches are played.
        if (n <= 1) {
            return 0;
        }

        // Recursive case:
        // If the number of teams is even, half of them will be eliminated in the current round.
        // So, we add n / 2 matches to the total and proceed with the remaining teams.
        if (n % 2 == 0) {
            return (n / 2) + numberOfMatches(n / 2);
        } else {
            // If the number of teams is odd, one team gets a bye, and the rest proceed.
            // So, we add (n - 1) / 2 + 1 matches to the total and proceed with (n - 1) / 2 teams.
            return ((n - 1) / 2 + 1) + numberOfMatches((n - 1) / 2);
        }
    }
}
