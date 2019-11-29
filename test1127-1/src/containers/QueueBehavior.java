package containers;

import java.util.concurrent.*;
import java.util.*;
import lzp.*;
import static lzp.tools.*;

class ToDoList extends PriorityQueue<ToDoList.ToDoItem> {
	static class ToDoItem implements Comparable<ToDoItem> {
		private char primary;
		private int secondary;
		private String item;

		public ToDoItem(String td, char pri, int sec) {
			primary = pri;
			secondary = sec;
			item = td;
		}

		public int compareTo(ToDoItem arg) {
			return primary > arg.primary ? 1
					: (primary < arg.primary ? -1
							: (secondary > arg.secondary ? 1 : (secondary < arg.secondary ? -1 : 0)));
		}

		public String toString() {
			return Character.toString(primary) + secondary + ": " + item;
		}
	}

	public void add(String td, char pri, int sec) {
		super.add(new ToDoItem(td, pri, sec));
	}
}

public class QueueBehavior {
	private static int count = 10;

	static <T> void test(Queue<T> queue, Generator<T> gen) {
		for (int i = 0; i < count; i++)
			queue.offer(gen.next());
		while (queue.peek() != null)
			printl(queue.remove() + " ");
		print();
	}

	static class Gen implements Generator<String> {
		String[] s = ("one two three four five six seven eight nine ten".split(" "));
		int i;

		public String next() {
			return s[i++];
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ToDoList toDoList = new ToDoList();
		toDoList.add("Empty trash", 'c', 4);
		toDoList.add("Free dog", 'a', 2);
		toDoList.add("Free bird", 'b', 7);
		toDoList.add("Mow lawn", 'c', 3);
		toDoList.add("Water lawn", 'a', 1);
		toDoList.add("Free cat", 'b', 1);
		while (!toDoList.isEmpty())
			print(toDoList.remove());

//		test(new LinkedList<String>(), new Gen());
//		test(new PriorityQueue<String>(), new Gen());
//		test(new ArrayBlockingQueue<String>(count), new Gen());
//		test(new ConcurrentLinkedQueue<String>(), new Gen());
//		test(new LinkedBlockingQueue<String>(), new Gen());
//		test(new PriorityBlockingQueue<String>(), new Gen());

	}

}
