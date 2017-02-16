package personagem;

import personagem.APersonagem.Personagem;

public class Estudante extends Personagem{
	
	public Estudante(){
		setXp(1000);
		setTotalEfetuado(0);
		setTotalSofrido(0);
	}
	
	@Override
	public void especial() {
		System.out.println("Frequenta o Campus.");
	}

}
