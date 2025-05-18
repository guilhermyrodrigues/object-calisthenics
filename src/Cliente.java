class Cliente {
    private final String nome;

    public Cliente(String nome) {
        if (nome == null || nome.isEmpty()) {
            throw new IllegalArgumentException("Cliente inválido.");
        }
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }
}