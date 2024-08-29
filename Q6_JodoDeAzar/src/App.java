public class App {
    public static void main(String[] args) {
        Dado d6 = new Dado(6);
        Dado d20 = new Dado(20);
        DadoEspecial d0 = new DadoEspecial(6);
        d6.rolar();
        d20.rolar();
        d0.rolar();
        System.out.println("D6: " + d6.getValor());
        System.out.println("D20: " + d20.getValor());
        System.out.println("D0: " + d0.getValor());
        d0.rolar();
        System.out.println("D0: " + d0.getValor());
        d0.rolar();
        System.out.println("D0: " + d0.getValor());

        System.out.println("Historico de valores de D0:");
        for (Integer rodada:d0.getHistoricoValores()) {
            System.out.println(rodada);
        }

    }
}
