package hw;

public class Main {

	public static void main(String[] args) {
		Group TR509 = new Group("TR-509", 3);
		TR509.addStudent(new Student("����", "������", 21));
		TR509.addStudent(new Student("�����", "������", 20));
		TR509.addStudent(new Student("������", "�������", 18));
		System.out.println(TR509);
		TR509.removeStudent("�������");
		System.out.println(TR509);
	}
}
