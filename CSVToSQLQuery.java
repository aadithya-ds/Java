import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class CSVToSQLQuery {

    public static void main(String[] args) {
        String csvFile = "accountNo_1.csv"; // Path to your input CSV file
        String tableName = "customers.customers"; // Table name in your database

        // Read data from CSV file
        List<String> ids = readDataFromCSV(csvFile);

        // Construct SQL query
        String sqlQuery = constructSQLQuery(tableName, ids);

        // Print or execute the SQL query
        System.out.println("Generated SQL query:");
        System.out.println(sqlQuery);
    }

    private static List<String> readDataFromCSV(String csvFile) {
        List<String> ids = new ArrayList<>();
        try (BufferedReader br = new BufferedReader(new FileReader(csvFile))) {
            String line;
            int count = 0;
            // Read each line from CSV and extract the ID
            while ((line = br.readLine()) != null) {
                count++;
                // Assuming the first column in CSV contains IDs
                String[] data = line.split(",");
                String id = data[0].trim(); // Trim any leading/trailing spaces
                ids.add(id);
            }
            System.out.println(count);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return ids;
    }

    private static String constructSQLQuery(String tableName, List<String> ids) {
        StringBuilder sqlQuery = new StringBuilder();
        sqlQuery.append("SELECT * FROM ").append(tableName);
        sqlQuery.append(" WHERE id IN (");
        // Append each ID from the list to the SQL query
        for (String id : ids) {
            sqlQuery.append("'").append(id).append("',");
        }
        // Remove the trailing comma and close the parenthesis
        if (!ids.isEmpty()) {
            sqlQuery.deleteCharAt(sqlQuery.length() - 1); // Remove the last comma
        }
        sqlQuery.append(");");
        return sqlQuery.toString();
    }
}
