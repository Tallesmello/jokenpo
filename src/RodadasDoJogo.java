import java.util.ArrayList;
import java.util.List;

public class RodadasDoJogo {

    private int pontosJogador;
    private int pontosMaquina;
    private List<String> historico;
    private String vencedor;

    public RodadasDoJogo() {
        this.historico = new ArrayList<>();
    }

    public int getPontosJogador() {
        return pontosJogador;
    }

    public void setPontosJogador(int pontosJogador) {
        this.pontosJogador = pontosJogador;
    }

    public int getPontosMaquina() {
        return pontosMaquina;
    }

    public void setPontosMaquina(int pontosMaquina) {
        this.pontosMaquina = pontosMaquina;
    }

    public List<String> getHistorico() {
        return historico;
    }

    public void setHistorico(List<String> historico) {
        this.historico = historico;
    }

    public void adicionaLog(String log) {
        this.historico.add(log);
    }

    public String getVencedor() {
        return vencedor;
    }

    public void setVencedor(String vencedor) {
        this.vencedor = vencedor;
    }
}
