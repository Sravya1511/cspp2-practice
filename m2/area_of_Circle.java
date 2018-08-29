import java.util.Scanner;
class AreaOfCircle {
	public static void main(String[] arg) {
		System.out.println("Enter radius");
		Scanner input = new Scanner(System.in);
		float r = input.nextFloat();
	    area(r);
	}
	static void area(float r) {
		double area;
		// double pie;
		area = r*r*pie();
		System.out.println(area);
	}
	static double pie() {
	    double pie =  3.1415;
	    return pie;
	}


	}
