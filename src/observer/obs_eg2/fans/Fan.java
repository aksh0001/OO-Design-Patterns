package observer.obs_eg2.fans;

public class Fan extends GameFan {

	@Override
	public void update() {
		System.out.print("Fan:\t\t");
		switch(gameObserved.getLastEvent()) {
		case HOME_GOAL:
			System.out.println("You beauty!");
			break;
		case HOME_BEHIND:
			System.out.println("Yay!");
			break;
		case HOME_FREE_KICK:
			System.out.println("Woo-hoo!");
			break;
		case AWAY_GOAL:
			System.out.println("Boo!");
			break;
		case AWAY_BEHIND:
			System.out.println("Phew.");
			break;
		case AWAY_FREE_KICK:
			System.out.println("No way!");
			break;
		}
	}

}
