package randomExercises.practicingClasses.queueWithPeople;

import java.util.ArrayDeque;
import java.util.Queue;

public class LineOfPeople {
	Queue<Person> line = new ArrayDeque<>();

	void addPeopleToQueue(Person person) {
		line.add(person);
	}

	void showQueue() {
		for (Person p : line) {
			System.out.println(p.id + " " + p.name);
		}
	}

	boolean checkQueueMembers(int idInformed) {
		for (int i = 0; i < line.size(); i++) {
			if (idInformed == line.element().id) {
				return true;
			}
		}
		return false;
	}

	Person removePersonOfLine(Person person) {
		line.remove(person);
		return person;
	}

	Person callNextInLine() {
		return line.remove(); // isso funciona dessa forma?
	}
}