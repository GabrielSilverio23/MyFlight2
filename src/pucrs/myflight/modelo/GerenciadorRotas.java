package pucrs.myflight.modelo;

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

    //public void inserirEscala()

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

    public static double distancia(Geo loc1, Geo loc2){
        double lat1 = loc1.getLatitude();
        double long1 = loc1.getLongitude();
        double lat2 = loc2.getLatitude();
        double long2 = loc2.getLongitude();

        double d = 2*6371*Math.sqrt(Math.asin(Math.pow(Math.sin((Math.toRadians(lat2)-Math.toRadians(lat1))/2),2) +
                Math.pow(Math.sin((Math.toRadians(long2)-Math.toRadians(long1))/2),2)*
                        Math.cos(Math.toRadians(lat2))*Math.cos(Math.toRadians(lat1))));
        return d;
    }

    public double distancia(Geo loc1){
        double lat1 = loc1.getLatitude();
        double long1 = loc1.getLongitude();
        double lat2 = -23.435600; // lat2 e long2 é a localização do aeroporto de guarulhos
        double long2 = -46.473100;

        double d = 2*6371*Math.sqrt(Math.asin(Math.pow(Math.sin((Math.toRadians(lat2)-Math.toRadians(lat1))/2),2) +
                Math.pow(Math.sin((Math.toRadians(long2)-Math.toRadians(long1))/2),2)*
                        Math.cos(Math.toRadians(lat2))*Math.cos(Math.toRadians(lat1))));
        return d;
    }

/*    public double teste(){
        double lat1 = -29.993900;
        double long1 = -51.171100;
        double lat2 = -23.435600;
        double long2 = -46.473100;


        double d = 2*6371*Math.sqrt(Math.asin(Math.pow(Math.sin((Math.toRadians(lat2)-Math.toRadians(lat1))/2),2) +
                Math.pow(Math.sin((Math.toRadians(long2)-Math.toRadians(long1))/2),2)*
                        Math.cos(Math.toRadians(lat2))*Math.cos(Math.toRadians(lat1))));

        return d;
    }*/

    @Override
    public String toString() {
        return String.format("\n %2s",
                rota);
    }
}
