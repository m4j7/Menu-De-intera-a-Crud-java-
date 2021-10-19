package com.company;
import java.util.ArrayList;
import java.util.List;

import java.util.ArrayList;

public class CadastrosDosGatos {

    private List<Gato> cats = new ArrayList<Gato>();

    public List<Gato> getCats() {
        return cats;
    }

    public void setCats(List<Gato> cats) {
        this.cats = cats;
    }

    public CadastrosDosGatos() {
    }

    @Override
    public String toString() {
        return "CadastrosDosGatos{" +
                "Gatos=" + cats +
                '}';
    }
}
