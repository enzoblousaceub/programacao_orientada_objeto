public class Cliente extends Pessoa {
    // Atributos específicos do Cliente
    private double limiteCredito;

    // Construtor
    public Cliente(String nome, String cpf, String endereco, double limiteCredito);

    // Getters
    public double getLimiteCredito();

    // Setters
    public void setLimiteCredito(double limiteCredito);

    // Método para exibir os dados (sobrescreve o método de Pessoa)
    @Override
    public void exibirDados();
}
