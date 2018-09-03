class Student {
	String name;
	String rollNumber;
	double g1;
	double g2;
	double g3;

	Student() {
	}

	Student(String name, String rollNumber, double g1, double g2, double g3) {
		this.name = name;
		this.rollNumber = rollNumber;
		this.g1 = g1;
		this.g2 = g2;
		this.g3 = g3;
	}

	// double getg1() {
	// 	return g1;
	// }

	// double getg2() {
	// 	return g2;
	// }

	// double getg3() {
	// 	return g3;
	// }

    void grade(){
    	double avg = (g1+g2+g3)/3;
    	//double avg = (getg1()+getg2()+getg3())/3;
    	// System.out.println(avg);
    	System.out.format("%.1f", avg); 
    	System.out.println();
    }

	public static void main(String[] arg) {
		Student Student1 = new Student("Sangay", "IT201985001", 7.5, 7.0, 8.0);
        Student1.grade();
		Student Student2 = new Student("Bidhya", "IT201985003", 8.5, 6.0, 7.5);
		Student2.grade();
		Student Student3 = new Student("Kelzang", "IT201985065", 7.5, 8.0, 9.0);
		Student3.grade();
	}
}