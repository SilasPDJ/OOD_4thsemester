import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class Cliente extends Pessoa {
    // class Pessoa não pode ser instanciada, pois é abstrata
    private boolean vip;
    List<Endereco> enderecosList = new ArrayList<Endereco>();
    ;

    Cliente(String nome, String cpf, String telefone) {
        this.setNome(nome);
        this.setCpf(cpf);
        this.setTelefone(telefone);

        adicionarEndereco("12345678");
        adicionarEndereco("76543210");

    }

    //public Endereco buscarPorCep(){

    //}
    public void adicionarEndereco(String cep) {
        // change me later if you wish
        Endereco enderec = new Endereco();
        enderec.setCep(cep);
        enderec.setLogadouro("Rua Lorem Ipsum");
        enderec.setNumero("S/N");
        // enderec.setComplemento("");
        enderec.setCidade("SBC");
        enderec.setUf("SP");
        this.enderecosList.add(enderec);
    }

    public List<Endereco> listarEnderecos() {

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
        return this.enderecosList;
    }

}
