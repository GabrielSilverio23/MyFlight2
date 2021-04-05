package pucrs.myflight.consoleApp;

import java.time.LocalDateTime;
import java.time.Duration;
import pucrs.myflight.modelo.*;

public class App {

	public static void main(String[] args) {

		Geo poa = new Geo(-29.9939, -51.1711);
		Geo gru = new Geo(-23.4356, -46.4731);
		Geo lis = new Geo(38.7742, -9.1342);
		Geo mia = new Geo(25.7933, -80.2906);

		CiaAerea c1 = new CiaAerea("JJ", "LATAM Linhas Aereas");
		CiaAerea c2 = new CiaAerea("G3", "Gol Linhas Aereas SA");
		CiaAerea c3 = new CiaAerea("TP", "TAP Portugal");
		CiaAerea c4 = new CiaAerea("AD", "Azul Linhas Aereas");

		GerenciadorCias gc = GerenciadorCias.getInstance();

		gc.inserir(c1);
		gc.inserir(c2);
		gc.inserir(c3);
		gc.inserir(c4);



		Aeronave a1 = new Aeronave("733", "Boeing 737-300", 140);
		Aeronave a2 = new Aeronave("73G", "Boeing 737-300", 126);
		Aeronave a3 = new Aeronave("380", "Airbus Industries A380", 644);
		Aeronave a4 = new Aeronave("764", "Boeing 767-400", 304);

		GerenciadorAeronaves ga = GerenciadorAeronaves.getInstance();

		ga.inserir(a1);
		ga.inserir(a2);
		ga.inserir(a3);
		ga.inserir(a4);



		Aeroporto ap1 = new Aeroporto("POA", "Salgado Filho Intl Apt", poa);
		Aeroporto ap2 = new Aeroporto("GRU", "São Paulo Guarulhos Intl Apt", gru);
		Aeroporto ap3 = new Aeroporto("LIS", "Lisbon", lis);
		Aeroporto ap4 = new Aeroporto("MIA", "Miami International Apt", mia);

		GerenciadorAeroportos gap = GerenciadorAeroportos.getInstance();

		gap.inserir(ap1);
		gap.inserir(ap2);
		gap.inserir(ap3);
		gap.inserir(ap4);



		Rota r1 = new Rota(c1, ap1, ap2, a1);
		Rota r2 = new Rota(c2, ap4, ap3, a3);
		Rota r3 = new Rota(c3, ap3, ap4, a3);

		GerenciadorRotas gr = GerenciadorRotas.getInstance();

		gr.inserir(r1);
		gr.inserir(r2);
		gr.inserir(r3);



		GerenciadorVoos gv = GerenciadorVoos.getInstance();



		//gr.inserir(gc.pesquisar("G3"), gap.pesquisarCod("GRU"), gap.pesquisarCod("POA"), ga.pesquisar("733"));



		//gv.inserir(gr.pesquisarOrigem(gap.pesquisarCod("POA")), LocalDateTime.of(2016, 8, 10, 8, 00), Duration.ofMinutes(90));
		//gv.inserir(gr.pesquisarOrigem(gap.pesquisarCod("GRU")), LocalDateTime.of(2016, 8, 10, 15, 00), Duration.ofMinutes(120));
		//gv.inserir(gr.pesquisarOrigem(gap.pesquisarCod("MIA")), LocalDateTime.of(2016, 8, 15, 12, 00), Duration.ofMinutes(120));
		//gv.inserir(gr.pesquisarOrigem(gap.pesquisarCod("POA")), Duration.ofMinutes(120));
		/*gv.inserir(gr.pesquisarOrigem(gap.pesquisarCod("POA")),  gr.pesquisarOrigem(gap.pesquisarCod("GRU")),
				LocalDateTime.of(2016, 8, 15, 12, 00), Duration.ofMinutes(120));*/

		gv.inserir(r1, r2, r3,
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
		//System.out.println(gv.listar());
		//System.out.println(gv.pesquisarData(LocalDateTime.of(2016, 8, 15, 12, 00)));
		//System.out.println(gr.teste());
		//System.out.println(gr.distancia(gap.pesquisarCod("POA").getLocal(), gap.pesquisarCod("mia").getLocal()));
		//System.out.println(gr.distancia(gap.pesquisarCod("POA").getLocal()));
		System.out.println(gv.listar());

	}
}
