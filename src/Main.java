public class Main {
    public static void main(String[] args) {
        gerarClientes();
        gerarFuncionarios();
        // Editar os métodos com prefixo gerar p/ incrementar
        // Comentar para ocultar...

    }
    public static void gerarFuncionarios(){
        Funcionario funcionario1 = new Funcionario("Silas Funcionário", "13212312301", "11912341234");
        Funcionario funcionario2 = new Funcionario("Juliano Funcionário", "32132132102", "11912344321");
        funcionario1.setSalario(10000.00);
        funcionario2.setSalario(10000.00);

        funcionario1.atribuirCargo("CTO");
        funcionario1.atribuirCargo("Software Engineer");
        funcionario2.atribuirCargo("CEO");
        funcionario2.atribuirCargo("Data Engineer");

        printFuncionario(funcionario1);
        funcionario1.listarCargos();
        printFuncionario(funcionario2);
        funcionario2.listarCargos();
    }

    public static void gerarClientes(){
        Cliente cliente1 =  new Cliente("Silas", "12345678901", "11912345678");
        cliente1.adicionarEndereco("02134679");

        Cliente cliente2 = new Cliente("Juliano", "10987654321", "11998765432");

        printCliente(cliente1);
        printCliente(cliente2);
    }
    public static void printFuncionario(Funcionario func){
        separatorPrint("~", 60);
        System.out.print("Nome: ");
        System.out.println(func.getNome());
        System.out.print("CPF: ");
        System.out.println(func.getCpf());
        System.out.print("Telefone: ");
        System.out.println(func.getTelefone());
        System.out.print("Salário: ");
        System.out.println(func.getSalario());

    }
    public static void printCliente(Cliente cliente){
        // Mudar para dentro do cliente?
        separatorPrint("~", 60);
        // Nome, cpf, telefone :
        System.out.print("Nome: ");
        System.out.println(cliente.getNome());
        System.out.print("CPF: ");
        System.out.println(cliente.getCpf());
        System.out.print("Telefone: ");
        System.out.println(cliente.getTelefone());
        System.out.println("--- Listando endereços: ");
        cliente.listarEnderecos();
        separatorPrint("-", 59);
    }

    private static void separatorPrint(String sep, int qtd) {
        String repeated = new String(new char[qtd]).replace("\0", sep);
        System.out.println(repeated);
    }

}