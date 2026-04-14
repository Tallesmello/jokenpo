import java.util.ArrayList;
import java.util.Random;

public class Main {
    public static void main(String[] args) {

        ListaDeJogadas lista = new ListaDeJogadas();
        JogarPartida partida = new JogarPartida(lista.getList());

        RodadasDoJogo resultado = partida.executar();

        System.out.println(resultado.getHistorico());
        System.out.println("Vencedor " + resultado.getVencedor());
    }
}