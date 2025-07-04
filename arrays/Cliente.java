package arrays;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.*;
import java.util.List;

public class Cliente {
    private String nome;
    private List<Conta> contas;

    public Cliente(String nome) {
        this.nome = nome;
        this.contas = new ArrayList<>();
    }

    public String getNome() {
        return nome;
    }

    public void adicionarConta(Conta conta) {
        contas.add(conta);
    }

    public List<Conta> getContasOrdenadasPorSaldo() {
        contas.sort(Comparator.comparingDouble(Conta::getSaldo));
        return contas;
    }

    public void imprimirContas() {
        System.out.println("Contas do cliente: " + nome);
        for (Conta conta : getContasOrdenadasPorSaldo()) {
            System.out.println(conta);
        }
    }
}
