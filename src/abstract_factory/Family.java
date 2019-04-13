package abstract_factory;

import abstract_factory.animals.*;

import java.util.LinkedList;

public class Family {

	private FemaleAnimal mother;
	private MaleAnimal father;
	private LinkedList<Animal> children = new LinkedList<Animal>();
	
	public Family(FemaleAnimal mother, MaleAnimal father, int numberOfChildren) {
		
		this.mother = mother;
		this.father = father;
		for(int i = 0; i < numberOfChildren; i++) {
			children.add(mother.reproduce(father));
		}
	}
	
	public String description() {
		
		String description = "This is a family of animals of type: " + mother.getGenericName() + "\n"
				+ "The mother is a " + mother.getAdultName() + "\n"
				+ "The father is a " + father.getAdultName() + "\n"
				+ "The " + children.size() + " children are:\n";
		for(Animal child : children) {
			description += "\t" + child.getJuvenileName() + "\n";
		}
		
		return description;
	}
}
