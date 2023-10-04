public class Solution19 {
/**
 * Calculates the total amount of money accumulated over a given number of weeks.
 *
 * @param  n  the number of weeks
 * @return    the total amount of money accumulated
 */
public int totalMoney(int n) {
    int totalMoney = 0; // Variable to keep track of the total money accumulated
    int currentMoney = 1; // Starting amount on the first day
    int currentDay = 1; // Variable to keep track of the current day of the week

    for (int i = 1; i <= n; i++) {
        totalMoney += currentMoney; // Add the money for the current day to the total money

        currentDay++; // Increment the current day by 1
        currentMoney++; // Increment the current money by 1

        if (currentDay > 7) { // If the current day is greater than 7 (Sunday)
            currentDay = 1; // Reset the current day to Monday
            currentMoney = i / 7 + 1; // Increase the amount of money on Monday by dividing the current day index by 7 and adding 1
        }
    }

    return totalMoney; // Return the total money accumulated
}
    
}
