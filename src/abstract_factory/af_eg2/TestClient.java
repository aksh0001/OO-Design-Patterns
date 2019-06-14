package abstract_factory.af_eg2;


import abstract_factory.af_eg2.animals.AnimalFactory;
import abstract_factory.af_eg2.animals.FemaleAnimal;
import abstract_factory.af_eg2.animals.MaleAnimal;

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
