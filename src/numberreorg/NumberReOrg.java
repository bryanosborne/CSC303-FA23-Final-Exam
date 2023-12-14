package numberreorg;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class NumberReOrg {

    /**
     * @param args the command line arguments
     * @throws java.io.FileNotFoundException
     */
    public static void main(String[] args) throws FileNotFoundException, IOException {
        BufferedReader buffReader;
        String testItem;

        // Initialize BufferedReader, opening file for reading
        buffReader = new BufferedReader(new FileReader("testdata.txt"));

        // Read and process each line from file
        while ((testItem = buffReader.readLine()) != null) {
            System.out.println("ORIGINAL SEQUENCE: " + testItem);
        }
    }
}
