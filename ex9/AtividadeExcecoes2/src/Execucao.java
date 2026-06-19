public class Execucao {

    private static void testarCriacaoData(int dia, int mes, int ano) {
        try {
            Data d = new Data(dia, mes, ano);
            System.out.println("SUCESSO ao criar data: " + d);
        } catch (DataException e) {
            System.out.println("ERRO: " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        System.out.println("=== TESTANDO DATAS VÁLIDAS ===");
        testarCriacaoData(15, 6, 2026);  // Data comum com mês de 30 dias
        testarCriacaoData(31, 12, 2025); // Limite de mês com 31 dias
        testarCriacaoData(29, 2, 2024);  // Fevereiro em ano bissexto válido

        System.out.println("\n=== TESTANDO EXCEÇÃO: ANO INVÁLIDO ===");
        testarCriacaoData(10, 5, 0);    // Erro: ano menor que 1

        System.out.println("\n=== TESTANDO EXCEÇÃO: MÊS INVÁLIDO ===");
        testarCriacaoData(10, 13, 2026); // Erro: mês 13 não existe
        testarCriacaoData(10, 0, 2026);  // Erro: mês 0 não existe

        System.out.println("\n=== TESTANDO EXCEÇÃO: DIA INVÁLIDO ===");
        testarCriacaoData(32, 1, 2026);  // Erro: Janeiro só vai até 31
        testarCriacaoData(31, 4, 2026);  // Erro: Abril só vai até 30
        testarCriacaoData(0, 8, 2026);   // Erro: Dia 0 não existe

        System.out.println("\n=== TESTANDO EXCEÇÃO: FEVEREIRO (ANO NÃO-BISSEXTO) ===");
        testarCriacaoData(29, 2, 2026);  // Erro: 2026 não é bissexto (máximo 28)
    }
}
