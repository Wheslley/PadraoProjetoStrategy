package personagem;

import personagem.APersonagem.Personagem;

public class Empregado extends Personagem{
	
	public Empregado(){
		setXp(1000);
		setTotalEfetuado(0);
		setTotalSofrido(0);
	}
	
	@Override
	public void especial() {
		System.out.println("Realiza a limpeza e organização das instalações.");
	}

}

