import java.util.ArrayList;

public class ListaDeJogadas {

    private ArrayList<String> list;

    public ListaDeJogadas(){
        list = new ArrayList<>();
        list.add("Pedra");
        list.add("Papel");
        list.add("Tesoura");
        list.add("Lagarto");
        list.add("Spock");
    }

    public ArrayList<String> getList() {
        return list;
    }
}
