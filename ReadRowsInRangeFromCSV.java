import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class ReadRowsInRangeFromCSV {

    public static void main(String[] args) {
        String csvFile = "yap_bulk_email_name.csv"; // Path to your CSV file
        int startRow = 5000; // Starting row to read
        int endRow = 5500; // Ending row to read

        try {
            // Read data from CSV file within the specified range
            List<String> data = readRowsInRangeFromCSV(csvFile, startRow, endRow);

            // Print the data
            System.out.println("Data read from CSV:");
            for (String row : data) {
                System.out.println(row);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static List<String> readRowsInRangeFromCSV(String csvFile, int startRow, int endRow) throws IOException {
        List<String> rows = new ArrayList<>();
        try (BufferedReader br = new BufferedReader(new FileReader(csvFile))) {
            String line;
            int currentRow = 0; // Counter for the current row number
            while ((line = br.readLine()) != null) {
                currentRow++;
                if (currentRow >= startRow && currentRow <= endRow) {
                    rows.add(line);
                } else if (currentRow > endRow) {
                    break; // Stop reading after the ending row is reached
                }
            }
        }
        return rows;
    }
}
