public class Pessoa {
    private String nome;
    private Double peso, altura;

    public Pessoa(String nome, Double peso, Double altura) {
        this.nome = nome;
        this.peso = peso;
        this.altura = altura;
    }

    // Getters
    public String getNome() {
        return nome;
    }

    public Double getPeso() {
        return peso;
    }

    public Double getAltura() {
        return altura;
    }

    // Setter
    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setPeso(Double peso) {
        this.peso = peso;
    }

    public void setAltura(Double altura) {
        this.altura = altura;
    }
}
