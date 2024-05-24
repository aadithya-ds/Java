import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class SplitCSVIntoChunks {

    public static void main(String[] args) {
        String csvFile = "yap_bulk_email_name.csv"; // Path to your input CSV file
        int chunkSize = 1000; // Number of rows per output CSV file

        try {
            // Read data from CSV file and write to output files in chunks
            splitCSVIntoChunks(csvFile, chunkSize);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void splitCSVIntoChunks(String csvFile, int chunkSize) throws IOException {
        try (BufferedReader br = new BufferedReader(new FileReader(csvFile))) {
            String line;
            int currentRow = 0;
            int fileIndex = 1;
            List<String> rows = new ArrayList<>();

            while ((line = br.readLine()) != null) {
                currentRow++;
                rows.add(line);

                if (currentRow % chunkSize == 0) {
                    writeRowsToCSV(rows, "bulk_" + fileIndex + ".csv");
                    rows.clear();
                    fileIndex++;
                }
            }

            // Write remaining rows to the last file
            if (!rows.isEmpty()) {
                writeRowsToCSV(rows, "bulk_" + fileIndex + ".csv");
            }
        }
    }

    private static void writeRowsToCSV(List<String> rows, String outputCsvFile) throws IOException {
        try (FileWriter writer = new FileWriter(outputCsvFile)) {
            for (String row : rows) {
                writer.write(row);
                writer.write(System.lineSeparator());
            }
        }
    }
}
