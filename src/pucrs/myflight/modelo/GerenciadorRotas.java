//Gabriel Silverio, 20106468-0
//MyFlight

package pucrs.myflight.modelo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class GerenciadorRotas {
    private ArrayList<Rota> rota;

    private GerenciadorRotas(){
        rota = new ArrayList<>();
    }

    private static GerenciadorRotas instance;

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

    //public void inserirEscala()

    public Rota pesquisarOrigem(Aeroporto orig){
        for(Rota rt: rota){
            if(orig == rt.getOrigem())
                return rt;
        }
        return null;
    }


//    public ArrayList<Rota> listar(){
//        ArrayList<Rota> aux = new ArrayList<>();
//        for(Rota r: rota){
//            aux.add(r);
//        }
//        return aux;
//    }

    public String listar(){
        return String.format("\n%2s",
                rota);
    }

    public void ordenaLista(){
        Collections.sort(rota, new ComparatorCiaAerea());

        for(Rota r: rota){
            System.out.println(r);
        }
    }


    @Override
    public String toString() {
        return String.format("\n %2s",
                rota);
    }
}
