package abstract_factory;


import abstract_factory.animals.AnimalFactory;
import abstract_factory.animals.*;

public class TestClient {

	private AnimalFactory factory = null; // MUST be initialized in the constructor
	
	public TestClient(AnimalFactory factory) {
		
		this.factory = factory;
	}
	
	public void testFamily() {
		
		MaleAnimal father = factory.createMale();
		FemaleAnimal mother = factory.createFemale();
		Family testFamily = new Family(mother, father, 3);
		System.out.print(testFamily.description());
		
	}
}
