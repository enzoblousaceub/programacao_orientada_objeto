public class Main {
    public static void main(String[] args) {
        // Criando um cliente
        Cliente cliente = new Cliente(
            "Enzo Silva",
            "123.456.789-00",
            "Rua das Flores, 123",
            "Jardim",
            "Brasília",
            "DF",
            "70000-000",
            "(61) 99999-9999"
        );

        // Criando um vendedor
        Vendedor vendedor = new Vendedor("Lucas Souza", "A001");

        // Criando um pedido
        Pedido pedido = new Pedido("0001", "27/04/2025 18:55", vendedor, cliente);

        // Criando itens do pedido
        ItemPedido item1 = new ItemPedido("101", "Notebook", 1, 3500.00);
        ItemPedido item2 = new ItemPedido("102", "Mouse", 2, 50.00);

        // Adicionando itens ao pedido
        pedido.adicionarItem(item1);
        pedido.adicionarItem(item2);

        // Calculando o total do pedido
        System.out.println("Total do pedido: R$ " + pedido.calcularTotal());

        // Aplicando desconto nos itens
        pedido.aplicarDesconto(10.0); // Aplicando 10% de desconto
        System.out.println("Total do pedido após desconto: R$ " + pedido.calcularTotal());

        // Alterando o status do pedido
        pedido.atualizarStatus("Enviado");
        System.out.println("Status do pedido: " + pedido.getStatus());

        // Listando itens do pedido
        System.out.println("\nItens do pedido:");
        for (ItemPedido item : pedido.getItens()) {
            System.out.println(
                "Código: " + item.getCodigo() +
                ", Descrição: " + item.getDescricao() +
                ", Quantidade: " + item.getQuantidade() +
                ", Preço Unitário: R$ " + item.getPrecoUnitario() +
                ", Total: R$ " + item.calcularTotal()
            );
        }

        // Removendo um item do pedido
        pedido.removerItem("102"); // Removendo o mouse
        System.out.println("\nItens após remoção:");
        for (ItemPedido item : pedido.getItens()) {
            System.out.println(
                "Código: " + item.getCodigo() +
                ", Descrição: " + item.getDescricao() +
                ", Quantidade: " + item.getQuantidade() +
                ", Preço Unitário: R$ " + item.getPrecoUnitario() +
                ", Total: R$ " + item.calcularTotal()
            );
        }
    }
}
