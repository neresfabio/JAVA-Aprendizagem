public class ContaCorrente extends Conta {
     @Override
    public void imprimirExtrato() {
        // TODO Auto-generated method stub
        System.out.println("==== Extrato da Conta Corrente ====");
        super.imprimirInfoComuns();
    }
}
