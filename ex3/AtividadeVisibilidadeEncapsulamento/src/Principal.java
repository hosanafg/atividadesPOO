import java.time.LocalDate;

/*
/Crie uma classe pública denominada Principal, 
que contém um método main. Neste método, crie 3 instâncias 
da classe Funcionario, fornecendo os atributos através dos 
métodos de acesso.
*/

public class Principal {
    public static void main(String[] args) {
        Funcionario f1 = new Funcionario ();

        System.out.println("ID: "+f1.getIdentificador());
        f1.setNome("Dwight Schrute");
        System.out.println("Nome Funcionario f1: "+f1.getNome());

        f1.setData(LocalDate.of(2002, 01, 01));
        System.out.println("Data de admissão: "+f1.getData());

        f1.setSalario(1650.45);
        System.out.println("Salário: R$"+f1.getSalario());


        //------------------------------------------------------------------------------------
        Funcionario f2= new Funcionario() ;

        System.out.println("ID: "+f2.getIdentificador());
        f2.setNome("Michael Scott");
        System.out.println("Nome Funcionario f2: "+f2.getNome());

        f2.setData(LocalDate.of(2000, 01, 05));
        System.out.println("Data de Admissão: "+f2.getData());

        f2.setSalario(3000.50);
        System.out.println("Salário: R$"+f2.getSalario());

        //------------------------------------------------------------------------------------
        Funcionario f3 = new Funcionario ();

        System.out.println("ID: "+f3.getIdentificador());
        f3.setNome("Kelly Kapoor");
        System.out.println("Nome funcionario f3:"+f3.getNome());

        f3.setData(LocalDate.of(2007, 10, 07));
        System.out.println("Data de admissão: "+ f3.getData());

        f3.setSalario(1200);
        System.out.println("Salário: R$"+f3.getSalario());
    }
}
