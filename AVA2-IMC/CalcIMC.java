public class CalcIMC {
    
    public static double CalcIMC(Pessoa pessoa) {
        double peso = pessoa.getPeso();
        double altura = pessoa.getAltura();
        
        return peso / (altura * altura);  // Fórmula do IMC: peso / altura²
    }

    public static void exibirIMC(Pessoa pessoa) {
        double imc = calcularIMC(pessoa);
        System.out.println(pessoa.getNome() + " tem um IMC de: " + imc);
    }

    public static void main(String[] args) {
        // Criando um objeto Pessoa
        Pessoa pessoa = new Pessoa("Carlos", 80.0, 1.75);

        // Calculando e exibindo o IMC
        exibirIMC(pessoa);
    }
}
