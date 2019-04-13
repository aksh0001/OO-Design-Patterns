package abstract_factory.horses;


import abstract_factory.animals.FemaleAnimal;

public class Mare extends FemaleAnimal {

	public String getGenericName() {
		
		return "horse";
	}
	
	public String getAdultName() {
		
		return "mare";
	}
	public String getJuvenileName() {
		
		return "filly";
	}

}
