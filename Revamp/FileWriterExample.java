package Revamp;
public class FileWriterExample {
    public static void main(String[] args) {
        String fileName = "example_output.txt";
        try (java.io.FileWriter fw = new java.io.FileWriter(fileName);
             java.io.BufferedWriter bw = new java.io.BufferedWriter(fw)) {

            bw.write("Hello from FileWriterExample!");
            bw.newLine();
            bw.write("This shows simple file writing in Java.");

            System.out.println("Wrote to " + fileName);
        } catch (java.io.IOException e) {
            System.err.println("Error writing file: " + e.getMessage());
        }
    }
}
