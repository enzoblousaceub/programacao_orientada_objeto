public class ItemPedido {
    private String codigo;
    private String descricao;
    private int quantidade;
    private double precoUnitario;

    public ItemPedido(String codigo, String descricao, int quantidade, double precoUnitario) {
        this.codigo = codigo;
        this.descricao = descricao;
        this.quantidade = quantidade;
        this.precoUnitario = precoUnitario;
    }

    public double calcularTotal() {
        return quantidade * precoUnitario;
    }

    public String getCodigo() {
        return codigo;
    }

    public String getDescricao() {
        return descricao;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public double getPrecoUnitario() {
        return precoUnitario;
    }

    public void aplicarDesconto(double percentual) {
        this.precoUnitario -= this.precoUnitario * (percentual / 100.0);
    }
}
