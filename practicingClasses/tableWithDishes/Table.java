package randomExercises.practicingClasses.tableWithDishes;

import java.util.Stack;

public class Table {
	Stack<Dishes> dishes = new Stack<Dishes>();

	void addDishesToStack(Dishes dish) {
		if (dishes.size() <= 4) {
			dishes.push(dish);
			System.out.println("Adicionou o " + dish.name + " na pilha");
		} else {
			System.out.println("Não é possivel adicionar mais");
		}
	}

	void removePlateFromQueue() {
		if (dishes.empty()) {
			System.out.println("A pilha está vazia, não há elementos para remover.");
		} else {
			Dishes dish = dishes.pop();
			System.out.println("Retirou o " + dish.name + " da pilha");
		}
	}
	
	void showStackOfPlates() {
		for (Dishes p : dishes) {
			System.out.println(p.name);
		}
	}
}