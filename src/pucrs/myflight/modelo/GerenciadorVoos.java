package pucrs.myflight.modelo;

import java.time.Duration;
import java.time.LocalDateTime;
import java.util.ArrayList;

public class GerenciadorVoos {

    private ArrayList<Voo> voos;

    public GerenciadorVoos(){
        this.voos = new ArrayList<>();
    }

    public static GerenciadorVoos instance;

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

    public Voo pesquisarData(LocalDateTime data){
        for(Voo v: voos){
            if(data == v.getDatahora())
                return v;
        }
        return null;
    }

    public String listar(){
        return String.format("\n%2s",
                voos);
    }

    @Override
    public String toString() {
        return String.format("\n %2s",
                voos);
    }
}