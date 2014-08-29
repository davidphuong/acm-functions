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
                    double k = Double.parseDouble(splitStr[i]);
                    long l = Long.parseLong(splitStr[i]);
                    System.out.println(n + " + 2 = " + (n + 2));
                    System.out.println(k + " + 2 = " + (k + 2));
                    System.out.println(l + " + 2 = " + (l + 2));
                    System.out.println("");
                }
            }

        } catch (IOException io) {
            io.printStackTrace();
        }
    }
}
