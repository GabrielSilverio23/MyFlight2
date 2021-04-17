//Gabriel Silverio, 20106468-0
//MyFlight

package pucrs.myflight.modelo;

import java.util.ArrayList;
import java.util.Collections;

public class GerenciadorAeroportos {
    private ArrayList<Aeroporto> aeroportos;

    private GerenciadorAeroportos(){
        this.aeroportos = new ArrayList<>();
    }

    private static GerenciadorAeroportos instance;

    public static GerenciadorAeroportos getInstance(){
        if(instance == null)
            instance = new GerenciadorAeroportos();

        return instance;
    }

    public void inserir(Aeroporto ap){
        aeroportos.add(ap);
    }

    public void inserir(String umCod, String umNome, double umLat, double umLongi){
        aeroportos.add(new Aeroporto(umCod, umNome, umLat, umLongi));
    }

    public Aeroporto pesquisarCod(String cod){
        for(Aeroporto ae: aeroportos){
            if(ae.getCodigo().equalsIgnoreCase(cod))
                return ae;
        }
        return null;
    }

    public Aeroporto pesquisarNome(String nome){
        for(Aeroporto ae: aeroportos){
            if(ae.getNome().equalsIgnoreCase(nome))
                return ae;
        }
        return null;
    }

    public String listar(){
        return String.format("\n%2s",
                aeroportos);
    }

    public void ordenaLista(){
        Collections.sort(aeroportos, new ComparatorNomeAeroporto());

        for(Aeroporto ap: aeroportos){
            System.out.println(ap);
        }
    }

    @Override
    public String toString() {
        return String.format("\n %2s",
                aeroportos);
    }
}
