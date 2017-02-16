package armas;

import interfaces.Armas;

public class Machado implements Armas{

	@Override
	public int golpear() {
		return 1000;
	}
}