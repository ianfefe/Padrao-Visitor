public class Comida implements AlimentoEntrega{

    private String nome;
    private String categoria;

    public String getCategoria() {
        return categoria;
    }

    public String getNome() {
        return nome;
    }

    public Comida(String nome, String categoria) {
        this.nome = nome;
        this.categoria = categoria;
    }

    @Override
    public String aceitar(Visitor visitor) {
        return visitor.entregarComida(this);
    }
}
