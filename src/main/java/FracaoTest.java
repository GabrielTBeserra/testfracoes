import org.junit.Test;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;

public class FracaoTest {
    
    @Test
    public void testFracao_1(){
        new Fracao(1,2);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testFracao_2(){
        new Fracao(1,0);
    }

    @Test
    public void testMultiplicar(){
        Fracao f1 = new Fracao(1,2);
        Fracao f2 = new Fracao(3,4);
        Fracao resultado = f1.multiplicar(f2);

        assertEquals(3, resultado.getNumerador());
        assertEquals(8, resultado.getDenominador());
        assertEquals(new Fracao(3,8), resultado);
    }

    @Test
    public void testSoma(){
        Fracao f1 = new Fracao(2,3);
        Fracao f2 = new Fracao(6,7);

        Fracao r = f1.soma(f2);
        assertEquals(32, r.getNumerador());
        assertEquals(21, r.getDenominador());
    }

    @Test
    public void testSubtracao(){
        Fracao f1 = new Fracao(5,2);
        Fracao f2 = new Fracao(7,8);

        Fracao r = f1.subtracao(f2);
        assertEquals(13, r.getNumerador());
        assertEquals(8, r.getDenominador());
    }

    @Test
    public void testDividir(){
        Fracao f1 = new Fracao(10,2);
        Fracao f2 = new Fracao(5,8);

        Fracao r = f1.divisao(f2);
        assertEquals(80, r.getNumerador());
        assertEquals(10, r.getDenominador());
    }

    @Test
    public void testEquals(){
        Fracao f1 = new Fracao(1,2);
        Fracao f2 = new Fracao(1,2);
        Fracao f3 = new Fracao(3,5);

        assertEquals(f1, f1);
        assertEquals(f1, f2);
        assertFalse(f1.equals(f3));
    }
}