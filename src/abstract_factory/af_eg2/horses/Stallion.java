package abstract_factory.af_eg2.horses;


import abstract_factory.af_eg2.animals.MaleAnimal;

public class Stallion extends MaleAnimal {

	public String getGenericName() {
		
		return "horse";
	}
	
	public String getAdultName() {
		
		return "stallion";
	}
	public String getJuvenileName() {
		
		return "colt";
	}
}
