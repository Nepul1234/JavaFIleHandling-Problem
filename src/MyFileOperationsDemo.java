import java.util.Scanner;

public class MyFileOperationsDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter string to write to file:");
        String userInput = scanner.nextLine();

        System.out.println("Enter file name to write to:");
        String fileName = scanner.nextLine();

        MyFileWriter writer = new MyFileWriter();
        MyFileReader reader = new MyFileReader();

        writer.writeToFile(userInput, fileName);
        reader.readFromFile(fileName);


    }
}
