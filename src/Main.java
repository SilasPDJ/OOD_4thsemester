public class Main {
    public static void main(String[] args) {
        gerarFuncionarios();
        separatorPrint("~", 60, 3);
        gerarClientes();

        // Editar os métodos com prefixo 'gerar' p/ incrementar
        // Comentar para ocultar...

    }

    public static void gerarFuncionarios(){
        Funcionario funcionario1 = new Funcionario("Silas Funcionário", "13212312301", "11912341234");
        Funcionario funcionario2 = new Funcionario("Juliano Funcionário", "32132132102", "11912344321");
        funcionario1.setSalario(10000.00);
        funcionario2.setSalario(10000.00);

        funcionario1.atribuirCargo("Gerente");
        funcionario1.atribuirCargo("CTO");
        funcionario1.atribuirCargo("Software Engineer");
        funcionario2.atribuirCargo("Atendente");
        funcionario2.atribuirCargo("CEO");
        funcionario2.atribuirCargo("Data Engineer");

        printFuncionario(funcionario1);
        funcionario1.listarCargos();
        printFuncionario(funcionario2);
        funcionario2.listarCargos();
    }

    public static void gerarClientes(){

        Cliente cliente1 =  new Cliente("Maria José Nascimento", "12345678901", "11912345678");
        cliente1.adicionarEndereco("02134679", "Rua Lorem Ipsum I", "1111", "SBC", "SP");
        cliente1.adicionarEndereco("02134679", "Rua Lorem Ipsum II", "2222", "CASA 2", "SBC", "SP");
        cliente1.adicionarEndereco("02134679", "Rua Lorem Ipsum III", "3333","SBC", "SP");

        cliente1.gerarContaCorrente("0001-123");
        // cliente1.gerarContaCorrente("0001-456");
        // Ao depositar ou sacar o método calcularSaldo já é acionado.
        cliente1.gerarContaPoupanca("0000-999");

        // Cliente cliente2 = new Cliente("Juliano", "10987654321", "11998765432");
        printCliente(cliente1);

        separatorPrint("-", 40, 2);

        // exercício 3)
        cliente1.contaCorrenteList.get(0).depositar(100.00);
        cliente1.contaCorrenteList.get(0).depositar(100.00);
        cliente1.contaCorrenteList.get(0).depositar(100.00);
        cliente1.contaCorrenteList.get(0).sacar(50.00);

        // exercío 4)
        cliente1.contaCorrenteList.get(0).depositar(1000.00);

        separatorPrint("-", 40, 2);
        cliente1.contaPoupancaList.get(0).depositar(1000.00);
        cliente1.contaCorrenteList.get(0).transferir(cliente1.contaPoupancaList.get(0),500.00);
        separatorPrint("~", 60);

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
        System.out.println("------- Criar Cliente -------");
        // Nome, cpf, telefone :
        System.out.print("Nome: ");
        System.out.println(cliente.getNome());
        System.out.print("CPF: ");
        System.out.println(cliente.getCpf());
        System.out.print("Telefone: ");
        System.out.println(cliente.getTelefone());
        System.out.println("--- Listando endereços: ");
        cliente.listarEnderecos();
    }

    private static void separatorPrint(String sep, int qtd, int repeat) {
        String repeated = new String(new char[qtd]).replace("\0", sep);
        for (int i = 0; i<repeat; i++)
        {
            System.out.println(repeated);
        }
    }
    private static void separatorPrint(String sep, int qtd) {
        String repeated = new String(new char[qtd]).replace("\0", sep);
        System.out.println(repeated);
    }

}