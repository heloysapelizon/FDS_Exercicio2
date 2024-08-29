import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class FonteDeDados{
    private List<Integer> lst;
    private List<EventoFonteDeDados> observadores;

    public FonteDeDados(){
        lst = new LinkedList<>();
        this.observadores = new ArrayList<>();
    }

    public void registraObservador(EventoFonteDeDados observador){
        this.observadores.add(observador);
        this.notificaObservador();
    } 

    public void notificaObservador(){
        this.observadores.forEach( obs->obs.notifica(this.lst) );
    }

    public void add(Integer value){
        if (value < 0) throw new IllegalArgumentException("Valor invalido");
        lst.add(value);
        notificaObservador();
    }

    public int quantidade(){
        return lst.size();
    }

    public List<Integer> getValores(){
        return new ArrayList<>(lst);
    }
}