public class Main {
    public static void main(String[] args) {
        Conta c1 = new ContaCorrente(new Cliente("Rian", "11111"));
        Conta c2 = new ContaPoupanca(new Cliente("Pedro", "564789"));

        c1.deposita(50d);
        c1.transferir(50d, c2);



        Banco banco = new Banco("Inter", Conta.getContas());

        banco.imprimeContas();

    }
}
