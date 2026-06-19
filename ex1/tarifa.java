import java.time.LocalDate;

class Tarifa {
    private double valorAtual;
    private LocalDate dataDefinicao;
    private String faixaEtaria;

    public Tarifa(double valorInitial, String faixaEtaria) {
        this.valorAtual=valorInitial;
        this.dataDefinicao=LocalDate.now();
        this.faixaEtaria=faixaEtaria;
    }

    public void aplicarReajusteAnvisa(double percentual) {
        this.valorAtual += this.valorAtual * (percentual / 100);
        this.dataDefinicao = LocalDate.now(); 
    } public double getValorAtual() {return valorAtual;}
}