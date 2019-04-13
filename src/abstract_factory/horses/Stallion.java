package abstract_factory.horses;


import abstract_factory.animals.MaleAnimal;

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
