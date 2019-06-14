package abstract_factory.af_eg2.cattle;


import abstract_factory.af_eg2.animals.FemaleAnimal;

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
