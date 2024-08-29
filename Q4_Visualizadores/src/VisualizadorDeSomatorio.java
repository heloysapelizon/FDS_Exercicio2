import java.util.List;

public class VisualizadorDeSomatorio implements EventoFonteDeDados{
    private List<Integer> valores;
    
    public void notifica (List <Integer> valores){ 
        this.valores = valores;
        this.exibeSomatorio();
    }

    public void exibeSomatorio(){
        Integer soma = valores.stream()
            .mapToInt(Integer::intValue)
            .sum();
        System.out.println("Somatorio: "+soma+", quantidade de elementos analisados: "+valores.size());
    }
}
