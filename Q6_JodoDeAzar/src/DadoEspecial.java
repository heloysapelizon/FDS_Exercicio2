import java.util.ArrayList;
import java.util.Random;

public class DadoEspecial implements IDado {
    private ArrayList<Integer> historicoValores;
    private int lados;
    private int valorJogada;
    private Random random;
    
    public DadoEspecial(int lados) {
        this.random = new Random();
        this.lados = lados;
        this.historicoValores = new ArrayList<>();
    }

    public int getValor() {
        return valorJogada;
    }

    public void rolar() {
        valorJogada = random.nextInt(lados) + 1;
        historicoValores.add(valorJogada);
    }

    public Iterable<Integer> getHistoricoValores() {
        return historicoValores;
    }
}
