package useCase;

import model.Jogadas;

public interface MecanicaDoJogoUseCase {
    int vencedor(Jogadas jogador, Jogadas maquina);
}
