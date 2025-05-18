import java.util.ArrayList;
import java.util.List;

class ItensVenda {
    private final List<ItemVenda> itens = new ArrayList<>();

    public void adicionar(ItemVenda item) {
        itens.add(item);
    }

    public int quantidade() {
        return itens.size();
    }

    public List<ItemVenda> listar() {
        return new ArrayList<>(itens);
    }
}