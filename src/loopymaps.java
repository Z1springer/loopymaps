import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.LinkedHashMap;

public static void main(String args[]) throws FileNotFoundException {
    // BufferedReader is designed to read a txt file with better efficiency
    BufferedReader reader = new BufferedReader(new FileReader("legions"));
    Map<String, String> traitorMap = new LinkedHashMap<>();
    Map<String, String> loyalMap = new LinkedHashMap<>();

    try (reader) {
        String line;
        while ((line = reader.readLine()) != null) {
            String[] parts = line.split(",");
        }
    } catch (IOException e) {
        e.printStackTrace();
    }
}