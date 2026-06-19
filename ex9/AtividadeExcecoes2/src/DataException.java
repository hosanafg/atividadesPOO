public class DataException extends Exception {
    private final int diaInvalido;
    private final int mesInvalido;
    private final int anoInvalido;

    public DataException(int dia, int mes, int ano, String motivo) {
        super("Data Inválida: " + motivo + " -> Tentativa: " + dia + "/" + mes + "/" + ano);
        this.diaInvalido = dia;
        this.mesInvalido = mes;
        this.anoInvalido = ano;
    }

    public int getDiaInvalido() { 
        return diaInvalido; 
    } public int getMesInvalido() { 
        return mesInvalido; 
    } public int getAnolinvalido() { 
        return anoInvalido; 
    }
}
