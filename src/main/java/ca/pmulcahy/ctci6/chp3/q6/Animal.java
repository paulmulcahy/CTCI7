package ca.pmulcahy.ctci6.chp3.q6;

public class Animal{
	private Species species;
	private String name;
	Animal(Species species, String name) {
		this.species = species;
		this.name = name;
	}
	public Species getSpecies() {
		return species;
	}
	public String getName() {
		return name;
	}
	@Override
	public String toString() {
		return name + " the " + species.toString();
	}
}