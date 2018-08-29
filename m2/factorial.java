import java.util.Scanner;
class Factorial {
	public static void main(String[] arg) {
		Scanner input = new Scanner(System.in);
		int x = input.nextInt();
		System.out.println(factorial(x));
	}
    static int factorial(int x) {
    	int fact;
    	if (x == 0) return 1;
    	if (x == 1) {return 1;} else {fact = x * factorial(x-1);}
    	return fact;
    }
}