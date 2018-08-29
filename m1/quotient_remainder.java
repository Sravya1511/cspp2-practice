import java.util.Scanner;
class quotient_remainder {
	public static void main(String[] args) {
		System.out.println("Enter two Integer numbers:");
		int a, b;
        Scanner input = new Scanner(System.in);
        a = input.nextInt();
        b = input.nextInt();
        System.out.println("quotient is "+a/b);
        System.out.println("remainder is "+a%b);
    }
}


