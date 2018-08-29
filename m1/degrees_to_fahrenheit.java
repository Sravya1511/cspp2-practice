import java.util.Scanner;
class degrees_to_fahrenheit {
	public static void main(String[] arg) {
    float fahren;
    float cel;
	System.out.println("enter celcius temperature");
	Scanner temp = new Scanner(System.in);
	cel = temp.nextFloat();
	fahren = (cel * 9/5) + 32;
	System.out.println("Fahrenheit : ");
	System.out.println(fahren);
	}
}