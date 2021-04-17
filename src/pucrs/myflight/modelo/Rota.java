//Gabriel Silverio, 20106468-0
//MyFlight

package pucrs.myflight.modelo;

import java.util.Comparator;

public class Rota {
	private CiaAerea cia;
	private Aeroporto origem;
	private Aeroporto destino;
	private Aeronave aeronave;
	private double duracao;
	
	public Rota(CiaAerea cia, Aeroporto origem, Aeroporto destino, Aeronave aeronave) {
		this.cia = cia;
		this.origem = origem;
		this.destino = destino;
		this.aeronave = aeronave;		
	}	
	
	public CiaAerea getCia() {
		return cia;
	}
	
	public Aeroporto getDestino() {
		return destino;
	}
	
	public Aeroporto getOrigem() {
		return origem;
	}
	
	public Aeronave getAeronave() {
		return aeronave;
	}

	public double calcDistancia(){
		return Geo.distancia(origem.getLocal(), destino.getLocal());
	}

	public double getDuracao(){

		double distancia = calcDistancia();

		double velocidade = 805.1;

		double duracaoH = 0.5+distancia*1.0/velocidade;
		return duracaoH;
	}

	public int compareTo(Rota outro){
		return this.getCia().getNome().compareTo(outro.getCia().getNome());
	}

	@Override
	public String toString(){
		return String.format("\nCia: %s %s %s -> %s",
				cia.getNome(),
				aeronave.getDescricao(),
				origem.getCodigo(),
				destino.getCodigo());

//		return "Cia: "+cia.getNome()+"/"+aeronave.getDescricao()+" || "+origem.getCodigo()+" -> "+destino.getCodigo();
	}
}
