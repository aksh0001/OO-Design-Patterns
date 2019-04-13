package abstract_factory.horses;


import abstract_factory.animals.*;

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
