public class ContaPoupanca extends Conta{
    private Double rentalidadeMensal;

    ContaPoupanca(String contaNumero){
        this.setNumero(contaNumero);
        this.setRentalidadeMensal(0.0075); // 0,75% ao mês :)')
    }

    public Double getRentalidadeMensal() {
        return rentalidadeMensal;
    }

    private void setRentalidadeMensal(Double porcentagem) {
        this.rentalidadeMensal = porcentagem;
    }

    public Double calcularSaldo(){
        double somaDepositoDebitos,somaSaque, saldo;
        somaDepositoDebitos = 0.0;
        somaSaque = 0.0;

        for (Debito deb : this.debitosList){
            somaDepositoDebitos += deb.getValor();
        }

        // Pois esta conta também pode sacar
        for (Credito cred : creditosList) {
            somaSaque += cred.getValor();
        }

        saldo = (somaDepositoDebitos - somaSaque);
        saldo += saldo * this.rentalidadeMensal;
        return saldo;
    }

    @Override
    public void depositar(Double valor) {
        System.out.println("Recebendo... TRANSFERÊNCIA P/ conta POUPANÇA ...");
        System.out.printf("Valor da transferência: %.2f\n", valor);
        System.out.printf("Saldo anterior        : %.2f\n", this.calcularSaldo());
        super.depositar(valor);

        System.out.printf("Calculando rentabilidade de %.2f %% ao mês ... \n", this.getRentalidadeMensal() * 100);
        System.out.printf("Saldo após 1 mês      : %.2f\n\n", this.calcularSaldo());
    }
}
