class DetalhesVenda {
    private final ValorTotal valor;
    private final ItensVenda itens;
    private final Confirmacao confirmacao;

    public DetalhesVenda(ValorTotal valor) {
        this.valor = valor;
        this.itens = new ItensVenda();
        this.confirmacao = new Confirmacao();
    }

    public void adicionarItem(ItemVenda item) {
        itens.adicionar(item);
    }

    public double calcularDesconto(Cliente cliente) {
        if (valor.getValor() > 1000 && cliente != null) {
            double desconto = valor.getValor() * 0.1;
            if (itens.quantidade() > 5) {
                desconto += valor.getValor() * 0.05;
            }
            return desconto;
        }
        if (valor.getValor() > 1000) {
            return valor.getValor() * 0.05;
        }
        return 0;
    }

    public ValorTotal getValorTotal() {
        return valor;
    }

    public ItensVenda getItens() {
        return itens;
    }

    public void confirmar() {
        confirmacao.confirmar();
    }

    public boolean estaConfirmada() {
        return confirmacao.estaConfirmada();
    }
}
