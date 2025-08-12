import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class CaseStudy2 {
    
    public static void main(String[] args) throws FileNotFoundException {
        String filename = getFileName();
        double total = getTotalSales(filename);
        double average = total / 30; // assuming 30 values
        displayResults(total, average);
    }

    public static String getFileName() {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the filename: ");
        return input.nextLine();
    }

    public static double getTotalSales(String filename) throws FileNotFoundException {
        File file = new File(filename);
        Scanner fileScanner = new Scanner(file);
        double total = 0;
        int count = 0;
        
        while (fileScanner.hasNextDouble() && count < 30) {
            total += fileScanner.nextDouble();
            count++;
        }
        
        fileScanner.close();
        return total;
    }

    public static void displayResults(double total, double average) {
        System.out.printf("Total sales: %.2f%n", total);
        System.out.printf("Average sales: %.2f%n", average);
    }
}
