package jogo;

import armas.Faca;
import armas.Lanca;
import armas.Machado;
import armas.Martelo;
import armas.SocoIngles;
import golpe.Cabecada;
import golpe.Chute;
import golpe.MataLeao;
import golpe.Soco;
import golpe.Voadora;
import interfaces.Armas;
import interfaces.Golpe;
import interfaces.Movimento;
import movimentos.Agachar;
import movimentos.Andar;
import movimentos.Correr;
import movimentos.Nadar;
import movimentos.Pular;
import personagem.Diretor;
import personagem.Empregado;
import personagem.Estudante;
import personagem.Professor;
import personagem.TecnicoAdministrativo;
import personagem.APersonagem.Personagem;

public class Plataforma {

	public static void main(String[] args) {
		
		System.out.println("\nLuta01:\n");
		lutar(new Diretor(), new Nadar(), new Voadora(), new Faca(), new Diretor(), new Correr(), new Voadora(), new SocoIngles());
		
		System.out.println("\nLuta02:\n");
		lutar(new Diretor(), new Pular(), new MataLeao(), new Machado(), new Estudante(), new Andar(), new Soco(), new Martelo());
		
		System.out.println("\nLuta03:\n");
		lutar(new Estudante(), new Correr(), new Voadora(), new Martelo(), new Professor(), new Agachar(), new Chute(), new Faca());
		
		System.out.println("\nLuta04:\n");
		lutar(new Professor(), new Agachar(), new MataLeao(), new Lanca(), new Diretor(), new Correr(), new Soco(), new Faca());
		
		System.out.println("\nLuta05:\n");
		lutar(new Empregado(), new Pular(), new Cabecada(), new SocoIngles(), new Estudante(), new Nadar(), new Voadora(), new Machado());
		
		System.out.println("\nLuta06:\n");
		lutar(new TecnicoAdministrativo(), new Andar(), new Chute(), new Martelo(), new Estudante(), new Correr(), new Chute(), new Lanca());
	}
	
	public static void lutar (Personagem personagem_a, Movimento movimento_personagem_a, Golpe golpe_personagem_a, Armas arma_personagem_a, Personagem personagem_b, Movimento mmovimento_personagem_b,  Golpe golpe_personagem_b, Armas arma_personagem_b){

		System.out.println("Personagem A: \n");
		personagem_a.setMovimento(movimento_personagem_a);
		personagem_a.mover();
		personagem_a.setGolpe(golpe_personagem_a);
		System.out.println("Golpe p1: " + personagem_a.golpeFisico());
		personagem_a.setTotalEfetuado(personagem_a.getTotalEfetuado() + personagem_a.golpeFisico());
		personagem_b.setTotalSofrido(personagem_b.getTotalSofrido() + personagem_a.golpeFisico());
		personagem_b.setXp(personagem_b.getXp() - personagem_a.golpeFisico());
		personagem_a.setArma(arma_personagem_a);
		System.out.println("Golpe p1: " + personagem_a.golpear());
		personagem_a.setTotalEfetuado(personagem_a.getTotalEfetuado() + personagem_a.golpear());
		personagem_b.setTotalSofrido(personagem_b.getTotalSofrido() + personagem_a.golpear());
		personagem_b.setXp(personagem_b.getXp() - personagem_a.golpear());
		
		System.out.println("\nPersonagem B: \n");
		personagem_b.setMovimento(mmovimento_personagem_b);
		personagem_b.mover();
		personagem_b.setGolpe(golpe_personagem_b);
		System.out.println("Golpe p2: " + personagem_b.golpeFisico());
		personagem_b.setTotalEfetuado(personagem_b.getTotalEfetuado() + personagem_b.golpeFisico());
		personagem_a.setTotalSofrido(personagem_a.getTotalSofrido() + personagem_b.golpeFisico());
		personagem_a.setXp(personagem_a.getXp() - personagem_b.golpeFisico());
		personagem_b.setArma(arma_personagem_b);
		System.out.println("Golpe p2: " + personagem_b.golpear());
		personagem_b.setTotalEfetuado(personagem_b.getTotalEfetuado() + personagem_b.golpear());
		personagem_a.setTotalSofrido(personagem_a.getTotalSofrido() + personagem_b.golpear());
		personagem_a.setXp(personagem_a.getXp() - personagem_b.golpear());
		
		System.out.println("\n\nPersonagem1: Life[" + personagem_a.getXp() + "] - Sofrido[" + personagem_a.getTotalSofrido() + "] - Efetuado[" + personagem_a.getTotalEfetuado() + "]\n");
		System.out.println("Personagem2: Life[" + personagem_b.getXp() + "] - Sofrido[" + personagem_b.getTotalSofrido() + "] - Efetuado[" + personagem_b.getTotalEfetuado() + "]\n\n");
		
		if (personagem_a.getXp() > personagem_b.getXp()) {
			System.out.println("Personagem1 venceu!!\n\n");
		} else if (personagem_b.getXp() > personagem_a.getXp()){
			System.out.println("Personagem2 venceu!!\n\n");
		} else {
			System.out.println("Empate!!\n\n");
		}
		
	}

}
