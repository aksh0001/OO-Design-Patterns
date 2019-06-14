package abstract_factory.af_eg2.horses;


import abstract_factory.af_eg2.animals.FemaleAnimal;

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
