class ValorTotal {
    private final double valor;

    public ValorTotal(double valor) {
        if (valor <= 0) {
            throw new IllegalArgumentException("Valor inválido.");
        }
        this.valor = valor;
    }

    public double getValor() {
        return valor;
    }
}