public class ValidadorCpf extends ValidadorInteiro{
    public boolean valida(Tipo tipo,String valor){
        if(!super.valida(tipo, valor)){
            return false;
        }
        if (verificador(valor, 9) != Character.getNumericValue(valor.charAt(9))){
            return false;
        }
        if (verificador(valor, 10) != Character.getNumericValue(valor.charAt(10))){
            return false;
        }
        return true;
    }
    private int verificador(String valor, int tam) {
        int soma = 0;
        int peso = tam + 1;
        for (int i = 0; i < tam; i++) {
            soma += Character.getNumericValue(valor.charAt(i)) * (peso - i);
        }
        int digito = 11 - (soma % 11);
        return (digito >= 10) ? 0 : digito;
    }
}
