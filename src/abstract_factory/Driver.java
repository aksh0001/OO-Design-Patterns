package abstract_factory;

import abstract_factory.cattle.CattleFactory;
import abstract_factory.horses.HorseFactory;
import abstract_factory.humans.HumanFactory;
import abstract_factory.animals.*;


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
