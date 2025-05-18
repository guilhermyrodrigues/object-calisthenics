public class Main {
    public static void main(String[] args) {
        // Criando cliente e valor total
        Cliente cliente = new Cliente("João da Silva");
        ValorTotal valorTotal = new ValorTotal(1500.0);

        // Criando detalhes da venda e adicionando itens
        DetalhesVenda detalhes = new DetalhesVenda(valorTotal);
        detalhes.adicionarItem(new ItemVenda("Notebook"));
        detalhes.adicionarItem(new ItemVenda("Mouse"));
        detalhes.adicionarItem(new ItemVenda("Teclado"));
        detalhes.adicionarItem(new ItemVenda("Monitor"));
        detalhes.adicionarItem(new ItemVenda("Webcam"));
        detalhes.adicionarItem(new ItemVenda("Headset"));

        // Criando venda
        Venda venda = new Venda(cliente, detalhes);

        // Exibindo relatório antes da confirmação
        System.out.println("===== RELATÓRIO (Antes da Confirmação) =====");
        System.out.println(venda.gerarRelatorio());

        // Enviando notificação e confirmando venda
        Notificacao notificacao = new NotificacaoEmail();
        venda.confirmarVenda(notificacao);

        // Exibindo relatório novamente
        System.out.println("===== RELATÓRIO (Após Confirmação) =====");
        System.out.println(venda.gerarRelatorio());
    }
}
