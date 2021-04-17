//Gabriel Silverio, 20106468-0
//MyFlight

package pucrs.myflight.modelo;

public class Aeronave {
	private String codigo;
	private String descricao;
	private int capacidade;

	public Aeronave(String codigo, String descricao, int capacidade) {
		this.codigo = codigo;
		this.descricao = descricao;
		this.capacidade = capacidade;
	}

	public String getCodigo() {
		return codigo;
	}

	public String getDescricao() {
		return descricao;
	}

	public int getCapacidade(){
		return capacidade;
	}

	@Override
	public String toString(){
//		return String.format("\n%2s  %2s",
//				codigo,
//				descricao);
		return codigo+" - "+descricao;
	}

}
