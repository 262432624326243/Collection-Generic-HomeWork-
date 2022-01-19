package hw;

import java.util.ArrayDeque;
import java.util.Queue;

public class QueueOfHuman {
	private Queue<Human> queue = new ArrayDeque<Human>();

	public void addHuman(Human human) {
		this.queue.add(human);
	}

	public void printQueue() {
		System.out.println(queue);
	}

	public void changeQueue(int cans) {
		for (int i = 0; i < cans; i++) {
			Human human = queue.poll();
			queue.add(human);
			queue.add(human);
		}
		System.out.println(queue);
	}
}
