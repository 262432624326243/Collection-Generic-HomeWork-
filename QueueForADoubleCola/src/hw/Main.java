package hw;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Human human1 = new Human("Sheldon");
		Human human2 = new Human("Leonard");
		Human human3 = new Human("Volovitc");
		Human human4 = new Human("Kutrapalli");
		Human human5 = new Human("Penny");

		QueueOfHuman humansQueue = new QueueOfHuman();

		humansQueue.addHuman(human1);
		humansQueue.addHuman(human2);
		humansQueue.addHuman(human3);
		humansQueue.addHuman(human4);
		humansQueue.addHuman(human5);

		System.out.println("Queue before:");
		humansQueue.printQueue();

		System.out.println("Enter a val of cans of cola:");
		Scanner sc = new Scanner(System.in);
		int cans = sc.nextInt();
		sc.close();
		humansQueue.changeQueue(cans);
		System.out.println("Queue after:");
	}
}
