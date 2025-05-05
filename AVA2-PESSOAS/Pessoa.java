public class Pessoa {
    // Atributos da Classe Pessoa
    private String nomePessoa;
    private double pesoPessoa;
    private double alturaPessoa;
    private double imcPessoa;

    // Construtor da Classe Pessoa
    public Pessoa(String nomePessoa, double pesoPessoa, double alturaPessoa) {
        this.nomePessoa = nomePessoa;
        this.pesoPessoa = pesoPessoa;
        this.alturaPessoa = alturaPessoa;
        this.imcPessoa = calcularImcPessoa();
    }

    // Método para cálculo do IMC
    private double calcularImcPessoa() {
        return this.pesoPessoa / (Math.pow(this.alturaPessoa, 2));
    }

    // Método para mostrar os dados da Pessoa e o resultado do IMC
    public void mostrarImcPessoa() {
        System.out.println("Nome: " + this.nomePessoa);
        System.out.println("Peso: " + this.pesoPessoa + " kg");
        System.out.println("Altura: " + this.alturaPessoa + " m");
        System.out.println("IMC: " + String.format("%.2f", this.imcPessoa));
    }
}

// Classe principal para testar o código
class Main {
    public static void main(String[] args) {
        Pessoa pessoa1 = new Pessoa("João", 70, 1.75);
        pessoa1.mostrarImcPessoa();
    }
}
