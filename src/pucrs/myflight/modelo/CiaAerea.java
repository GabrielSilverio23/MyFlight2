//Gabriel Silverio, 20106468-0
//MyFlight

package pucrs.myflight.modelo;

public class CiaAerea {
	private String codigo;
	private String nome;

	private static  int totalCias=0;

	public CiaAerea(String codigo, String nome) {
		this.codigo = codigo;
		this.nome = nome;
		totalCias++;
	}

	public String getCodigo() {
		return codigo;
	}

	public String getNome() {
		return nome;
	}

	public static int getTotalCias(){ return totalCias;}

	@Override
	public String toString(){
//		return String.format("\n%2s  %2s",
//				codigo,
//				nome);
		return codigo+" - "+nome;
	}
}
