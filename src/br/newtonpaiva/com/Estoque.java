package br.newtonpaiva.com;

public class Estoque {
    private String nome;
    private int qtdAtual;
    private int qtdMinima;

    // Construtor sem parâmetros
    public Estoque() {
        this.nome = "";
        this.qtdAtual = 0;
        this.qtdMinima = 0;
    }

    // Construtor com parâmetros
    public Estoque(String nome, int qtdAtual, int qtdMinima) {
        this.nome = nome;
        this.qtdAtual = qtdAtual;
        this.qtdMinima = qtdMinima;
    }

    // Getters e setters
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getQtdAtual() {
        return qtdAtual;
    }

    public void setQtdAtual(int qtdAtual) {
        this.qtdAtual = qtdAtual;
    }

    public int getQtdMinima() {
        return qtdMinima;
    }

    public void setQtdMinima(int qtdMinima) {
        this.qtdMinima = qtdMinima;
    }

    // Método para dar baixa no estoque
    public void darBaixa(int qtde) {
        if (qtde >= 0) {
            int novaQtd = qtdAtual - qtde;
            if (novaQtd >= 0) {
                qtdAtual = novaQtd;
            } else {
                System.out.println("Não é possível dar baixa. Estoque insuficiente.");
            }
        } else {
            System.out.println("Quantidade inválida.");
        }
    }

    // Método para mostrar informações do estoque
    public String mostra() {
        return "Nome: " + nome + ", Quantidade Mínima: " + qtdMinima + ", Quantidade Atual: " + qtdAtual;
    }

    // Método para verificar se precisa repor o estoque
    public boolean precisaRepor() {
        return qtdAtual <= qtdMinima;
    }
}
