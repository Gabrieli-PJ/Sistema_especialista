package especialista;

public class Fact {
    private String faixaEtaria;         
    private String estagioVida;         
    private double orcamento;           
    private String uso;                 
    private int passageiros;            
    private int bagagem;                
    private String prioridade;          
    private String condicaoDesejada;    
    private int anoMinimo;

    public Fact(String faixaEtaria, String estagioVida, double orcamento, String uso,
                int passageiros, int bagagem, String prioridade, String condicaoDesejada,
                int anoMinimo) {
        this.faixaEtaria = faixaEtaria;
        this.estagioVida = estagioVida;
        this.orcamento = orcamento;
        this.uso = uso;
        this.passageiros = passageiros;
        this.bagagem = bagagem;
        this.prioridade = prioridade;
        this.condicaoDesejada = condicaoDesejada;
        this.anoMinimo = anoMinimo;
    }

    public String getFaixaEtaria() {
        return faixaEtaria;
    }

    public String getEstagioVida() {
        return estagioVida;
    }

    public double getOrcamento() {
        return orcamento;
    }

    public String getUso() {
        return uso;
    }

    public int getPassageiros() {
        return passageiros;
    }

    public int getBagagem() {
        return bagagem;
    }

    public String getPrioridade() {
        return prioridade;
    }

    public String getCondicaoDesejada() {
        return condicaoDesejada;
    }

    public int getAnoMinimo() {
        return anoMinimo;
    }
}
