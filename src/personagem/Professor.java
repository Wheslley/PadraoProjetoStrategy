package personagem;

import personagem.APersonagem.Personagem;

public class Professor  extends Personagem{
	
	public Professor(){
		setXp(1000);
		setTotalEfetuado(0);
		setTotalSofrido(0);
	}
	
	@Override
	public void especial() {
		System.out.println("Orienta os estudantes do Campus.");
	}

}
