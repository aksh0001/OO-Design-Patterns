package abstract_factory.af_eg2.horses;


import abstract_factory.af_eg2.animals.AnimalFactory;
import abstract_factory.af_eg2.animals.FemaleAnimal;
import abstract_factory.af_eg2.animals.MaleAnimal;

public class HorseFactory implements AnimalFactory {

	public MaleAnimal createMale() {
		return new Stallion();
	}
	
	public FemaleAnimal createFemale() {
		
		Mare mare = new Mare();
		mare.setCreator(this);
		return mare;
	}
	
}
