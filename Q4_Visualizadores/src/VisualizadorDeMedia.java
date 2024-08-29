import java.util.List;

public class VisualizadorDeMedia implements EventoFonteDeDados{
    private List<Integer> valores;

    public void notifica (List <Integer> valores){ 
        this.valores = valores;
        this.exibeMedia();
    }

    public void exibeMedia(){
        double media = valores.stream()
            .mapToInt(Integer::intValue)
            .average()
            .orElse(0.0);
        System.out.println("Media: "+media+", quantidade de elementos analisados: "+valores.size());
    }
}
