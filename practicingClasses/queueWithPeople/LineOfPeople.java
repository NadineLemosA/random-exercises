package randomExercises.practicingClasses.queueWithPeople;

import java.util.ArrayDeque;
import java.util.Queue;

public class LineOfPeople {
	Queue<Person> LineOfPeople = new ArrayDeque<>();

	void addPeopleToQueue(String name) {
		Person people = new Person(name);
		LineOfPeople.add(people);
	}
}