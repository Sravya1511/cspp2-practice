import java.util.Scanner;
class Bigger_equal_smaller {
	public static void main(String[] args) {
		System.out.println("Enter varA and varB");
		Scanner input = new Scanner(System.in);
	    int varA = input.nextInt();
	    int varB = input.nextInt();
	    if (varA == varB) System.out.println("Equal");
	    else if (varA > varB)  System.out.println("Bigger");
        else if(varA < varB) System.out.println("Smaller");
	}
	
}
