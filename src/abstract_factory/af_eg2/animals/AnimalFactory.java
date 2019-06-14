package abstract_factory.af_eg2.animals;

public interface AnimalFactory {

	public MaleAnimal createMale();

	/* females need to know the factory used to create them, so they can use it in reproduction.
	 * The implementation must set the creator attribute for the created female. 
	 */
	public FemaleAnimal createFemale();
	
}
