import java.util.Scanner;

public class IT24610818Lab5Q1 {
public static void main(String[] args) {

Scanner input = new Scanner(System.in);
System.out.println("Enter the first integer: ");
int number1 =input.nextInt();
System.out.println("Enter the second integer: ");
int number2 =input.nextInt();
System.out.println("Enter the third integer: ");
int number3 =input.nextInt();

System.out.println("User entered numbers are: "+number1 +" "+number2+" "+number3);

int smallest = Math.min(number1, Math.min(number2, number3));
int largest = Math.max(number1, Math.max(number2, number3));

System.out.println("The Smallest number is: " + smallest); 
System.out.println("The Largest number is: " + largest);

}
}