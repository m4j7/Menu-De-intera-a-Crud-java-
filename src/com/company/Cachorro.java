package com.company;

public class Cachorro extends Animal {

    public Cachorro(String cor, String especie, int peso) {
        super(cor, especie, peso);
    }

    public Cachorro() {
    }


    @Override
    public String toString() {
        return getCor() + ';' +
                getEspecie() + ';'+
                getPeso();


    }
}
