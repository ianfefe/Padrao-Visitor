import org.junit.Assert;
import org.junit.Test;

public class VisitorTest {

    @Test
    public void deveEntregarComida() {
        Comida comida = new Comida("Brigadeiro", "Doce");

        Garcom visitor = new Garcom();
        Assert.assertEquals("Comida{nome=Brigadeiro, categoria=Doce}", visitor.entregar(comida));
    }

    @Test
    public void deveEntregarBebida() {
        Bebida bebida = new Bebida("Sprite", "Refrigerante");

        Garcom visitor = new Garcom();
        Assert.assertEquals("Comida{nome=Sprite, categoria=Refrigerante}", visitor.entregar(bebida));
    }

}