public class App {
    public static void main(String[] args) throws Exception {
        String email = "bernardo.copstein@pucrs.br";
        var validador = new ValidadorEmail();

        if (validador.valida(Validador.Tipo.EMAIL, email)){
            System.out.println(email+" é um email válido!");
        }else{
            System.out.println(email+" não é um email válido!");
        }

        String cpf = "05519961107";
        var validadorCpf = new ValidadorCpf();
        var validadorInteiro = new ValidadorInteiro();
        String valido = validadorCpf.valida(Validador.Tipo.CPF, cpf) && validadorInteiro.valida(Validador.Tipo.INTEIRO, cpf) ? " é um cpf válido" : " não é um cpf válido";
        System.out.println(cpf + valido);

        String data = "09/07/2003";
        var validadorData = new ValidadorData();
        valido = validadorData.valida(Validador.Tipo.DATA, data) ? " é uma data válida" : " não é uma data válida";
        System.out.println(data + valido);
    }
}
