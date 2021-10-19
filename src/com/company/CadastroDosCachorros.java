package com.company;
import java.util.ArrayList;
import java.util.List;


public class CadastroDosCachorros {

    private ArrayList<Cachorro> dogs = new ArrayList<Cachorro>();

    public CadastroDosCachorros(ArrayList<Cachorro> dogs) {
        this.dogs = dogs;
    }


    public ArrayList<Cachorro> getDogs() {
        return dogs;
    }

    public void setDogs(ArrayList<Cachorro> dogs) {
        this.dogs = dogs;
    }

    public CadastroDosCachorros() {
    }

    @Override
    public String toString() {
        return "CadastroDosCachorros{" +
                "Cachorro=" + dogs +
                '}';
    }

}
