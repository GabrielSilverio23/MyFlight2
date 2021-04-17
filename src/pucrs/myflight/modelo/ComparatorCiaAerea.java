//Gabriel Silverio, 20106468-0
//MyFlight

package pucrs.myflight.modelo;
import java.util.Comparator;

public class ComparatorCiaAerea implements Comparator<Rota>{
    @Override
    public int compare(Rota um, Rota outro){
        return um.getCia().getNome().compareTo(outro.getCia().getNome());
    }
}
