//Gabriel Silverio, 20106468-0
//MyFlight

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
        //return "\n"+super.toString()+"\n"+rota +"Duração: "+ rota.getDuracao() ;
        return String.format("\n%s  \n\t%s  Duração: %.2f horas",
                super.toString(),
                rota,
                rota.getDuracao());
    }
}
