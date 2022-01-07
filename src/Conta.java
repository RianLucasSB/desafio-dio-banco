import java.util.ArrayList;
import java.util.List;

public class Conta implements IConta {

    private final Cliente cliente;
    private double saldo;
    private final int agencia;
    private int numero;
    private static int sequencial = 1;
    private static final int AGENCIA = 1234;

    private static List<Conta> contas = new ArrayList<>();

    public Conta(Cliente cliente){
        this.cliente = cliente;
        this.numero = sequencial++;
        this.agencia = AGENCIA;
        contas.add(this);
    }

    public Cliente getCliente() {
        return cliente;
    }

    public Double getSaldo() {
        return saldo;
    }


    public Integer getNumero() {
        return numero;
    }

    public Integer getAgencia() {
        return agencia;
    }

    @Override
    public boolean saca(Double valor) {
        if (valor < 0){
            System.out.println("Valor inferior a zero");
            return false;
        }else if(valor > this.saldo){
            System.out.println("Saldo insuficiente");
            return false;
        }else{
            this.saldo -= valor;
            return true;
        }
    }

    @Override
    public boolean deposita(Double valor) {
        if (valor < 0){
            System.out.println("Valor inferior a zero");
            return false;
        }else{
            this.saldo += valor;
            return true;
        }
    }

    @Override
    public void transferir(Double valor, Conta outraConta) {
        if (this.saca(valor)){
            outraConta.deposita(valor);
        }
    }

    @Override
    public void imprimirExtrato() {
        System.out.println("Nome: " + this.cliente.getNome());
        System.out.println("Saldo: " + this.getSaldo());
        System.out.println("Agencia: " + this.getAgencia());
        System.out.println("Numero da conta: " + this.getNumero());
    }

    public static List<Conta> getContas(){
        return contas;
    }
}
