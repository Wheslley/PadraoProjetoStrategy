package personagem.APersonagem;

import interfaces.Armas;
import interfaces.Golpe;
import interfaces.Movimento;

public abstract class Personagem {
	
	private Movimento movimento;
	private Armas arma;
	private Golpe golpe;
	private Integer xp;
	private Integer totalSofrido;
	private Integer totalEfetuado;
	
	/*AçõesGenuínas*/
	public abstract void especial();
	
	/*Acoes Genericas*/	
	public void mover(){
		this.movimento.mover();
	}
	
	public int golpear(){
		return this.arma.golpear();
	}
	
	public int golpeFisico(){
		return this.golpe.golpeFisico();
	}
	
	/*Setters*/	
	public void setMovimento(Movimento movimento){
		this.movimento = movimento;
	}

	public void setArma(Armas arma) {
		this.arma = arma;
	}
	
	public void setGolpe(Golpe golpe){
		this.golpe = golpe;
	}

	public Integer getXp() {
		return xp;
	}

	public void setXp(Integer xp) {
		if(xp < 0) xp = 0;
		this.xp = xp;
	}

	public Integer getTotalSofrido() {
		return totalSofrido;
	}

	public void setTotalSofrido(Integer totalSofrido) {
		this.totalSofrido = totalSofrido;
	}

	public Integer getTotalEfetuado() {
		return totalEfetuado;
	}

	public void setTotalEfetuado(Integer totalEfetuado) {
		this.totalEfetuado = totalEfetuado;
	}
	
}
