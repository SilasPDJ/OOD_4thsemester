import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class Cliente extends Pessoa implements Usuario {
    // class Pessoa não pode ser instanciada, pois é abstrata
    private boolean vip;
    List<Endereco> enderecosList = new ArrayList<Endereco>();
    public List<ContaCorrente> contaCorrenteList = new ArrayList<ContaCorrente>();
    public List<ContaPoupanca> contaPoupancaList = new ArrayList<ContaPoupanca>();

    Cliente(String nome, String cpf, String telefone) {
        this.setNome(nome);
        this.setCpf(cpf);
        this.setTelefone(telefone);
    }

    public void gerarContaCorrente(String conta){
        ContaCorrente novaConta = new ContaCorrente(conta);
        this.contaCorrenteList.add(novaConta);
//        System.out.println(contaCorrente1.calcularSaldo());
    }
    public void gerarContaPoupanca(String conta){
        ContaPoupanca novaConta = new ContaPoupanca(conta);
        this.contaPoupancaList.add(novaConta);
//        System.out.println(contaCorrente1.calcularSaldo());
    }

    public void adicionarEndereco(String cep, String logradouro, String numero, String complemento, String cidade, String uf) {
        // change me later if you wish
        Endereco enderec = new Endereco();
        enderec.setCep(cep);
        enderec.setLogadouro(logradouro);
        enderec.setNumero(numero);
         enderec.setComplemento(complemento);
        enderec.setCidade(cidade);
        enderec.setUf(uf);
        this.enderecosList.add(enderec);
    }
    public void adicionarEndereco(String cep, String logradouro, String numero, String cidade, String uf) {
        // change me later if you wish
        Endereco enderec = new Endereco();
        enderec.setCep(cep);
        enderec.setLogadouro(logradouro);
        enderec.setNumero(numero);
        // enderec.setComplemento(complemento);
        enderec.setCidade(cidade);
        enderec.setUf(uf);
        this.enderecosList.add(enderec);
    }

    public void listarEnderecos() {

        ListIterator<Endereco> e = this.enderecosList.listIterator();

        // for (Endereco end: this.enderecosList){
        while (e.hasNext()) {
            Endereco endec = e.next();
            System.out.printf("%d) \n", e.nextIndex());
            if (endec.getComplemento() != null && !endec.getComplemento().isEmpty()) {
                System.out.printf("   %s, %s, %s\n", endec.getLogadouro(), endec.getNumero(), endec.getComplemento());
            } else {
                System.out.printf("   %s, %s\n", endec.getLogadouro(), endec.getNumero());
            }
            System.out.printf("   %s - %s, %s", endec.getCidade(), endec.getUf(), endec.getCep());
            System.out.println();
        }

    }

    @Override
    public boolean autenticar() {
        return true;
    }
}
