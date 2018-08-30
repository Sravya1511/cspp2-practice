import java.util.Scanner;
public class Concatinate {
	public static void main(String[] arg) {
		Scanner input = new Scanner(System.in);
		String name = input.next();
		String hello = "Hello ";
		String s = hello.concat(name).concat("!");
		System.out.println(s);

	}
}