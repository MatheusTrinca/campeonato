package application;

import java.util.List;
import java.util.Scanner;

import entities.Campeonato;
import entities.Time;

public class Program {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Digite o ano do campeonato: ");
		int ano = sc.nextInt();
		System.out.print("Digite a quantidade de times: ");
		int quantidade = sc.nextInt();
		Campeonato campeonato = new Campeonato(ano, quantidade);
		sc.nextLine();
		System.out.println();
		for(int i = 0; i < quantidade; i++) {
			System.out.print("Digite o nome do time: ");
			String timeNome = sc.nextLine();
			campeonato.addTime(new Time(timeNome));
		
			
		}
		
		
		/**
		 * 
		 * Adicionar as Partidas, fazer jogos com Random simulando os gols dos times
		 * 
		 */
		
		
		
		}


		
		
	

}
