package abstract_factory.af_eg2.cattle;


import abstract_factory.af_eg2.animals.AnimalFactory;
import abstract_factory.af_eg2.animals.FemaleAnimal;
import abstract_factory.af_eg2.animals.MaleAnimal;

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
