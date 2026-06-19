import java.time.temporal.ChronoUnit;

class Fatura {
    private double valorBase;
    private LocalDate dataVencimento;
    private double jurosPorDia;
    private double percentualMulta; 
    private boolean isPago;

    public Fatura(double valorBase, LocalDate dataVencimento,
                  double juros, double multa) {
        this.valorBase=valorBase;
        this.dataVencimento=dataVencimento;
        this.jurosPorDia=juros;
        this.percentualMulta=multa;
        this.isPago=false;
    }

    public double calcularValorTotal(LocalDate dataPagamento) {
        if (!dataPagamento.isAfter(dataVencimento)) {
            return valorBase;
        }
        long diasAtraso=ChronoUnit.DAYS.between(dataVencimento,dataPagamento);
        double multa=valorBase*percentualMulta;
        double juros=valorBase*jurosPorDia*diasAtraso;
        return valorBase+multa+juros;
    } public void registrarPagamento() {this.isPago=true;}
}