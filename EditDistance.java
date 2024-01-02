public class EditDistance {
    //there should be a separate table construction section and separate traceback section. Both clearly commented.

    //reads two strings of characters from a text file
    public static int[][] computeEditDistance(String firstString, String secondString) {
        int str1 = firstString.length();
        int str2 = secondString.length();

        //initialize a dynamic programming table
        int[][] dp = new int[str1 + 1][str2 + 1]; //add 1 to both dimensions to account for the empty string case

        //i represents the row of dp
        //j represents the column of dp



        // [replace, insert]
        // [delete, current EditDistance]
        //this is for empty string case. Comparing firstString with a gap
        //Question is: How many deletions to transform firstString into a string of gap?
        for(int i = 0; i <= str1; i++){ //first row
            dp[i][0] = 2 * i;
        }

        //this is for empty string case. Comparing secondString with a gap
        //Questions is: How many insertions to transform a string of gap into secondString
        for(int j = 0; j <= str2; j++){ //first column
            dp[0][j] = 2 * j;
        }

        //Constructing the table (2D Array)
        for (int i = 1; i <= str1; i++) { // okay, so we are now going to iterate each cell (subproblem)
            for (int j = 1; j <= str2; j++) {
                // checks if the characters at the corresponding positions in the two strings are equal
                if (firstString.charAt(i - 1) == secondString.charAt(j - 1)) {
                    // if they are equal, it means no operation is needed to match the characters
                    dp[i][j] = dp[i - 1][j - 1]; // assign the same value as the previous diagonal cell to dp[i][j]
                }
                else {
                    // not equal, so perform an edit operation (substitution, insertion, or deletion) to match them
                    // this line of code considers these three operations and selects the one with the minimum cost.
                    // Cost of sub = 1, Cost of insert = 2, Cost of deletion = 2
                    dp[i][j] = Math.min(dp[i - 1][j - 1] + 1, Math.min(dp[i][j - 1] + 2, dp[i - 1][j] + 2));
                }
            }
        }

        return dp;
    }



    // Traceback section
    public static void printOptimalAlignment(String firstString, String secondString, int[][] dp) {
        int i = firstString.length();
        int j = secondString.length();
        StringBuilder alignmentBuilder = new StringBuilder();

        while (i > 0 || j > 0) {
            if (i > 0 && j > 0 && firstString.charAt(i - 1) == secondString.charAt(j - 1)) {
                alignmentBuilder.insert(0, firstString.charAt(i - 1) + " " + secondString.charAt(j - 1) + " 0\n");
                i--;
                j--;
            }
            else if (i > 0 && dp[i][j] == dp[i - 1][j] + 2) {
                alignmentBuilder.insert(0, firstString.charAt(i - 1) + " - 2\n");
                i--;
            }
            else if (j > 0 && dp[i][j] == dp[i][j - 1] + 2) {
                alignmentBuilder.insert(0, "- " + secondString.charAt(j - 1) + " 2\n");
                j--;
            }
            else if (i > 0 && j > 0 && dp[i][j] == dp[i - 1][j - 1] + 1) {
                alignmentBuilder.insert(0, firstString.charAt(i - 1) + " " + secondString.charAt(j - 1) + " 1\n");
                i--;
                j--;
            }
        }

        System.out.println(alignmentBuilder.toString());
    }



}