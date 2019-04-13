package abstract_factory.cattle;


import abstract_factory.animals.MaleAnimal;

public class Bull extends MaleAnimal {

	public String getGenericName() {
		
		return "cattle";
	}
	
	public String getAdultName() {
		
		return "bull";
	}
	public String getJuvenileName() {
		
		return "bull calf";
	}
}
