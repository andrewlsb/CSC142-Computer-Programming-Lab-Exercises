import java.util.Scanner; 
public class Lab1part1{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Score 1: ");
        int score1=sc.nextInt();
        System.out.print("Enter Score 2: ");
        int score2= sc.nextInt();
        System.out.print("Enter Score 3: ");
        int score3=sc.nextInt();
        double average = (score1 + score2 + score3)/3.0;
        System.out.println("Average: "+ average);
        if (average>=0 && average<=100){
            if (average>=90){
                System.out.println("Grade: A");
                }
                else if(average>=80){
                    System.out.println("Grade: B");
                }
                else if (average>=70){
                    System.out.println("Grade: C");
                }
                else if (average>=60){
                    System.out.println("Grade: D");
                }
                else{
                    System.out.println("Grade: F");
                }
            }
            else{
                System.out.println("Enter a vaild score");
            }
        }
        
    }
