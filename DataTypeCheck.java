import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class DataTypeCheck {

    // Method to check data type
    public static String getDataType(String data) {
        // Check if integer
        try {
            Integer.parseInt(data);
            return "Integer";
        } catch (NumberFormatException e) {
            // Not an integer
        }

        // Check if contact number (basic check: only digits and length 10)
        if (data.matches("\\d{10}")) {
            return "Contact Number";
        }

        // Otherwise it's a string
        return "String";
    }

    public static void main(String[] args) {
        String filePath = "C:\\Users\\shela\\OneDrive\\Desktop\\JAVA\\Sanika.txt";

        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
            String line;
            while ((line = br.readLine()) != null) {
                String type = getDataType(line.trim());
                System.out.println("Data: " + line + " → Type: " + type);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}