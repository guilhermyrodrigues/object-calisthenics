class ItemVenda {
    private final String descricao;

    public ItemVenda(String descricao) {
        if (descricao == null || descricao.isEmpty()) {
            throw new IllegalArgumentException("Item inválido.");
        }
        this.descricao = descricao;
    }

    public String getDescricao() {
        return descricao;
    }
}