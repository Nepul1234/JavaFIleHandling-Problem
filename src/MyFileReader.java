import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class MyFileReader {
    public void readFromFile(String fileName) {
        // Read the contents of the file
        FileInputStream fis = null;
        try {
            fis = new FileInputStream(fileName);
        } catch (FileNotFoundException e) {
            System.out.println("File not found: " + e.getMessage());
        }
        try {
            int data;
            while ((data = fis.read()) != -1) {
                System.out.print((char) data);
            }
        } catch (IOException e) {
            System.out.println("Error reading from file: " + e.getMessage());
        }
    }
}
