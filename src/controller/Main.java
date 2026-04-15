package controller;

import model.ListaDeJogadas;
import model.RodadasDoJogo;
import service.JogarPartida;

public class Main {
    public static void main(String[] args) {

        ListaDeJogadas lista = new ListaDeJogadas();
        JogarPartida partida = new JogarPartida(lista.getList());

        RodadasDoJogo resultado = partida.executar();

        //System.out.println(resultado.getHistorico());

        for (String log : resultado.getHistorico()){
            System.out.println(log);
        }

        System.out.println("\nO vencedor é: " + resultado.getVencedor());

    }
}