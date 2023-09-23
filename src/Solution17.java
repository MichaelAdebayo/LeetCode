public class Solution17 {
/**
 * Calculates the number of matches in a tournament based on the number of teams.
 *
 * @param  n  the number of teams in the tournament
 * @return    the total number of matches in the tournament
 */
public int numberOfMatches(int n) {
   // Initialize the variable to keep track of the number of matches
   int matches = 0;
   
   // While there are more than 1 teams
   while(n > 1){
       // If the number of teams is even
       if(n % 2 == 0){
           // Calculate the number of matches and add it to the total
           matches = (n/2) + matches;
           // Update the number of teams for the next round
           n = n/2;
       }
       // If the number of teams is odd
       else if(n % 2 == 1){
           // Calculate the number of matches and add it to the total
           matches = ((n-1)/2+1) + matches;
           // Update the number of teams for the next round
           n = (n-1)/2;
       }
    }
    
   // Return the total number of matches
   return matches;
}
    
}
