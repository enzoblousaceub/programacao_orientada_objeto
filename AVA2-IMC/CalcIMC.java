public class CalcIMC {
    
    public static double CalcIMC(Pessoa pessoa) {
        double peso = pessoa.getPeso();
        double altura = pessoa.getAltura();
        
        return peso / (altura * altura); 
    }

    public static void exibirIMC(Pessoa pessoa) {
        double imc = calcularIMC(pessoa);
        System.out.println(pessoa.getNome() + " tem um IMC de: " + imc);
    }

    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa("Carlos", 80.0, 1.75);

        exibirIMC(pessoa);
    }
}
