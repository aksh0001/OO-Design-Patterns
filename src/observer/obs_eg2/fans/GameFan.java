package observer.obs_eg2.fans;


import observer.obs_eg2.game.Game;
import observer.obs_eg2.observerPattern.Observer;


public abstract class GameFan extends Observer {

	protected Game gameObserved;
	
	// this must be called before any GameFan gets an update message
	public void setGame(Game game) {
		gameObserved = game;
	}
}
