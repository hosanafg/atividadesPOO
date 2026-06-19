import java.util.ArrayList;
import java.util.List;

class Contrato {
    private Pessoa titular;
    private List<Pessoa> dependentes=new ArrayList<>();
    private List<Tarifa> tarifas=new ArrayList<>();
    private List<Fatura> faturas=new ArrayList<>();

    public Contrato(Pessoa titular, double valorTarifaTitular) {
        this.titular=titular;
        this.tarifas.add(new Tarifa(valorTarifaTitular, "Titular"));
    }

    public void adicionarDependente(Pessoa p, double valorTarifa) {
        this.dependentes.add(p);
        this.tarifas.add(new Tarifa(valorTarifa, "Dependente"));
    }

    public Fatura gerarFatura() {
        double somaTarifas=0;
        for (Tarifa t:tarifas) {
            somaTarifas+=t.getValorAtual();
        }
        Fatura nova = new Fatura(somaTarifas, LocalDate.now().plusDays(10), 0.01, 0.02);
        this.faturas.add(nova);
        return nova;
    }
}