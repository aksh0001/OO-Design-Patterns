package abstract_factory.af_eg2.animals;

public abstract class Animal {
	
	private MaleAnimal father = null;
	private FemaleAnimal mother = null;

	public abstract String getGenericName();
	public abstract String getAdultName();
	public abstract String getJuvenileName();
	
	public void setMother(FemaleAnimal mother) {
		this.mother = mother;
	}
	
	public final FemaleAnimal getMother() {
		return mother;
	}
	
	public void setFather(MaleAnimal father) {
		this.father = father;
	}
	
	public final MaleAnimal getFather() {
		return father;
	}

	
}
