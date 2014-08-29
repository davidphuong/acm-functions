import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ACMJava {
    public static void main(String[] args) {

        try {

            // Read from input stuff
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            String input;

            while ((input = br.readLine()) != null) {
                // Split string by spaces
                String[] splitStr = input.split(" ");

                for (int i = 0; i < splitStr.length; i++) {
                    // Convert a string into a integer
                    int n = Integer.parseInt(splitStr[i]);
                    System.out.println(n + " + 2 = " + (n + 2));
                }
            }

        } catch (IOException io) {
            io.printStackTrace();
        }
    }
}
