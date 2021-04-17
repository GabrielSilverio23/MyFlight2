//Gabriel Silverio, 20106468-0
//MyFlight

package pucrs.myflight.modelo;
import java.util.Comparator;

public class ComparatorNomeAeroporto implements Comparator<Aeroporto>{
    @Override
    public int compare(Aeroporto um, Aeroporto outro){
        return um.getNome().compareTo(outro.getNome());
    }
}
