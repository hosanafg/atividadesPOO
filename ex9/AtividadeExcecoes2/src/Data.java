public class Data {
    private int dia;
    private int mes;
    private int ano;

    public Data(int dia, int mes, int ano) throws DataException {
        if (ano < 1) {
            throw new DataException(dia, mes, ano, "O ano deve ser maior ou igual a 1.");
        } if (mes < 1 || mes > 12) {
            throw new DataException(dia, mes, ano, "O mês deve estar situado entre 1 e 12.");
        } int maxDiasNoMes = obterMaxDiasDoMes(mes, ano);
        if (dia < 1 || dia > maxDiasNoMes) {
            throw new DataException(dia, mes, ano, "O dia para o mês " + mes + 
                                    " deve estar entre 1 e " + maxDiasNoMes + ".");
        }
        else {
            this.dia = dia;
            this.mes = mes;
            this.ano = ano;
        }
    }

    private int obterMaxDiasDoMes(int mes, int ano) {
        switch (mes) {
            case 2:
                if ((ano % 4 == 0 && ano % 100 != 0) || (ano % 400 == 0)) {
                    return 29;
                }
                return 28;
            case 4: case 6: case 9: case 11:
                return 30;
            default:
                return 31;
        }
    }

    @Override
    public String toString() {
        return String.format("%02d/%02d/%04d", dia, mes, ano);
    }
}
