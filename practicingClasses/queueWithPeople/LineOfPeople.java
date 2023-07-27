package randomExercises.practicingClasses.queueWithPeople;

import java.util.ArrayDeque;
import java.util.Queue;

public class LineOfPeople {
	Queue<Person> line = new ArrayDeque<>();

	void addPeopleToQueue(Person person) {
		line.add(person);
	}

	void showTheQueue() {
		for (Person p : line) {
			System.out.print(p.id + " ");
			System.out.println(p.name);
		}
	}

	boolean checkQueueMembers(int idInformed) {
		boolean result = false;
		for (int i = 0; i < line.size(); i++) {
			if (idInformed == line.element().id) {
				return true;
			}
			result = false;
		}
		return result;
	}

	void removePersonOfLine(Person person) {
		line.remove(person);
	}

	void callNextInLine() {
		line.remove();
	}
}