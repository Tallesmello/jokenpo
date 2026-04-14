public class MecanicaDoJogo {

    public String vencedor(String jogador, String maquina) {

        if (jogador.equals(maquina)) {
            return "Empatou";
        }

        if (
                (jogador.equals("Pedra") && (maquina.equals("Tesoura") || maquina.equals("Lagarto"))) ||
                        (jogador.equals("Papel") && (maquina.equals("Pedra") || maquina.equals("Spock"))) ||
                        (jogador.equals("Tesoura") && (maquina.equals("Papel") || maquina.equals("Lagarto"))) ||
                        (jogador.equals("Lagarto") && (maquina.equals("Papel") || maquina.equals("Spock"))) ||
                        (jogador.equals("Spock") && (maquina.equals("Pedra") || maquina.equals("Tesoura")))
        ) {
            return "Jogador venceu a RODADA";
        }
        return "Maquina venceu a RODADA";
    }
}
