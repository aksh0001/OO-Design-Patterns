package abstract_factory.af_eg2;

import abstract_factory.af_eg2.horses.HorseFactory;


public class Driver {

    /**
     * @param args
     */
    public static void main(String[] args) {

        //HumanFactory AnimalFactory = new HumanFactory();
        //CattleFactory AnimalFactory = new CattleFactory();
        HorseFactory AnimalFactory = new HorseFactory();

        TestClient client = new TestClient(AnimalFactory);
        client.testFamily();
    }

}
