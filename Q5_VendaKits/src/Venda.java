import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

public class Venda {
    private LocalDateTime data;
    private List<ComponenteVenda> itens;

    public Venda(LocalDateTime data) {
        this.data = data;
        itens = new ArrayList<>();
    }

    public List<ComponenteVenda> getItens() {
        return itens;
    }

    public LocalDateTime getData() {
        return data;
    }

    public double getTotal() {
        double total = 0.0;
        for(ComponenteVenda item : itens){
            total += item.getPreco();
        }
        return total;
    }

    public void registrarVenda(Produto produto, int quantidade) {
        ItemDeVenda item = new ItemDeVenda(produto, quantidade);
        itens.add(item);
    }

    public String emitirComprovante() {
        StringBuilder nota = new StringBuilder();
        nota.append(String.format("COMPROVANTE DE VENDA%n"));
        nota.append(data.format(DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm")));
        nota.append("\n");
        for (ComponenteVenda item : itens) {
            nota.append(item.getDescricao());
        }
        nota.append(String.format("Total: %.2f", getTotal()));
        return nota.toString();
    }
}
