package armas;

import interfaces.Armas;

public class Lanca implements Armas{

	@Override
	public int golpear() {
		return 500;
	}
}