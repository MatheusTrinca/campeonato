package entities;

import java.util.List;

public class Time {

	public String nome;
	public int pontos;
	public int saldoGols;
	public Estadio estadio;
	List<Jogador> jogadores;
	
	public Time(String nome) {
		this.nome = nome;
	}
	
	public Time(String nome, Estadio estadio) {
		this.nome = nome;
		this.estadio = estadio;
	}

	public String getNome() {
		return nome;
	}
	
	public int getPontos() {
		return pontos;
	}
	
	public Estadio getEstadio() {
		return estadio;
	}
	
	public int getSaldoGols() {
		return saldoGols;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public void addJogador(Jogador jogador) {
		jogadores.add(jogador);
	}
	
	public void removeJogador(Jogador jogador) {
		jogadores.remove(jogador);
	}
	
	
}
