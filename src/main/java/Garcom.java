public class Garcom implements Visitor{

    public String entregar(AlimentoEntrega alimento){
        return alimento.aceitar(this);
    }

    @Override
    public String entregarComida(Comida comida) {
        return "Comida{" +
                "nome=" + comida.getNome() +
                ", categoria=" + comida.getCategoria() +
                '}';
    }

    @Override
    public String entregarBebida(Bebida bebida) {
        return "Comida{" +
                "nome=" + bebida.getNome() +
                ", categoria=" + bebida.getCategoria() +
                '}';
    }
}
