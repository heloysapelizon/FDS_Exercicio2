public class App {
    public static void main(String[] args) throws Exception {
        Codificador codSimples = new CodificadorSimples();
        Codificador codDesloca = new CodificadorDesloca();

        String aux = "Desafio Padrões de Projeto";

        System.out.println(aux);
        aux = codSimples.codifica(aux);
        System.out.println(aux);
        aux = codSimples.deCodifica(aux);
        System.out.println(aux);
        aux = codDesloca.codifica(aux);
        System.out.println(aux);
        aux = codDesloca.deCodifica(aux);
        System.out.println(aux);
    }
}
