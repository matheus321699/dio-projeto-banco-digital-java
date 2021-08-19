import entity.*;

public class Aplicacao {

    public static void main(String[] args) {
        Cliente venilton = new Cliente();
        venilton.setNome("Venilton");

        IConta cc = new ContaCorrente(venilton);
        Conta poupanca = new ContaPoupanca(venilton);

        cc.depositar(100);
        cc.transferir(120, poupanca);

        cc.imprimirExtrato();
        System.out.println();
        poupanca.imprimirExtrato();
    }
}
