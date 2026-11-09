public class Bebida implements AlimentoEntrega{

    public String getCategoria() {
        return categoria;
    }

    public String getNome() {
        return nome;
    }

    private String nome;
    private String categoria;

    public Bebida(String nome, String categoria) {
        this.nome = nome;
        this.categoria = categoria;
    }

    @Override
    public String aceitar(Visitor visitor) {
        return visitor.entregarBebida(this);
    }
}
