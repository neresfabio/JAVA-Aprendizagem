public class ContaPoupanca extends Conta{

    @Override
    public void imprimirExtrato() {
        // TODO Auto-generated method stub
        System.out.println("==== Extrato da Conta Poupança ====");
        super.imprimirInfoComuns();
    }    
}
