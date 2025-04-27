import java.util.ArrayList;
import java.util.List;

public class Pedido {
    private String numero;
    private String dataHora;
    private Vendedor vendedor;
    private Cliente cliente;
    private String status;
    private List<ItemPedido> itens;

    public Pedido(String numero, String dataHora, Vendedor vendedor, Cliente cliente) {
        this.numero = numero;
        this.dataHora = dataHora;
        this.vendedor = vendedor;
        this.cliente = cliente;
        this.status = "Processamento";
        this.itens = new ArrayList<>();
    }

    public void adicionarItem(ItemPedido item) {
        itens.add(item);
    }

    public void removerItem(String codigoItem) {
        itens.removeIf(item -> item.getCodigo().equals(codigoItem));
    }

    public double calcularTotal() {
        double total = 0.0;
        for (ItemPedido item : itens) {
            total += item.calcularTotal();
        }
        return total;
    }

    public void atualizarStatus(String novoStatus) {
        if (novoStatus.equals("Processamento") || novoStatus.equals("Enviado") ||
            novoStatus.equals("Entregue") || novoStatus.equals("Cancelado")) {
            this.status = novoStatus;
        } else {
            System.out.println("Status inválido!");
        }
    }

    public void aplicarDesconto(double percentual) {
        for (ItemPedido item : itens) {
            item.aplicarDesconto(percentual);
        }
    }

    public String getNumero() {
        return numero;
    }

    public String getDataHora() {
        return dataHora;
    }

    public Vendedor getVendedor() {
        return vendedor;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public String getStatus() {
        return status;
    }

    public List<ItemPedido> getItens() {
        return itens;
    }
}
