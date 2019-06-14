package abstract_factory.af_eg2.humans;


import abstract_factory.af_eg2.animals.MaleAnimal;

public class Man extends MaleAnimal {

	public String getGenericName() {
		
		return "human";
	}
	
	public String getAdultName() {
		
		return "man";
	}
	public String getJuvenileName() {
		
		return "boy";
	}
}
