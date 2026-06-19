import java.util.Scanner;

public class Cadastro {
    public static void main (String [] args) {
        Scanner scanner= new Scanner(System.in);

        while(true) {
            try {
                System.out.println("Digite o seu nome completo: ");
                String nomeCompleto = scanner.nextLine().trim();

                if (nomeCompleto.isEmpty()) {
                    throw new IllegalArgumentException("[ERRO] O nome não pode estar vazio");
                }
        
                System.out.println("Digite o DDD (2 dígitos): ");
                String dddInput = scanner.nextLine().trim();
                if (dddInput==null || !dddInput.matches("\\d{2}")) {
                    throw new IllegalArgumentException ("[ERRO] O DDD deve ser um número e não pode estar vazio! ");
                }

                System.out.println("Digite o número do telefone (8 ou 9 digitos): ");
                String numeroInput = scanner.nextLine().trim();
                if (numeroInput==null|| !numeroInput.matches("\\d{8,9}")) {
                    throw new IllegalArgumentException ("[ERRO] O número de telefone não pode ser vazio e deve conter 8 ou 9 dígitos");
                }
                break;
            } catch (IllegalArgumentException e){
                System.out.println("[ERRO]: "+e.getMessage()+"\nTente Novamente");

            } 
        } scanner.close();
    }
}