package randomExercises.practicingClasses.ninjaFighting.copy2;

public class Ninja {
	String elemento;
	int life, maximumDamage, minimalDamage, multiplicadoeDano, quantidadeDeAtaquParaEspecial, contador;

	Ninja(PowerElement elemento) {
		 this.elemento = elemento.name;
		 life = elemento.life;
		 minimalDamage = elemento.minimalDamage;
		 maximumDamage = elemento.maximumDamage;
		 multiplicadoeDano = elemento.multiplicadoeDano;
		 quantidadeDeAtaquParaEspecial = elemento.quantidadeDeAtaquParaEspecial;
	}
	
	int attack(String elementoAdversario) {
		int dano = calculateBaseDamage();
		
		contador += 1;
		if(contador == quantidadeDeAtaquParaEspecial && !elementoAdversario.equalsIgnoreCase("Earth")) {
			dano *= multiplicadoeDano;
			contador = 0;
		}
		
		return dano;
	}
	
	int calculateBaseDamage() {
		return (int) (Math.random() * (maximumDamage - minimalDamage + 1)) + minimalDamage;
	}
}