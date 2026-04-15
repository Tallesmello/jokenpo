package model;

import java.util.ArrayList;

public class ListaDeJogadas {

    private ArrayList<Jogadas> list;

    public ListaDeJogadas(){
        list = new ArrayList<>();
        list.add(Jogadas.PEDRA);
        list.add(Jogadas.PAPEL);
        list.add(Jogadas.TESOURA);
        list.add(Jogadas.LAGARTO);
        list.add(Jogadas.SPOCK);
    }

    public ArrayList<Jogadas> getList() {
        return list;
    }
}
