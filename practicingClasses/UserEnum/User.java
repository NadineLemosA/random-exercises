package randomExercises.practicingClasses.UserEnum;

public class User {
	String name;
	int age;
	String gender;

	User(String informedName, int reportedAge, String informedGen) {
		name = informedName;
		age = reportedAge;
		gender = informedGen;
	}

	public void displayUserInformation() {
		System.out.println("Informações do usuário: ");
		System.out.println("Nome: " + name);
		System.out.println("Idade: " + age);
		System.out.println("Sexo: " + gender);
	}
}