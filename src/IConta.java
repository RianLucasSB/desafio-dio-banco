public interface IConta {
    boolean saca(Double valor);

    boolean deposita(Double valor);

    void transferir(Double valor, Conta outraConta);

    void imprimirExtrato();
}
