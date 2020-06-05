package entities;

import java.util.Date;

public class Partida {

	private int id;
	private Date data;
	private Arbitro[] arbitros = new Arbitro[4];
	private Time mandante;
	private Time visitante;
	private int golsMandante;
	private int golsVisitante;

	public Partida() {
		
	}
	
	public Partida(int id, Date data, Arbitro[] arbitros, Time mandante, Time visitante) {
		this.id = id;
		this.data = data;
		this.arbitros = arbitros;
		this.mandante = mandante;
		this.visitante = visitante;
	}

	public Date getData() {
		return data;
	}

	public void setData(Date data) {
		this.data = data;
	}

	public Time getMandante() {
		return mandante;
	}

	public void setMandante(Time mandante) {
		this.mandante = mandante;
	}

	public Time getVisitante() {
		return visitante;
	}

	public void setVisitante(Time visitante) {
		this.visitante = visitante;
	}

	public int getId() {
		return id;
	}

	public Arbitro[] getArbitros() {
		return arbitros;
	}

	public int getGolsMandante() {
		return golsMandante;
	}

	public int getGolsVisitante() {
		return golsVisitante;
	}
	
	public Time vencedor() {
		int saldo;
		if(golsMandante > getGolsVisitante()) {
			saldo = golsMandante - golsVisitante;
			mandante.saldoGols += saldo;
			mandante.pontos += 3;
			return mandante;
		}else
			saldo = golsVisitante - golsMandante;
			visitante.saldoGols += saldo;
			visitante.pontos += 3;
			return visitante;
	}
	
	
	
}
