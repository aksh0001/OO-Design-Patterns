package abstract_factory.humans;


import abstract_factory.animals.AnimalFactory;
import abstract_factory.animals.*;

public class HumanFactory implements AnimalFactory {

	public MaleAnimal createMale() {
		return new Man();
	}
	
	public FemaleAnimal createFemale() {
		
		Woman woman = new Woman();
		woman.setCreator(this);
		return woman;
	}
	
}
