import java.util.Scanner;
public class SumOfNNumbers {
	public static void main(String[] args) {
		System.out.println("Enter a number");
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		int sum = 0;
        for (int i=1; i<=n; i++) {
        	sum = sum+i;
        }
        System.out.println("sum of natural numbers " + sum);
	}
}