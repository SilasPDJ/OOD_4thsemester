import java.util.ArrayList;
import java.util.List;

public class Cliente extends Pessoa {
    // class Pessoa não pode ser instanciada, pois é abstrata
    private  boolean vip;
    List<Endereco> empList =  new ArrayList<Endereco>();;

    Cliente(String nome, String cpf, String telefone){
        this.setNome(nome);
        this.setCpf(cpf);
        this.setTelefone(telefone);

        criarEndereco("12345678");
        criarEndereco("76543210");

    }

    //public Endereco buscarPorCep(){

    //}
    public void criarEndereco(String cep){
        Endereco enderec = new Endereco();
        enderec.setCep(cep);
//        enderec.setLogadouro("Rua Alfeu");
//        enderec.setNumero("1000");
//        enderec.setComplemento("-");
//        enderec.setCidade("SBC");
//        enderec.setUf("SP");
        this.empList.add(enderec);
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
