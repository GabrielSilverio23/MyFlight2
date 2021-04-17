package pucrs.myflight.modelo;

import java.time.LocalDateTime;
import java.util.ArrayList;

public class GerenciadorVoos {

    private ArrayList<Voo> voos;

    private GerenciadorVoos(){
        voos = new ArrayList<Voo>();
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

    /*public void inserir(Rota vRota, LocalDateTime vDatahora, double vDuracao){
        voos.add(new VooDireto(vDuracao, vDatahora, vRota));
    }
    public void inserir(LocalDateTime vDatahora, Rota vRota){
        voos.add(new VooDireto(vDatahora, vRota));
    }

    public void inserir(LocalDateTime vDatahora){
        voos.add(new VooEscalas(vDatahora));
    }*/

//    public void inserir(Rota vRota1, Rota vRota2, Rota vRota3, LocalDateTime vDatahora, Duration vDuracao){
//        voos.add(new VooVariasEscalas(vRota1, vRota2, vRota3, vDatahora, vDuracao));
//    }

    /*public void inserir(Rota vRota, double vDuracao){
        voos.add(new Voo(vRota, LocalDateTime.of(2016, 8, 12, 12, 00), vDuracao));
    }*/

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
        String ger = "Voos cadastrados:\n";
        for (Voo v: voos){
            ger = ger + v+"\n";
        }
        return ger;
    }
}
