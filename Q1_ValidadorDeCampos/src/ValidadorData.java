public class ValidadorData implements Validador{
    public boolean valida(Tipo tipo,String valor){
        if(valor.length() != 10){
            return false;
        }
        String dia = valor.substring(0, 2);
        String mes = valor.substring(3, 5);
        String ano = valor.substring(6, 10);
        var validadorInt = new ValidadorInteiro();
        if(!(validadorInt.valida(Tipo.INTEIRO, dia )&& validadorInt.valida(Tipo.INTEIRO, mes) && validadorInt.valida(Tipo.INTEIRO, ano))){
            return false;
        }
        if(!(valor.charAt(2) == '/' && valor.charAt(5) == '/')){
            return false;
        }
        int diaI = Integer.parseInt(dia);
        int mesI = Integer.parseInt(mes);
        int anoI = Integer.parseInt(ano);
        if(diaI <= 0 || diaI > 31 || mesI <= 0 || mesI > 12 || anoI <= 0){
            return false;
        }
        return true;
    }
}
