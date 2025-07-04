package arrays;

import java.util.ArrayList;
import java.util.List;

public class Cliente {
    private String nome;
    private List<ContaCorrente> contas;

    public Cliente(String nome) {
        this.nome = nome;
        this.contas = new ArrayList<>();
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public List<ContaCorrente> getContas() {
        return contas;
    }

    public void setContas(List<ContaCorrente> contas) {
        this.contas = contas;
    }

    public void adicionarConta(ContaCorrente conta) {
        contas.add(conta);
    }
}