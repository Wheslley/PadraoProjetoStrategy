package movimentos;

import interfaces.Movimento;

public class Andar implements Movimento {

	@Override
	public void mover() {
		System.out.println("Movimento: Andar");
	}

}
