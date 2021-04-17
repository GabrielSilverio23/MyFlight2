package pucrs.myflight.modelo;

import java.time.LocalDateTime;
import java.util.ArrayList;

public class VooEscalas extends Voo{
    private ArrayList<Rota> rotas;
    private Rota rota;

    public VooEscalas(LocalDateTime vDatahora){
        super(vDatahora);
        rotas = new ArrayList<Rota>();
    }

    public void addRota(Rota escala){
        rotas.add(escala);
    }

    public Rota getRota(){
        return rota;
    }

    public ArrayList<Rota> getRotas(){
        return rotas;
    }

    public double getDuracao(){
        double duracaoT = 0;
        for(Rota escala: rotas){
            duracaoT = duracaoT + escala.getDuracao();
        }

        duracaoT=duracaoT+rotas.size()*0.5;
        return duracaoT;
    }

    @Override
    public String toString() {
        String rotaStr = "";
        for(Rota escala: rotas)
            rotaStr+= String.format("\t%s \tDuração: %.2f horas\n",
                escala,
                escala.getDuracao());

        return String.format("\n %s \n %s\n Duração Total: %.2f",
            super.toString(), rotaStr, getDuracao());
    }
}
