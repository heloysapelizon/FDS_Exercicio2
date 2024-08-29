public interface Validador{
    public enum Tipo { EMAIL, INTEIRO, MATRICULA, CPF, DATA }
    public boolean valida(Tipo tipo,String valor);
}