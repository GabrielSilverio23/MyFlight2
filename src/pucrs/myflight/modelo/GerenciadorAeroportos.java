package pucrs.myflight.modelo;

import java.util.ArrayList;

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
        for(Aeroporto aeroporto: aeroportos){
            if(cod.equalsIgnoreCase(aeroporto.getCodigo()))
                return aeroporto;
        }
        return null;
    }

    public Aeroporto pesquisarNome(String nome){
        for(Aeroporto ae: aeroportos){
            if(nome.equalsIgnoreCase(ae.getNome()))
                return ae;
        }
        return null;
    }

    public String listar(){
        return String.format("\n%2s",
                aeroportos);
    }

    @Override
    public String toString() {
        return String.format("\n %2s",
                aeroportos);
    }
}
