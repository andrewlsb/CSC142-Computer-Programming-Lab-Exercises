import java.util.Scanner;

public class CaseStudy1 {
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter your annual salary: ");
        double salary = input.nextDouble();

        System.out.print("Enter your credit rating (1-10): ");
        int rating = input.nextInt();

        if (salary >= 20000 && rating >= 7) {
            qualify();
        } else {
            noQualify();
        }
    }

    public static void qualify() {
        System.out.println("You qualify for the credit card.");
    }

    public static void noQualify() {
        System.out.println("You do not qualify.");
    }
}

