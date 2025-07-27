import java.util.Scanner;
public class Lab1part2 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of checks: ");
        int numcheck = sc.nextInt();
        System.out.println("Base fee: $10.00");
        double checkfee = 0.0;
        if (numcheck>60){
            System.out.println("Fee per check: $0.04");
            checkfee=0.04;
        }else if (numcheck>=40){
            System.out.println("Fee per check: $0.06");
            checkfee=0.06;
        }else if(numcheck>=20){
            System.out.println("Fee per check: $0.08");
            checkfee=0.08;
        }else{
            System.out.println("Fee per check: $0.10");
            checkfee=0.10;
        }
        double total = checkfee*numcheck + 10.0;
        System.out.println("Total service charge: $"+total);
}
}
