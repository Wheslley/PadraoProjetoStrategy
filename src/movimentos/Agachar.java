package movimentos;

import interfaces.Movimento;

public class Agachar implements Movimento {

	@Override
	public void mover() {
		System.out.println("Movimento: Agachar");
	}

}
