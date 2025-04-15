package model;

public class Client {
    private String prioridade;
    private String uso;
    private String combustivel;
    private String porte;
    private double orcamento;
    private int anoMinimo;
    private String condicao;

    // Novo construtor
    public Client(String prioridade, String uso,
                  String combustivel, String porte, double orcamento, int anoMinimo, String condicao) {
        this.prioridade = prioridade;
        this.uso = uso;
        this.combustivel = combustivel;
        this.porte = porte;
        this.orcamento = orcamento;
        this.anoMinimo = anoMinimo;
        this.condicao = condicao;
    }

    // Getters e Setters
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

    public double getOrcamento() {
        return orcamento;
    }

    public void setOrcamento(double orcamento) {
        this.orcamento = orcamento;
    }

    public int getAnoMinimo() {
        return anoMinimo;
    }

    public void setAnoMinimo(int anoMinimo) {
        this.anoMinimo = anoMinimo;
    }

    public String getCondicao() {
        return condicao;
    }

    public void setCondicao(String condicao) {
        this.condicao = condicao;
    }

    @Override
    public String toString() {
        return "Client{" +
                ", prioridade='" + prioridade + '\'' +
                ", uso='" + uso + '\'' +
                ", combustivel='" + combustivel + '\'' +
                ", porte='" + porte + '\'' +
                ", orcamento=" + orcamento +
                ", anoMinimo=" + anoMinimo +
                ", condicao='" + condicao + '\'' +
                '}';
    }
}
