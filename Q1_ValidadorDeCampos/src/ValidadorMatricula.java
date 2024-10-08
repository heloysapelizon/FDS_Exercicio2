public class ValidadorMatricula extends ValidadorInteiro{
    public boolean valida(Tipo tipo,String valor){
        if (!super.valida(tipo, valor)){
            return false;
        }
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
    }
}
