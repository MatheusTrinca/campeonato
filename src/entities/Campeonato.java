package entities;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Campeonato {

	public int ano;
	public int quantidade;
	public List<Time> times = new ArrayList<>();
	public List<Partida> partidas = new ArrayList<>();
	
	public Campeonato(int ano, int quantidade) {
		this.ano = ano;
		this.quantidade = quantidade;
	}
	
	public void addTime(Time time) {
		times.add(time);
	}
	
	public void addPartida(Partida partida) {
		partidas.add(partida);
	}
	
	public boolean partidaOcorrida(Partida partida) {
		Date dataAtual = new Date();
		if(dataAtual.getTime() > partida.getData().getTime()) {
			return true;
		}
		return false;
	}
	
	public Time[] classificacao() {
		Time[] times = new Time[quantidade];
		int i = 0;
		for(Time time : this.times) {
			times[i] = time;
			i++;
		}
		for(i = 0; i < quantidade; i++) {
			for(int j = 0; j < quantidade; j++) {
				if(times[j].getPontos() < times[i].getPontos()) {
					Time aux = times[j];
					times[j] = times[i];
					times[i] = aux;
				}
			}
		}

		// Trocando times com mesmo numero de pontos, se tiver maior saldo de gols
		for(i = 0; i < (times.length -1); i++) {
			if (times[i].getPontos() == times[i+1].getPontos()) {
				if(times[i].getSaldoGols() < times[i+1].getSaldoGols()) {
					Time aux = times[i];
					times[i] = times[i+1];
					times[i+1] = aux;
				}
			}
		}
		return times;
		
		
		
		
	}
}
