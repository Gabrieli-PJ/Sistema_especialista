package especialista;

public class Fact {
    private String prioridade;
    private String uso;
    private int tamanhoFamilia;

    // Construtor
    public Fact(String prioridade, String uso, int tamanhoFamilia) {
        this.prioridade = prioridade;
        this.uso = uso;
        this.tamanhoFamilia = tamanhoFamilia;
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

    public int getTamanhoFamilia() {
        return tamanhoFamilia;
    }

    public void setTamanhoFamilia(int tamanhoFamilia) {
        this.tamanhoFamilia = tamanhoFamilia;
    }
}
