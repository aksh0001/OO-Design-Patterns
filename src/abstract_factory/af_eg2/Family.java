package abstract_factory.af_eg2;

import abstract_factory.af_eg2.animals.Animal;
import abstract_factory.af_eg2.animals.FemaleAnimal;
import abstract_factory.af_eg2.animals.MaleAnimal;

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
