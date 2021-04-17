
package pucrs.myflight.modelo;

import java.time.Duration;
import java.time.LocalDateTime;

public class VooVariasEscalas extends Voo{
    @Deprecated
    private Rota rota3;
    public VooVariasEscalas(LocalDateTime vDatahora){

        super(vDatahora);
    }

    @Override
    public Rota getRota() {
        return null;
    }

    public Rota getRotaFinal(){
        return this.rota3;
    }

    @Override
    public String toString() {
        return super.toString() + " \n\n |\n V "+ rota3;
    }
}
