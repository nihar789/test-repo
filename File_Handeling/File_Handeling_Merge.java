import java.io.*;
import java.util.Scanner;

public class File_Handeling_Merge {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the content for the first file: ");
        String file1Content = scanner.nextLine();

        System.out.print("Enter the name for the first file: ");
        String file1Name = scanner.nextLine();

        try (FileOutputStream file1 = new FileOutputStream(file1Name)) {
            file1.write(file1Content.getBytes());
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }

        System.out.print("Enter the content for the second file: ");
        String file2Content = scanner.nextLine();

        System.out.print("Enter the name for the second file: ");
        String file2Name = scanner.nextLine();

        try (FileOutputStream file2 = new FileOutputStream(file2Name)) {
            file2.write(file2Content.getBytes());
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }

        System.out.print("Enter the name for the merged file: ");
        String mergedFileName = scanner.nextLine();

        try (FileInputStream file1 = new FileInputStream(file1Name);
             FileInputStream file2 = new FileInputStream(file2Name);
             FileOutputStream mergedFile = new FileOutputStream(mergedFileName)) {

            byte[] buffer = new byte[1024];
            int bytesRead;

            // Read from file1 and write to mergedFile
            while ((bytesRead = file1.read(buffer)) != -1) {
                mergedFile.write(buffer, 0, bytesRead);
            }

            // Read from file2 and write to mergedFile
            while ((bytesRead = file2.read(buffer)) != -1) {
                mergedFile.write(buffer, 0, bytesRead);
            }

            System.out.println("Files merged successfully!");

        } catch (FileNotFoundException e) {
            System.out.println("Sorry..!! File Not Found...!!!");
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }

        scanner.close();
    }
}
