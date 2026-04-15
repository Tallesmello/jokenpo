import java.util.List;
import java.util.Random;

public class JogarPartida {

    private List<Jogadas> acoes;
    private Random random = new Random();
    private MecanicaDoJogo mecanica;

    public JogarPartida(List<Jogadas> acoes) {
        this.acoes = acoes;
        this.mecanica = new MecanicaDoJogo();
    }

    public RodadasDoJogo executar() {

        RodadasDoJogo resultado = new RodadasDoJogo();

        int pontosJogador = 0;
        int pontosMaquina = 0;
        int rodada = 1;

        while (pontosJogador < 3 && pontosMaquina < 3) {

            Jogadas jogador = acoes.get(random.nextInt(acoes.size()));
            Jogadas maquina = acoes.get(random.nextInt(acoes.size()));

            int resultadoDaRodada = mecanica.vencedor(jogador, maquina);

            String resultadoEmTexto;

            if (resultadoDaRodada == 0) {
                resultadoEmTexto = "Empatou";
            } else if (resultadoDaRodada == 1) {
                resultadoEmTexto = "Jogador Venceu";
            }else {
                resultadoEmTexto = "Maquina venceu";
            }

            if (resultadoDaRodada == 1){
                pontosJogador++;
            } else if (resultadoDaRodada == 2) {
                pontosMaquina++;
            }

            String log = "\nRodada " + rodada +
                    "\n | Jogador: " + jogador +
                    "\n | Máquina: " + maquina +
                    "\n | Resultado: " + resultadoEmTexto;

            resultado.adicionaLog(log);

            if (resultadoDaRodada != 0) {
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

