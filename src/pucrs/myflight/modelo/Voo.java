//Gabriel Silverio, 20106468-0
//MyFlight

package pucrs.myflight.modelo;

import java.time.LocalDateTime;

public abstract class Voo {

	public enum Status { CONFIRMADO, ATRASADO, CANCELADO };

	private LocalDateTime datahora;
	private double duracao;
	private Rota rota;
	private Status status;

	public Voo(LocalDateTime datahora) {
		this.datahora = datahora;
		this.status = Status.CONFIRMADO; // default é confirmado
	}

	public Voo(Rota rota, LocalDateTime datahora, double duracao) {
		this.rota = rota;
		this.datahora = datahora;
		this.duracao = duracao;
		this.status = Status.CONFIRMADO; // default é confirmado
	}


	public Voo(Rota rota, double duracao) {
		this.rota = rota;
		this.datahora = LocalDateTime.of(2016,8,12,12,00);
		this.duracao = duracao;
		this.status = Status.CONFIRMADO; // default é confirmado
	}

	public abstract Rota getRota();

	public LocalDateTime getDatahora() {
		return datahora;
	}

	public Status getStatus() {
		return status;
	}

	public void setStatus(Status novo) {
		this.status = novo;
	}


	@Override
	public String toString(){
		return "\nData: "+datahora + "\nStatus: "+status;
	}
}