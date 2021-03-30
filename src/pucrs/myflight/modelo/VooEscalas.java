package pucrs.myflight.modelo;

import java.time.Duration;
import java.time.LocalDateTime;

public class VooEscalas extends Voo{

    private Rota rota2;

    public VooEscalas(Rota vRota1, Rota vRota2, LocalDateTime vDatahora, Duration vDuracao){
        super(vRota1, vDatahora, vDuracao);
        this.rota2 = vRota2;
    }

    public Rota getRotaFinal(){
        return this.rota2;
    }

    @Override
    public String toString() {
        return super.toString() + " -> "+ rota2;
    }
}
