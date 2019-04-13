package abstract_factory.cattle;


import abstract_factory.animals.*;

public class CattleFactory implements AnimalFactory {

	public MaleAnimal createMale() {
		return new Bull();
	}
	
	public FemaleAnimal createFemale() {
		
		Cow cow = new Cow();
		cow.setCreator(this); // TODO: find a way to do this automatically for all factories
		return cow;
	}
	
}
