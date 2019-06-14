package abstract_factory.af_eg2.cattle;


import abstract_factory.af_eg2.animals.MaleAnimal;

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
