import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class FindRepeatedValuesInCSV {

    public static void main(String[] args) {
        String csvFile = "yap_bulk_email_name.csv"; // Path to your CSV file

        try {
            // Read data from CSV file
            Map<String, Integer> counts = getCountsFromCSV(csvFile);

            // Find repeated values
            Set<String> repeatedValues = findRepeatedValues(counts);

            // Print repeated values
            System.out.println("Repeated values in CSV:");
            for (String value : repeatedValues) {
                System.out.println(value);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static Map<String, Integer> getCountsFromCSV(String csvFile) throws IOException {
        Map<String, Integer> counts = new HashMap<>();
        try (BufferedReader br = new BufferedReader(new FileReader(csvFile))) {
            String line;
            while ((line = br.readLine()) != null) {
                // Assuming the first column in CSV contains values
                String[] data = line.split(",");
                String value = data[0].trim(); // Trim any leading/trailing spaces
                counts.put(value, counts.getOrDefault(value, 0) + 1);
            }
        }
        return counts;
    }

    private static Set<String> findRepeatedValues(Map<String, Integer> counts) {
        Set<String> repeatedValues = new HashSet<>();
        for (Map.Entry<String, Integer> entry : counts.entrySet()) {
            if (entry.getValue() > 1) {
                repeatedValues.add(entry.getKey());
            }
        }
        return repeatedValues;
    }
}
