import java.util.ArrayList;
import java.util.List;

public class Cliente extends Pessoa {
    // class Pessoa não pode ser instanciada, pois é abstrata
    private  boolean vip;
    List<Endereco> empList = new ArrayList<Endereco>();
    Cliente(String nome, String cpf, String telefone){
        this.setNome(nome);
        this.setCpf(cpf);
        this.setTelefone(telefone);

        this.empList.add(criarEndereco("12345678"));
        this.empList.add(criarEndereco("76543210"));

    }

    //public Endereco buscarPorCep(){

    //}
    static Endereco criarEndereco(String cep){
        // com static posso criar instância
        Endereco enderec = new Endereco();
        enderec.setCep(cep);
//        enderec.setLogadouro("Rua Alfeu");
//        enderec.setNumero("1000");
//        enderec.setComplemento("-");
//        enderec.setCidade("SBC");
//        enderec.setUf("SP");
        return enderec;
    }

    public List<Endereco> listarEnderecos(){
        for (Endereco end: this.empList){
            if(end.getComplemento() != null && !end.getComplemento().isEmpty()){
                System.out.printf("%s, %s, %s\n", end.getLogadouro(), end.getNumero(), end.getComplemento());
            }
            else{
                System.out.printf("%s, %s\n", end.getLogadouro(), end.getNumero());
            }
            System.out.printf("%s - %s, %s", end.getCidade(), end.getUf(), end.getCep());
//            System.out.println(end.getLogadouro());
//            System.out.println(end.getNumero());
//            System.out.println(end.getComplemento());
//            System.out.println(end.getCidade());
//            System.out.println(end.getUf());
            System.out.println();
        }
        return this.empList;
    }
}
