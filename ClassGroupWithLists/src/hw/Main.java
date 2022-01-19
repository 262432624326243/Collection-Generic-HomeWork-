package hw;

public class Main {

	public static void main(String[] args) {
		Group TR509 = new Group("TR-509", 3);
		TR509.addStudent(new Student("Іван", "Моцний", 21));
		TR509.addStudent(new Student("Тарас", "Машина", 20));
		TR509.addStudent(new Student("Дмитро", "Молодий", 18));
		System.out.println(TR509);
		TR509.removeStudent("Молодий");
		System.out.println(TR509);
	}
}
