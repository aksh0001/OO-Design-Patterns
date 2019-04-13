package abstract_factory.humans;


import abstract_factory.animals.MaleAnimal;

public class Man extends MaleAnimal {

	public String getGenericName() {
		
		return "human";
	}
	
	public String getAdultName() {
		
		return "man";
	}
	public String getJuvenileName() {
		
		return "boy";
	}
}
