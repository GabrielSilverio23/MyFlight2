package pucrs.myflight.modelo;

public class Aeroporto {
	private String codigo;
	private String nome;
	private Geo loc;

	/*public Aeroporto(String codigo, String nome, Geo loc) {
		this.codigo = codigo;
		this.nome = nome;
		this.loc = loc;
	}*/

	public Aeroporto(String codigo, String nome, double lat, double longi) {
		this.codigo = codigo;
		this.nome = nome;
		this.loc = new Geo(lat, longi);
	}

	public String getCodigo() {
		return codigo;
	}

	public String getNome() {
		return nome;
	}

	public Geo getLocal() {
		return loc;
	}

	@Override
	public String toString() {
		return String.format("\n%2s %2s %2s",
				codigo,
				nome,
				loc);
	}
}
