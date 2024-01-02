import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {

        String [] stringArray2 = {"projtest1.txt", "projtest2.txt", "projtest3.txt", "projtest4.txt", "testEcoli2500.txt", "testEcoli3000.txt"};

        for(int each_file = 0; each_file < stringArray2.length; each_file++){
            try (BufferedReader reader = new BufferedReader(new FileReader(stringArray2[each_file]))) {
                String firstString = reader.readLine().trim();
                String secondString = reader.readLine().trim();

                int[][] dp = EditDistance.computeEditDistance(firstString, secondString);
                int editDistance = dp[firstString.length()][secondString.length()];

                System.out.println("Edit distance = " + editDistance);

                if(!stringArray2[each_file].equals("testEcoli2500.txt") && !stringArray2[each_file].equals("testEcoli3000.txt")) {
                    EditDistance.printOptimalAlignment(firstString, secondString, dp);
                }

            } catch (IOException e) {
                System.out.println("Error reading file: " + e.getMessage());
            }
        }
    }
}
