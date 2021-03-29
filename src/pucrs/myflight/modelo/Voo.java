package pucrs.myflight.modelo;

import java.time.Duration;
import java.time.LocalDateTime;

public class Voo {

	public enum Status { CONFIRMADO, ATRASADO, CANCELADO };

	private LocalDateTime datahora;
	private Duration duracao;
	private Rota rota;
	private Status status;
	private String dthpadrao;

	public Voo(Rota rota, LocalDateTime datahora, Duration duracao) {
		this.rota = rota;
		this.datahora = datahora;
		this.duracao = duracao;
		this.status = Status.CONFIRMADO; // default é confirmado
	}

	public Voo(Rota rota, Duration duracao) {
		this.rota = rota;
		this.datahora = LocalDateTime.parse("12/08/2016 as 12h");
		this.duracao = duracao;
		this.status = Status.CONFIRMADO; // default é confirmado
	}

	public Rota getRota() {
		return rota;
	}

	public LocalDateTime getDatahora() {
		return datahora;
	}

	public Duration getDuracao() {
		return duracao;
	}

	public Status getStatus() {
		return status;
	}

	public void setStatus(Status novo) {
		this.status = novo;
	}

	@Override
	public String toString(){
		return String.format("\n%s %s %s %s",
				rota,
				datahora,
				duracao,
				status);
	}
}