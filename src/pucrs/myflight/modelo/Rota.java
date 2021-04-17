package pucrs.myflight.modelo;

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

	@Override
	public String toString(){
//		return String.format("\n%s %s %s -> %s",
//				cia,
//				aeronave,
//				origem,	destino);

		return "\nCia: "+cia+"\nAeronave: "+aeronave+"\nOrigem: "+origem+"\nDestino: "+destino;
	}
}
