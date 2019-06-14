package abstract_factory.af_eg2.humans;


import abstract_factory.af_eg2.animals.AnimalFactory;
import abstract_factory.af_eg2.animals.FemaleAnimal;
import abstract_factory.af_eg2.animals.MaleAnimal;

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
