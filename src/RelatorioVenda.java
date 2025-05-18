class RelatorioVenda {
    private final Cliente cliente;
    private final DetalhesVenda detalhes;

    public RelatorioVenda(Cliente cliente, DetalhesVenda detalhes) {
        this.cliente = cliente;
        this.detalhes = detalhes;
    }

    public String gerar() {
        StringBuilder sb = new StringBuilder();
        sb.append("Venda para ").append(cliente.getNome()).append("\n");
        for (ItemVenda item : detalhes.getItens().listar()) {
            sb.append("Item: ").append(item.getDescricao()).append("\n");
        }
        sb.append("Total: ").append(detalhes.getValorTotal().getValor()).append("\n");
        sb.append("Desconto: ").append(detalhes.calcularDesconto(cliente)).append("\n");
        return sb.toString();
    }
}