package pucrs.myflight.modelo;

import java.util.ArrayList;

public class GerenciadorAeronaves {
    private ArrayList<Aeronave> avioes;

    public GerenciadorAeronaves(){
        avioes = new ArrayList<>();
    }

    public static GerenciadorAeronaves instance;

    public static GerenciadorAeronaves getInstance(){
        if(instance == null)
            instance = new GerenciadorAeronaves();

        return instance;
    }

    public void inserir(Aeronave aeronave){
        avioes.add(aeronave);
    }

    public void inserir(String umCod, String umaDesc, int umaCap){
        avioes.add(new Aeronave(umCod, umaDesc, umaCap));
    }

    public Aeronave pesquisar(String cod){
        for(Aeronave nav: avioes)
            if(cod.equalsIgnoreCase(nav.getCodigo()))
                return nav;

        return null;
    }

    public String listar(){
        return String.format("\n%2s",
                avioes);
    }

    @Override
    public String toString() {
        return String.format("\n%2s",
                avioes);
    }
}
