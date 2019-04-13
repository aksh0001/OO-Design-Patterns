package abstract_factory.cattle;


import abstract_factory.animals.FemaleAnimal;

public class Cow extends FemaleAnimal {

	public String getGenericName() {
		
		return "cattle";
	}
	
	public String getAdultName() {
		
		return "cow";
	}
	public String getJuvenileName() {
		
		return "heifer calf";
	}
	
}
