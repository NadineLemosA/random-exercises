package randomExercises.practicingClasses.ninjaFighting.copy3;

public class PowerElement {
	String name;
	int life, maximumDamage, minimalDamage, multiplicadoeDano, quantidadeDeAtaquParaEspecial;

	PowerElement(String name, int life, int minimalDamage, int maximumDamage, int multiplicadoeDano, int quantidadeDeAtaquParaEspecial) {
		this.name = name;
		this.life = life;
		this.minimalDamage = minimalDamage;
		this.maximumDamage = maximumDamage;
		this.multiplicadoeDano = multiplicadoeDano;
		this.quantidadeDeAtaquParaEspecial = quantidadeDeAtaquParaEspecial;
	}
}
