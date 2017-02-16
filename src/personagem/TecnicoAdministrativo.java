package personagem;

import personagem.APersonagem.Personagem;

public class TecnicoAdministrativo extends Personagem{
	
	public TecnicoAdministrativo(){
		setXp(1000);
		setTotalEfetuado(0);
		setTotalSofrido(0);
	}
	
	@Override
	public void especial() {
		System.out.println("Organiza as papeladas do Campus.");
	}

}
