package pucrs.myflight.modelo;

import java.time.LocalDateTime;

public class VooDireto extends Voo{
    private Rota rota;

    public VooDireto(LocalDateTime vDataHora, Rota vRota){
        super(vDataHora);
        this.rota = vRota;
    }

    public VooDireto(double vDuracao, LocalDateTime vDataHora, Rota vRota){
        super(vRota, vDataHora, vDuracao);
        this.rota = vRota;
    }

    public VooDireto(double vDuracao, Rota vRota){
        super(vRota, vDuracao);
        this.rota = vRota;
    }

    public Rota getRota() {
        return rota;
    }


    @Override
    public String toString(){
        //return "\n\n"+rota;
        return "\n"+rota+"\n"+super.toString();
    }
}
