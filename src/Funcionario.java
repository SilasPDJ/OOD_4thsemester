import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class Funcionario extends Pessoa implements Usuario{
    private double salario;
    List<Cargo> cargosList = new ArrayList<Cargo>();

    Funcionario(String nome, String cpf, String telefone) {
        this.setNome(nome);
        this.setCpf(cpf);
        this.setTelefone(telefone);
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public void atribuirCargo(String nome){
        Cargo cargo = new Cargo();
        cargo.setNome(nome);
        this.cargosList.add(cargo);
    }
    public void listarCargos() {
        int cont = 1;
        System.out.printf("--- Cargos exercídos por %s:\n", getNome());
        for (Cargo cargo : this.cargosList) {
            System.out.printf("    %d) ", cont);
            System.out.println(cargo.getNome());
            cont++;
        }
    }

    @Override
    public boolean autenticar() {
        return true;
    }
}

