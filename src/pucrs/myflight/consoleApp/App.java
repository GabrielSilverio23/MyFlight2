package pucrs.myflight.consoleApp;

import java.time.LocalDateTime;
import java.time.Duration;
import pucrs.myflight.modelo.*;

public class App {

	public static void main(String[] args) {

		GerenciadorCias gc = new GerenciadorCias();
		GerenciadorAeronaves ga = new GerenciadorAeronaves();
		GerenciadorAeroportos gap = new GerenciadorAeroportos();
		GerenciadorVoos gv = new GerenciadorVoos();
		GerenciadorRotas gr = new GerenciadorRotas();


		gc.inserir("JJ", "LATAM Linhas Aereas");
		gc.inserir("G3", "Gol Linhas Aereas SA");
		gc.inserir("TP", "TAP Portugal");
		gc.inserir("AD", "Azul Linhas Aereas");

		ga.inserir("733", "Boeing 737-300", 140);
		ga.inserir("73G", "Boeing 737-300", 126);
		ga.inserir("380", "Airbus Industries A380", 644);
		ga.inserir("764", "Boeing 767-400", 304);

		gap.inserir("POA", "Salgado Filho Intl Apt", -29.9939, -51.1711 );
		gap.inserir("GRU", "São Paulo Guarulhos Intl Apt", -23.4356, -46.4731 );
		gap.inserir("LIS", "Lisbon", 38.7742, -9.1342 );
		gap.inserir("MIA", "\tMiami International Apt", 25.7933, -80.2906 );

		//gr.inserir(gc.pesquisar("G3"), gap.pesquisarCod("GRU"), gap.pesquisarCod("POA"), ga.pesquisar("733"));
		gr.inserir(gc.pesquisar("G3"), gap.pesquisarCod("POA"), gap.pesquisarCod("GRU"), ga.pesquisar("733"));
		gr.inserir(gc.pesquisar("TP"), gap.pesquisarCod("MIA"), gap.pesquisarCod("LIS"), ga.pesquisar("380"));
		gr.inserir(gc.pesquisar("JJ"), gap.pesquisarCod("GRU"), gap.pesquisarCod("MIA"), ga.pesquisar("380"));


		//gv.inserir(gr.pesquisarOrigem(gap.pesquisarCod("POA")), LocalDateTime.of(2016, 8, 10, 8, 00), Duration.ofMinutes(90));
		//gv.inserir(gr.pesquisarOrigem(gap.pesquisarCod("GRU")), LocalDateTime.of(2016, 8, 10, 15, 00), Duration.ofMinutes(120));
		//gv.inserir(gr.pesquisarOrigem(gap.pesquisarCod("MIA")), LocalDateTime.of(2016, 8, 15, 12, 00), Duration.ofMinutes(120));
		//gv.inserir(gr.pesquisarOrigem(gap.pesquisarCod("POA")), Duration.ofMinutes(120));
		/*gv.inserir(gr.pesquisarOrigem(gap.pesquisarCod("POA")),  gr.pesquisarOrigem(gap.pesquisarCod("GRU")),
				LocalDateTime.of(2016, 8, 15, 12, 00), Duration.ofMinutes(120));*/

		gv.inserir(gr.pesquisarOrigem(gap.pesquisarCod("POA")), gr.pesquisarOrigem(gap.pesquisarCod("GRU")), gr.pesquisarOrigem(gap.pesquisarCod("MIA")),
				LocalDateTime.of(2016, 8, 15, 12, 00), Duration.ofMinutes(120));




		//System.out.println(gc.toString());
		//System.out.println(ga.toString());
		//System.out.println(gap.toString());
		//System.out.println(ga.pesquisar("73G"));
		//System.out.println(gc.pesquisar("JJ"));
		//System.out.println(gap.pesquisarCod("poa"));
		//System.out.println(gap.pesquisarNome("salgado filho intl Apt"));
		//System.out.println(ga.listar());
		//System.out.println(gr.pesquisarOrigem(gap.pesquisarCod("POA")));
		System.out.println(gv.listar());
		//System.out.println(gv.pesquisarData(LocalDateTime.of(2016, 8, 15, 12, 00)));
		//System.out.println(gr.teste());
		//System.out.println(gr.distancia(gap.pesquisarCod("POA").getLocal(), ap.pesquisarCod("GRU").getLocal()));
		//System.out.println(gr.distancia(gap.pesquisarCod("POA").getLocal()));


	}
}
