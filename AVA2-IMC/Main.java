public class Main {
    public static void main(String[] args) {
        // Criando um objeto Pessoa
        Pessoa pessoa1 = new Pessoa("Emzo", 75.0, 1.75);
        
        // Exibindo o IMC da pessoa1
        System.out.println("Cálculo do IMC para a primeira pessoa:");
        CalcIMC.exibirIMC(pessoa1);
        
        // Alterando os dados da pessoa1
        pessoa1.setNome("Maria");
        pessoa1.setPeso(65.0);
        pessoa1.setAltura(1.68);
        
        // Exibindo o IMC da pessoa1 com dados alterados
        System.out.println("\nCálculo do IMC após alterações nos dados da pessoa:");
        CalcIMC.exibirIMC(pessoa1);
    }
}

