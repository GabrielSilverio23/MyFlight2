//Gabriel Silverio, 20106468
//MyFlight

//Nesta classe é testado o codigo do MyFlight.
//Foi criado um objeto para quase todas as classes e feito um insert de dados.
//Todos os comandos que testam cada classe estão comentados, basta remover o '//'.
//até o momento foi realizado quase todos os exercicios sobre o MyFlight, falta apenas o buscar por data que aparentemente nao esta funcionando.

package pucrs.myflight.consoleApp;

import java.time.LocalDateTime;
import pucrs.myflight.modelo.*;

public class App {

	public static void main(String[] args) {
		//Cria a localização dos aeroportos
		Geo poa = new Geo(-29.9939, -51.1711);
		Geo gru = new Geo(-23.4356, -46.4731);
		Geo lis = new Geo(38.7742, -9.1342);
		Geo mia = new Geo(25.7933, -80.2906);

		//Testa o metodo que calcula a distancia
		//System.out.println(Geo.distancia(poa, gru));

		//Cria as companhias aereas
		CiaAerea c1 = new CiaAerea("JJ", "LATAM Linhas Aereas");
		CiaAerea c2 = new CiaAerea("G3", "Gol Linhas Aereas SA");
		CiaAerea c3 = new CiaAerea("TP", "TAP Portugal");
		CiaAerea c4 = new CiaAerea("AD", "Azul Linhas Aereas");

		//cria o objeto gc e insere as companhias em um arraylist
		GerenciadorCias gc = GerenciadorCias.getInstance();
		gc.inserir(c1);
		gc.inserir(c2);
		gc.inserir(c3);
		gc.inserir(c4);
//		Testa o metodo listar e pesquisar da classe GerenciadorCias
//		System.out.println(gc.listar());
//		System.out.println(gc.pesquisar("JJ"));

		//cria as aeronaves
		Aeronave a1 = new Aeronave("733", "Boeing 737-300", 140);
		Aeronave a2 = new Aeronave("73G", "Boeing 737-300", 126);
		Aeronave a3 = new Aeronave("380", "Airbus Industries A380", 644);
		Aeronave a4 = new Aeronave("764", "Boeing 767-400", 304);

		//cria o objeto ga e insere as aeronaves em um arraylist
		GerenciadorAeronaves ga = GerenciadorAeronaves.getInstance();
		ga.inserir(a1);
		ga.inserir(a2);
		ga.inserir(a3);
		ga.inserir(a4);
//		Testa o metodo listar e pesquisar da classe GerenciadorAeronaves
//		System.out.println(ga.listar());
//		System.out.println(ga.pesquisar("733"));

		//Cria os aeroportos
		Aeroporto appoa = new Aeroporto("POA", "Salgado Filho Intl Apt", poa);
		Aeroporto apgru = new Aeroporto("GRU", "São Paulo Guarulhos Intl Apt", gru);
		Aeroporto aplis = new Aeroporto("LIS", "Lisbon", lis);
		Aeroporto apmia = new Aeroporto("MIA", "Miami International Apt", mia);

		//Cria o objeto gap e insere os aeroportos em um arraylist
		GerenciadorAeroportos gap = GerenciadorAeroportos.getInstance();
		gap.inserir(appoa);
		gap.inserir(apgru);
		gap.inserir(aplis);
		gap.inserir(apmia);
//		Testa o metodo listar, pesquisar e ordenar da classe GerenciadorAeroportos
//		System.out.println(gap.listar());
//		gap.ordenaLista();
//		System.out.println(gap.pesquisarCod("poa"));

		//Cria as rotas
		Rota r1 = new Rota(c1, appoa, apgru, a1);
		Rota r2 = new Rota(c2, apmia, aplis, a3);
		Rota r3 = new Rota(c3, aplis, apmia, a3);
		Rota r4 = new Rota(c1, apgru, apmia, a1);

		//cria gr e insere as rotas em um arraylist
		GerenciadorRotas gr = GerenciadorRotas.getInstance();
		gr.inserir(r1);
		gr.inserir(r2);
		gr.inserir(r3);
		gr.inserir(r4);
//		Testa o metodo listar, ordenar e pesquisar da classe GerenciadorRotas
//		System.out.println(gr.listar());
//		gr.ordenaLista();
//		System.out.println(gr.pesquisarOrigem(gap.pesquisarCod("poa")));
//		System.out.println(gr.pesquisarOrigem(appoa));

		//cria os voos diretos
		VooDireto v1 = new VooDireto(LocalDateTime.of(2020,4,10,15,0),r1);
		VooDireto v2 = new VooDireto(LocalDateTime.of(2020,4,12,11,0),r2);
		VooDireto v3 = new VooDireto(LocalDateTime.of(2020,5,10,5,0),r3);
//		cria o voo com escala e adiciona rotas
		VooEscalas v4 = new VooEscalas(LocalDateTime.of(2020,04,10,17,30));
		v4.addRota(r1);
		v4.addRota(r4);
		//System.out.println(v4);

		//cria gv e insere os voos em um arraylist
		GerenciadorVoos gv = GerenciadorVoos.getInstance();

		gv.inserir(v1);
		gv.inserir(v2);
		gv.inserir(v3);
		gv.inserir(v4);

//		Testa o pesquisar data(a principio ainda nao funciona) e listar da classe GerenciadorVoos
//		System.out.println(gv.listar());
		//System.out.println(gv.pesquisarData(dt));


//		double distancia = r1.calcDistancia();
//		double duracao = r1.getDuracao();
		//System.out.println(Geo.distancia(poa, mia));
		//System.out.println(CiaAerea.getTotalCias());
		//System.out.println(distancia+"\n"+ duracao);
	}
}
