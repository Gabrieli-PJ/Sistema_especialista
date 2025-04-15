package model;

public class Car {
    private int id;
    private String modelo;
    private int ano;
    private double preco;
    private String combustivel;
    private String tipo; // ex: SUV, Hatch, Sedan, Esportivo, etc.
    private String perfilRecomendado; // ex: Econômico, Familiar, Desportivo, Versátil/Urbano
    private String condicao; // "Novo" ou "Usado"

    public Car(int id, String modelo, int ano, double preco, String combustivel, String tipo, String perfilRecomendado, String condicao) {
        this.id = id;
        this.modelo = modelo;
        this.ano = ano;
        this.preco = preco;
        this.combustivel = combustivel;
        this.tipo = tipo;
        this.perfilRecomendado = perfilRecomendado;
        this.condicao = condicao;
    }

    // Getters
    public int getId() { return id; }
    public String getModelo() { return modelo; }
    public int getAno() { return ano; }
    public double getPreco() { return preco; }
    public String getCombustivel() { return combustivel; }
    public String getTipo() { return tipo; }
    public String getPerfilRecomendado() { return perfilRecomendado; }
    public String getCondicao() { return condicao; }

    // Métodos utilitários (exemplos)
    public boolean ehEficienteEnergeticamente() {
        return perfilRecomendado.equalsIgnoreCase("Econômico");
    }

    public boolean temEspacoFamiliar() {
        return tipo.equalsIgnoreCase("SUV") || tipo.equalsIgnoreCase("Minivan") || tipo.equalsIgnoreCase("Perua");
    }

    public boolean ehEsportivo() {
        return tipo.equalsIgnoreCase("Esportivo");
    }

    public boolean ehVersatilParaCidade() {
        return tipo.equalsIgnoreCase("Hatch") || tipo.equalsIgnoreCase("Compacto");
    }

    @Override
    public String toString() {
        return modelo + " (" + ano + ") - R$ " + preco;
    }
}
