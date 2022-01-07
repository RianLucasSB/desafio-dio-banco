import java.util.Iterator;
import java.util.List;

public class Banco {
    private String nome;
    private List<Conta> contas;

    public Banco(String nome, List<Conta> contas){
        this.nome = nome;
        this.contas = contas;
    }

    public String getNome() {
        return nome;
    }

    public List<Conta> getContas() {
        return contas;
    }

    public void imprimeContas(){
        for (Conta conta : this.getContas()){
            conta.imprimirExtrato();
        }
    }
}