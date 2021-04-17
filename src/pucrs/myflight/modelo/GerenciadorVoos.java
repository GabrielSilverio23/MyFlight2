//Gabriel Silverio, 20106468-0
//MyFlight

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
