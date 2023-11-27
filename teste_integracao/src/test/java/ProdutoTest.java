import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.example.Produto;

public class ProdutoTest {
    @Test
    public void testeVerificaMarca() {
        Produto p = new Produto();
        assertEquals("A marca é nula", p.verificaMarca(null));
    }
    @Test
    public void testeVerificaPreco() {
        Produto p = new Produto();
        assertEquals("O preço é negativo", p.verificaPreco(-1));
    }
    @Test
    public void testeVerificaNome(){
        Produto p = new Produto();
        p.setNome("coca-cola");
        p.setMarca("coca-cola");
        assertEquals("A marca é igual ao nome do produto", p.verificaNome(p.getNome(), p.getMarca()));
    }
    @Test
    public void testeVerificaPrecoPopular(){
        Produto p = new Produto();
        p.setPreco(20);
        assertEquals("O preço é popular", p.verificaPrecoPopular(p.getPreco()));
    }
    @Test
    public void testeVerficaId(){
        Produto p = new Produto();
        assertEquals("O id é nulo", p.verificaId(0));
    }
}
