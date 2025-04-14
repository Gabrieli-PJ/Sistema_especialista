package model;

public class Client {
    private String nome;
    private int idade;
    private String tipoVeiculoDesejado;
    private String prioridade;
    private String uso;
    private String combustivel;
    private String porte;
    private int tamanhoFamilia;

    // Construtor
    public Client(String nome, int idade, String tipoVeiculoDesejado, String prioridade, String uso, 
                  String combustivel, String porte, int tamanhoFamilia) {
        this.nome = nome;
        this.idade = idade;
        this.tipoVeiculoDesejado = tipoVeiculoDesejado;
        this.prioridade = prioridade;
        this.uso = uso;
        this.combustivel = combustivel;
        this.porte = porte;
        this.tamanhoFamilia = tamanhoFamilia;
    }

    // Getters e Setters
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getTipoVeiculoDesejado() {
        return tipoVeiculoDesejado;
    }

    public void setTipoVeiculoDesejado(String tipoVeiculoDesejado) {
        this.tipoVeiculoDesejado = tipoVeiculoDesejado;
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

    public int getTamanhoFamilia() {
        return tamanhoFamilia;
    }

    public void setTamanhoFamilia(int tamanhoFamilia) {
        this.tamanhoFamilia = tamanhoFamilia;
    }

    @Override
    public String toString() {
        return "Client{" +
                "nome='" + nome + '\'' +
                ", idade=" + idade +
                ", tipoVeiculoDesejado='" + tipoVeiculoDesejado + '\'' +
                ", prioridade='" + prioridade + '\'' +
                ", uso='" + uso + '\'' +
                ", combustivel='" + combustivel + '\'' +
                ", porte='" + porte + '\'' +
                ", tamanhoFamilia=" + tamanhoFamilia +
                '}';
    }
}
