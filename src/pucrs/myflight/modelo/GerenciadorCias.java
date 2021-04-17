package pucrs.myflight.modelo;

import java.util.ArrayList;

public class GerenciadorCias {
	private ArrayList<CiaAerea> empresas;

	private GerenciadorCias() {
		empresas = new ArrayList<>();
	}

	private static GerenciadorCias instance;

	public static  GerenciadorCias getInstance(){
		if(instance == null)
			instance = new GerenciadorCias();

		return instance;
	}

	public void inserir(CiaAerea cia){
		empresas.add(cia);
	}

	public void inserir(String umCodigo, String umNome){
		empresas.add(new CiaAerea(umCodigo, umNome));
	}

	public ArrayList<CiaAerea> listar() {
		ArrayList<CiaAerea> aux = new ArrayList<>();
		for( CiaAerea cia : empresas){
			aux.add(cia);
		}
		return aux;
	}

	public CiaAerea pesquisar(String cod){
		for(CiaAerea cia: empresas){
			if(cod.equalsIgnoreCase(cia.getCodigo()))
				return cia;
		}
		return null;
	}

	@Override
	public String toString() {
		return String.format("\n%2s",
				empresas);
	}
}
