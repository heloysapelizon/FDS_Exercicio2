public class Validador{
    public enum Tipo { EMAIL, INTEIRO, MATRICULA, CPF, DATA }
    public boolean valida(Tipo tipo,String valor){
        switch(tipo){
            case INTEIRO:
                for(int i=0;i<valor.length();i++){
                    if (!Character.isDigit(valor.charAt(i))){
                        return false;
                    }
                }
                return true;
            case MATRICULA:
                if (!valida(Tipo.INTEIRO,valor)){
                    return false;
                }else{
                    int sum = 0;
                    for(int i=0;i<valor.length()-1;i++){
                        sum += Character.getNumericValue(valor.charAt(i));
                    }
                    int verificador = sum%10;
                    if (verificador == Character.getNumericValue(valor.charAt(valor.length()-1))){
                        return true;
                    }
                }
                return false;
            case CPF:
                if (!valida(Tipo.INTEIRO,valor) || valor.length() != 11){
                    return false;
                }
                if (verificador(valor, 1, valor.length() - 2) != valor.charAt(9)){
                    return false;
                }
                if (verificador(valor, 0, valor.length() - 1) != valor.charAt(10)){
                    return false;
                }
                return true;
            case DATA:
                boolean validaFormato = valida(Tipo.INTEIRO, valor.substring(0, 2));
                validaFormato = (valor.charAt(2) == '/');
            case EMAIL:
                int posA = valor.indexOf('@');
                int posPt = valor.indexOf('.');
                if (posA <= 0 || posPt <= 0) return false;
                return true;
            default:
                return false;
        }
    }
    private int verificador(String valor, int inicio, int fim){
        int verificador = 0;
        for (int i = inicio; i < fim; i++){
            verificador += valor.charAt(i - inicio) * i;
        }
        return verificador % 11;
    }
}