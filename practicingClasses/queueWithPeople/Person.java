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

//		double doubleRandomNumber = Math.random() * 25;
//		int randomNumber = (int) doubleRandomNumber; // casting
//		id = randomNumber;