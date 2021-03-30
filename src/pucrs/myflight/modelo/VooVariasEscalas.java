package pucrs.myflight.modelo;

import java.time.Duration;
import java.time.LocalDateTime;

public class VooVariasEscalas extends VooEscalas{

    private Rota rota3;

    public VooVariasEscalas(Rota vRota1, Rota vRota2, Rota vRota3, LocalDateTime vDatahora, Duration vDuracao){
        super(vRota1, vRota2, vDatahora, vDuracao);
        this.rota3 = vRota3;
    }

    public Rota getRotaFinal(){
        return this.rota3;
    }

    @Override
    public String toString() {
        return super.toString() + " -> "+ rota3;
    }
}
