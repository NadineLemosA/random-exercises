package randomExercises.practicingClasses.tableWithDishes;

public class Application {
	public static void main(String[] args) {
		Table mesa = new Table();

		mesa.addDishesToStack(new Dishes("Prato 1"));
		mesa.addDishesToStack(new Dishes("Prato 2"));
		mesa.showStackOfPlates();
		mesa.addDishesToStack(new Dishes("Prato 3"));
		mesa.addDishesToStack(new Dishes("Prato 4"));
		mesa.addDishesToStack(new Dishes("Prato 5"));
		mesa.showStackOfPlates();

		mesa.removePlateFromQueue();
	}
}
