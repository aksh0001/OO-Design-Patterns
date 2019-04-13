package abstract_factory.humans;


import abstract_factory.animals.FemaleAnimal;

public class Woman extends FemaleAnimal {

	public String getGenericName() {
		
		return "human";
	}
	
	public String getAdultName() {
		
		return "woman";
	}
	public String getJuvenileName() {
		
		return "girl";
	}

}
