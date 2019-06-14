package abstract_factory.af_eg2.humans;


import abstract_factory.af_eg2.animals.FemaleAnimal;

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
