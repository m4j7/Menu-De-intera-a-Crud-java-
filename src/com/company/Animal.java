package com.company;

public class Animal {

    private String cor;
    private String especie;
    private int peso;

    public Animal(String cor, String especie, int peso) {
        this.cor = cor;
        this.especie = especie;
        this.peso = peso;
    }

    public Animal() {
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public String getEspecie() {
        return especie;
    }

    public void setEspecie(String especie) {
        this.especie = especie;
    }

    public int getPeso() {
        return peso;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }

    public void andar(){
    }

    @Override
    public String toString() {
        return cor + ';' +
               especie + ';'+
               peso;

    }
}
