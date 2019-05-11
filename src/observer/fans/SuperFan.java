package observer.fans;

public class SuperFan extends GameFan {

	@Override
	public void update() {
		System.out.print("SuperFan:\t");
		switch(gameObserved.getLastEvent()) {
		case HOME_GOAL:
			System.out.println("Woo-hoo. In your face!");
			break;
		case HOME_BEHIND:
			System.out.println("That was a surely a goal!");
			break;
		case HOME_FREE_KICK:
			System.out.println("He's been doing it all day!");
			break;
		case AWAY_GOAL:
			System.out.println("Arrgghhh!");
			break;
		case AWAY_BEHIND:
			System.out.println("Lucky to get even that!");
			break;
		case AWAY_FREE_KICK:
			System.out.println("No way! What game are you watching, you blind maggot?");
			break;
		}
	}

}
