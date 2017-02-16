package movimentos;

import interfaces.Movimento;

public class Nadar implements Movimento {

	@Override
	public void mover() {
		System.out.println("Movimento: Nadar");
	}

}