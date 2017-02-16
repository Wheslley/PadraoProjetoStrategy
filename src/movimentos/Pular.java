package movimentos;

import interfaces.Movimento;

public class Pular implements Movimento {

	@Override
	public void mover() {
		System.out.println("Movimento: Pular");
	}

}