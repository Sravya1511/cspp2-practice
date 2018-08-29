public class ConverttoWhileLoop {
	public static void main (String[] args) {
		int i = 2;
		while (i<=10) {
			System.out.println(i);
			if (i== 10) {
				System.out.println("GoodBye!");
				break;
			}
            i = i+2;
		}

	}
}
