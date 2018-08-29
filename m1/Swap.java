import java.util.Scanner;
class Swap {
	public static void main(String[] args) {
		System.out.println("Enter two Integer numbers:");
		int a, b;
        Scanner input = new Scanner(System.in);
        a = input.nextInt();
        b = input.nextInt();
        a = a+b;
        b = a-b;
        a = a-b;
        System.out.println("After swaping")
        System.out.println(a);
        System.out.println(b);
	}
}
