package observer.fans;

public class Hater extends GameFan {

	@Override
	public void update() {
		System.out.print("Hater:\t\t");
		switch(gameObserved.getLastEvent()) {
		case HOME_GOAL:
			System.out.println("Dang!");
			break;
		case HOME_BEHIND:
			System.out.println("Naaaa.");
			break;
		case HOME_FREE_KICK:
			System.out.println("You must be joking, umpy!");
			break;
		case AWAY_GOAL:
			System.out.println("Whoo-hoo!");
			break;
		case AWAY_BEHIND:
			System.out.println("Yes!");
			break;
		case AWAY_FREE_KICK:
			System.out.println("About time!");
			break;
		}
	}

}
