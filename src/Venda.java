class Venda {
    private final Cliente cliente;
    private final DetalhesVenda detalhes;

    public Venda(Cliente cliente, DetalhesVenda detalhes) {
        this.cliente = cliente;
        this.detalhes = detalhes;
    }

    public void confirmarVenda(Notificacao notificacao) {
        detalhes.confirmar();
        notificacao.enviar("Venda confirmada para " + cliente.getNome());
    }

    public String gerarRelatorio() {
        return new RelatorioVenda(cliente, detalhes).gerar();
    }
}
