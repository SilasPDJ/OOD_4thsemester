import java.util.List;
import java.util.ArrayList;
public class Main {
    public static void main(String[] args) {

        Cliente cliente1 =  new Cliente("Silas", "12345678901", "11912345678");
        cliente1.criarEndereco("02134679");

        Cliente cliente2 = new Cliente("Juliano", "10987654321", "11998765432");

        printCliente(cliente1);
        printCliente(cliente2);
    }

    public static void printCliente(Cliente cliente){
        // Mudar para dentro do cliente?
        separatorPrint("~", 60);
        // Nome, cpf, telefone :
        System.out.println(cliente.getNome());
        System.out.println(cliente.getCpf());
        System.out.println(cliente.getTelefone());
        cliente.listarEnderecos();
        separatorPrint("-", 59);
    }

    private static void separatorPrint(String sep, int qtd) {
        String repeated = new String(new char[qtd]).replace("\0", sep);
        System.out.println(repeated);
    }

}