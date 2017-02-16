package personagem;

import personagem.APersonagem.Personagem;

public class Diretor extends Personagem{
	
	public Diretor(){
		setXp(1000);
		setTotalEfetuado(0);
		setTotalSofrido(0);
	}
	
	@Override
	public void especial() {
		System.out.println("Organiza o campus e responde criminalmente pela entidade");
	}

}
