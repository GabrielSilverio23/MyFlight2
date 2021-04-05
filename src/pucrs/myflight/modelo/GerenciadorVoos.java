package pucrs.myflight.modelo;

import java.time.Duration;
import java.time.LocalDateTime;
import java.util.ArrayList;

public class GerenciadorVoos {

    private ArrayList<Voo> voos;

    private GerenciadorVoos(){
        this.voos = new ArrayList<>();
    }

    private static GerenciadorVoos instance;

    public static GerenciadorVoos getInstance(){
        if(instance == null)
            instance = new GerenciadorVoos();

        return instance;
    }

    public void inserir(Voo v){
        voos.add(v);
    }

    public void inserir(Rota vRota, LocalDateTime vDatahora, Duration vDuracao){
        voos.add(new Voo(vRota, vDatahora, vDuracao));
    }

    public void inserir(Rota vRota1, Rota vRota2, LocalDateTime vDatahora, Duration vDuracao){
        voos.add(new VooEscalas(vRota1, vRota2, vDatahora, vDuracao));
    }

    public void inserir(Rota vRota1, Rota vRota2, Rota vRota3, LocalDateTime vDatahora, Duration vDuracao){
        voos.add(new VooVariasEscalas(vRota1, vRota2, vRota3, vDatahora, vDuracao));
    }

    public void inserir(Rota vRota, Duration vDuracao){
        voos.add(new Voo(vRota, LocalDateTime.of(2016, 8, 12, 12, 00), vDuracao));
    }

    public ArrayList<Voo> pesquisarData(LocalDateTime data){
        ArrayList<Voo> dataVoo = new ArrayList<Voo>();
        for(Voo v: voos){
            if(v.getDatahora() == data)
                dataVoo.add(v);
        }
        return dataVoo;
    }

    public ArrayList<Voo> listar(){
        return voos;
    }

    @Override
    public String toString() {
        return String.format("\n %2s",
                voos);
    }
}
