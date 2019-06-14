package abstract_factory.af_eg2.animals;

public abstract class FemaleAnimal extends Animal {
	
	/* This is useful because it allows the reproduce(...) method to be
	 * defined here in the abstract superclass
	 */
	private AnimalFactory creator = null; // Must be set by constructor
	
	public void setCreator(AnimalFactory creator) {
		this.creator = creator;
	}
	
	public final AnimalFactory getCreator() {
		return creator;
	}
	
	public Animal reproduce(MaleAnimal father) {
	
		Animal child;
		AnimalFactory factory = this.getCreator();
		if (Math.random() > 0.5) { // generate males and females with equal probability
			child = factory.createMale();
		}
		else {
			child = factory.createFemale();
		}
		child.setFather(father);
		child.setMother(this);
		return child;
	}
}
