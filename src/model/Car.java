package model;

public class Car {
    private String nome;
    private int preco;
    private String prioridade;
    private String uso;
    private String combustivel;
    private String porte;

    // Construtor
    public Car(String nome, int preco, String prioridade, String uso, String combustivel, String porte) {
        this.nome = nome;
        this.preco = preco;
        this.prioridade = prioridade;
        this.uso = uso;
        this.combustivel = combustivel;
        this.porte = porte;
    }

    // Getters e Setters
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getPreco() {
        return preco;
    }

    public void setPreco(int preco) {
        this.preco = preco;
    }

    public String getPrioridade() {
        return prioridade;
    }

    public void setPrioridade(String prioridade) {
        this.prioridade = prioridade;
    }

    public String getUso() {
        return uso;
    }

    public void setUso(String uso) {
        this.uso = uso;
    }

    public String getCombustivel() {
        return combustivel;
    }

    public void setCombustivel(String combustivel) {
        this.combustivel = combustivel;
    }

    public String getPorte() {
        return porte;
    }

    public void setPorte(String porte) {
        this.porte = porte;
    }

    @Override
    public String toString() {
        return "Car{" +
                "nome='" + nome + '\'' +
                ", preco=" + preco +
                ", prioridade='" + prioridade + '\'' +
                ", uso='" + uso + '\'' +
                ", combustivel='" + combustivel + '\'' +
                ", porte='" + porte + '\'' +
                '}';
    }
}
