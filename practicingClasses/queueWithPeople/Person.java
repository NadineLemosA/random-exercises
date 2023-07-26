package randomExercises.practicingClasses.queueWithPeople;

public class Person {
	static int idGenerator = 1;
	int id;
	String name;
	
	Person(String name) {
		this.name = name;
		id = idGenerator;
		idGenerator++;		
	}
}