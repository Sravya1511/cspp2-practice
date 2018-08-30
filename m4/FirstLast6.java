import java.util.Scanner;
/**
 * Class for first last 6.
 */
final class FirstLast6 {
	/**
	 * { function_description }
	 *
	 * @param      arg   The argument
	 */
	public static void main(final String[] arg) {
		int arr[];
		System.out.println("Enter size of array");
		Scanner input = new Scanner(System.in);
		int size = input.nextInt();
		arr = new int[size];
		System.out.println("Enter array elements");
		for (int i = 0; i < arr.length; i++) {

			arr[i] = input.nextInt();
		}
		System.out.println(FirstLast(arr));
	}
	static boolean FirstLast(int arr[]) {
		if ((arr[0] == 6) || (arr[arr.length - 1] == 6)) {
			return true;
		} else {
			return false;

	    }
		
    }
	
}