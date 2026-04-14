import java.util.List;
import java.util.Random;

public class JogarPartida {

    private List<String> acoes;
    private Random random;
    private MecanicaDoJogo mecanica;

    public JogarPartida(List<String> acoes) {
        this.acoes = acoes;
        this.random = new Random();
        this.mecanica = new MecanicaDoJogo();
    }

    public RodadasDoJogo executar() {

        RodadasDoJogo resultado = new RodadasDoJogo();

        int pontosJogador = 0;
        int pontosMaquina = 0;
        int rodada = 1;

        while (pontosJogador < 3 && pontosMaquina < 3) {

            String jogador = acoes.get(random.nextInt(acoes.size()));
            String maquina = acoes.get(random.nextInt(acoes.size()));

            String resultadoDaRodada = mecanica.vencedor(jogador, maquina);

            if (resultadoDaRodada.equals("Jogador venceu a RODADA")) {
                pontosJogador++;
            } else if (resultadoDaRodada.equals("Maquina venceu a RODADA")) {
                pontosMaquina++;
            }

            String log = "\nRodada " + rodada +
                    "\n | Jogador: " + jogador +
                    "\n | Máquina: " + maquina +
                    "\n | Resultado: " + resultadoDaRodada;

            resultado.adicionaLog(log);

            if (!resultadoDaRodada.equals("Empatou")) {
                rodada++;
            }
        }
        resultado.setPontosJogador(pontosJogador);
        resultado.setPontosMaquina(pontosMaquina);

        if (pontosJogador > pontosMaquina) {
            resultado.setVencedor("Jogador");
        } else {
            resultado.setVencedor("Maquina");
        }
        return resultado;
    }

}

