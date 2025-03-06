import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class MyFileWriter {
    public void writeToFile(String userInput, String fileName) {
        // Write the userInput to a file
        FileOutputStream fos = null;
        try {
            fos = new FileOutputStream(fileName);
        } catch (FileNotFoundException e) {
            System.out.println("File not found: " + e.getMessage());
        }
        try {
            fos.write(userInput.getBytes());
            System.out.println("Data written to file successfully.");
            System.out.println();
        } catch (IOException e) {
            System.out.println("Error writing to file: " + e.getMessage());
        }
    }
}
