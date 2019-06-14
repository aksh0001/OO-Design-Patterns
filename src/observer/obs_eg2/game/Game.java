package observer.obs_eg2.game;
import observer.obs_eg2.observerPattern.Subject;

import java.util.Random;




public class Game extends Subject {
	
	private GameEvent lastEvent;
	private static final Random randomGenerator = new Random();
	private static GameEvent[] eventValues = GameEvent.values();
	
	public void runGame() {
		for (int i = 0; i < 20; i++) {
			lastEvent = eventValues[randomGenerator.nextInt(eventValues.length)]; // select an event from the enum at random
			System.out.println("Event: " + lastEvent.name());
			notifyObservers();
		}
	}
	
	public GameEvent getLastEvent() {
		
		return lastEvent;
	}
	
}
