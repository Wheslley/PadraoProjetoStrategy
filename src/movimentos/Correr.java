package movimentos;

import interfaces.Movimento;

public class Correr implements Movimento {

	@Override
	public void mover() {
		System.out.println("Movimento: Agachado");
	}

}