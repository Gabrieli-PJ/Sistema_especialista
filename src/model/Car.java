package model;

public class Car {
    private int id;
    private String modelo;
    private int ano;
    private double preco;
    private String combustivel;
    private String tipo;
    private String perfilRecomendado;
    private String condicao; 

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

    public int getId() {
        return id;
    }

    public String getModelo() {
        return modelo;
    }

    public int getAno() {
        return ano;
    }

    public double getPreco() {
        return preco;
    }

    public String getCombustivel() {
        return combustivel;
    }

    public String getTipo() {
        return tipo;
    }

    public String getPerfilRecomendado() {
        return perfilRecomendado;
    }

    public String getCondicao() {
        return condicao;
    }

    @Override
    public String toString() {
        return modelo + " (" + ano + ") - R$" + preco;
    }
}
