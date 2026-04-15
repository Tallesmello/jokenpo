package useCase;

import model.Jogadas;

public class MecanicaDoJogo implements MecanicaDoJogoUseCase {

    public int vencedor(Jogadas jogador, Jogadas maquina) {

        if (jogador.equals(maquina)) {
            return 0; //"Empatou"
        }

        if (
                (jogador.equals(Jogadas.PEDRA) && (maquina.equals(Jogadas.TESOURA) || maquina.equals(Jogadas.LAGARTO))) ||
                        (jogador.equals(Jogadas.PAPEL) && (maquina.equals(Jogadas.PEDRA) || maquina.equals(Jogadas.SPOCK))) ||
                        (jogador.equals(Jogadas.TESOURA) && (maquina.equals(Jogadas.PAPEL) || maquina.equals(Jogadas.LAGARTO))) ||
                        (jogador.equals(Jogadas.LAGARTO) && (maquina.equals(Jogadas.PAPEL) || maquina.equals(Jogadas.SPOCK))) ||
                        (jogador.equals(Jogadas.SPOCK) && (maquina.equals(Jogadas.PEDRA) || maquina.equals(Jogadas.TESOURA)))
        ) {
            return 1; //"Jogador venceu a RODADA"
        }
        return 2; //"Maquina venceu a RODADA"
    }
}
