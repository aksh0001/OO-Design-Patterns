package observer.fans;


import observer.game.Game;
import observer.observerPattern.Observer;


public abstract class GameFan extends Observer {

	protected Game gameObserved;
	
	// this must be called before any GameFan gets an update message
	public void setGame(Game game) {
		gameObserved = game;
	}
}
