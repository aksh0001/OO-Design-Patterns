package observer.obs_eg2;

import observer.obs_eg2.fans.Fan;
import observer.obs_eg2.fans.Hater;
import observer.obs_eg2.fans.Neutral;
import observer.obs_eg2.fans.SuperFan;
import observer.obs_eg2.game.Game;


public class Driver {

    /**
     * @param args
     */
    public static void main(String[] args) {

        // create a game
        Game testGame = new Game();
        // create a few fans of different types to watch the game
        Fan fan = new Fan();
        fan.setGame(testGame); // the observer needs to know what it is observing
        SuperFan superFan = new SuperFan();
        superFan.setGame(testGame);
        SuperFan superFan2 = new SuperFan();
        superFan2.setGame(testGame);
        Hater hater = new Hater();
        hater.setGame(testGame);
        Neutral neutral = new Neutral();
        neutral.setGame(testGame);
        // attach the fans as observers of the game
        testGame.attach(fan);
        testGame.attach(superFan);
        testGame.attach(superFan2);
        testGame.attach(hater);
        testGame.attach(neutral);
        // run the game and see how the fans respond
        testGame.runGame();
    }

}
