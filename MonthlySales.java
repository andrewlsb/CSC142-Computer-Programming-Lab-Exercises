import javax.swing.JOptionPane;
import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class MonthlySales {

    public static void main(String[] args) throws IOException {
        // Get file name
        String fileName = getFileName();

        //Get total sales
        double total = getTotalSales(fileName);

        // Calculate average
        double average = total / 30;

        // Display results
        displayResults(total, average);
    }

    // Prompts the user for file name
    public static String getFileName() {
        return JOptionPane.showInputDialog("Enter the name of the file\ncontaining 30 days of sales amounts.");
    }

    // Reads sales from the file and returns total
    public static double getTotalSales(String filename) throws IOException {
        File file = new File(filename);
        Scanner inputFile = new Scanner(file);

        double total = 0.0;

        // Read 30 values
        for (int i = 0; i < 30; i++) {
            if (inputFile.hasNextDouble()) {
                total += inputFile.nextDouble();
            } else {
                JOptionPane.showMessageDialog(null, "File does not contain enough sales values.");
                System.exit(0);
            }
        }

        inputFile.close();
        return total;
    }

    // Displays total and average
    public static void displayResults(double total, double average) {
        String message = String.format("The total sales for the period is $%,.2f\n" +"The average daily sales were $%,.2f", total, average);
        JOptionPane.showMessageDialog(null, message);
    }
}
