package pucrs.myflight.modelo;

import java.time.Duration;
import java.time.LocalDateTime;
import java.util.ArrayList;

public class GerenciadorRotas {
    private ArrayList<Rota> rota;

    public GerenciadorRotas(){
        rota = new ArrayList<>();
    }

    public static GerenciadorRotas instance;

    public static GerenciadorRotas getInstance(){
        if(instance == null)
            instance = new GerenciadorRotas();

        return instance;
    }

    public void inserir(Rota rt){
        rota.add(rt);
    }

    public void inserir(CiaAerea vCia, Aeroporto vOrigem, Aeroporto vDestino, Aeronave vAeronave){
        rota.add(new Rota(vCia, vOrigem, vDestino, vAeronave));
    }

    public Rota pesquisarOrigem(Aeroporto orig){
        for(Rota rt: rota){
            if(orig == rt.getOrigem())
                return rt;
        }
        return null;
    }

    public String listar(){
        return String.format("\n%2s",
                rota);
    }

    @Override
    public String toString() {
        return String.format("\n %2s",
                rota);
    }
}
