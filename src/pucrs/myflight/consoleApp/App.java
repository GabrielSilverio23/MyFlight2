package pucrs.myflight.consoleApp;

import pucrs.myflight.modelo.*;

public class App {

	public static void main(String[] args) {

		GerenciadorCias gc = new GerenciadorCias();
		GerenciadorAeronaves av = new GerenciadorAeronaves();
		GerenciadorAeroportos ap = new GerenciadorAeroportos();
		GerenciadorVoos gv = new GerenciadorVoos();


		gc.inserir("JJ", "LATAM Linhas Aereas");
		gc.inserir("G3", "Gol Linhas Aereas SA");
		gc.inserir("TP", "TAP Portugal");
		gc.inserir("AD", "Azul Linhas Aereas");

		av.inserir("733", "Boeing 737-300", 140);
		av.inserir("73G", "Boeing 737-300", 126);

		ap.inserir("POA", "Salgado Filho Intl Apt", -29.9939, -51.1711 );



		//System.out.println(gc.toString());
		//System.out.println(av.toString());
		//System.out.println(ap.toString());
		//System.out.println(av.pesquisar("73G"));
		//System.out.println(gc.pesquisar("JJ"));
		//System.out.println(ap.pesquisarCod("poa"));
		//System.out.println(ap.pesquisarNome("salgado filho intl Apt"));

		System.out.println(av.listar());
	}
}
