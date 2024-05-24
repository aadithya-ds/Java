import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class update {

    public static void main(String[] args) {
        // Path to your input CSV file
        String csvFile = "input.csv";
        // Path to your output CSV file
        String outputCsvFile = "update_query.csv";

        try (BufferedReader br = new BufferedReader(new FileReader(csvFile));
                BufferedWriter bw = new BufferedWriter(new FileWriter(outputCsvFile))) {
            String line;
            // Read the CSV file line by line
            while ((line = br.readLine()) != null) {
                // Assuming each line contains a mobile number
                String mobileNum = line.trim();

                // Construct the SQL update query
                String sqlQuery = "UPDATE customers_prod.allowed_waiting_mobile_numbers SET is_waiting = 0 WHERE id="
                        + mobileNum
                        + ";";

                // Write the SQL query to the output CSV file
                bw.write(sqlQuery);
                bw.newLine();

                // Print or execute the SQL query
                System.out.println("SQL Query: " + sqlQuery);
                // Execute the query against your database using JDBC, if required
                // executeSQLQuery(sqlQuery);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
