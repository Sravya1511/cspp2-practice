import java.util.Scanner;
public class Average {
	public static void main(String[] arg) {
		int arr[];
		Scanner input = new Scanner(System.in);
		System.out.println("Enter size of array");
		int size = input.nextInt();
		arr = new int[size];
		System.out.println("Enter array elements");
		int sum = 0;
		for (int i=0; i<arr.length; i++) {
			arr[i] = input.nextInt();
			sum = sum+arr[i];
		}
		float avg = sum/size;
		System.out.println(avg);
	}
}
