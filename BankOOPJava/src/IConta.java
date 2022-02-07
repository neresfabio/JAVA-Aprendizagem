public interface IConta {
     // metodos
    void sacar(double valor);
    void depositar(double valor);
    void tranferir(double valor,Conta contaDestino);
    void imprimirExtrato();
}
