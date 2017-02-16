package armas;

import interfaces.Armas;

public class Martelo implements Armas{

	@Override
	public int golpear() {
		return 200;
	}
}