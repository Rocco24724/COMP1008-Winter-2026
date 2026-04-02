import java.io.*;
import java.util.Scanner;

public class FileMerger {

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {

        System.out.println("=== File Merger Utility ===\n");

        // Get file names from user
        System.out.print("Enter the name of the first input file: ");
        String file1Name = scanner.nextLine().trim();

        System.out.print("Enter the name of the second input file: ");
        String file2Name = scanner.nextLine().trim();

        System.out.print("Enter the name of the output file: ");
        String outputName = scanner.nextLine().trim();

        System.out.println();

        // Check if files exist
        File file1 = new File(file1Name);
        File file2 = new File(file2Name);

        if (!file1.exists() || !file1.isFile()) {
            System.err.println("Please check the file name and try again.");
            return;
        }

        if (!file2.exists() || !file2.isFile()) {
            System.err.println("Please check the file name and try again.");
            return;
        }

        // Merge files
        int totalLines = mergeFiles(file1, file2, outputName);

        if (totalLines >= 0) {
            System.out.println("Merge successful!");
            System.out.println("Total lines written : " + totalLines);
            System.out.println("Output file : " + outputName);
        }
        }
    }

    // Merge two files into one output file
    private static int mergeFiles(File file1, File file2, String outputName) {
        int totalLines = 0;

        // Create output file
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(outputName, false))) {

            totalLines += copyLines(file1, writer, true);
            totalLines += copyLines(file2, writer, false);

        } catch (IOException e) {
            System.err.println("Error writing to output file");
            return -1;
        }

        return totalLines;
    }

    // Copy lines from source file to writer
    private static int copyLines(File source, BufferedWriter writer, boolean isFirst)
            throws IOException {

        int lineCount = 0;
        String label = isFirst ? "first" : "second";

        try (BufferedReader reader = new BufferedReader(new FileReader(source))) {
            String line;
            while ((line = reader.readLine()) != null) {
                writer.write(line);
                writer.newLine();
                lineCount++;
            }
        } catch (FileNotFoundException e) {
            throw new IOException("Could not open file");
        }

        System.out.println("Read" + lineCount + " lines from file");
        return lineCount;
    }
}
