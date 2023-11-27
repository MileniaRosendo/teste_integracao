import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.example.Mercado;

public class MercadoTest {
    @Test
    public void verificaQuantidadeColaboradores(){
        Mercado m = new Mercado();
        m.setQuantColaboradores(101);
        assertEquals("A empresa é grande!", m.verificaQuantidadeColaboradores(m.getQuantColaboradores()));
    }
    @Test
    public void verificaCnpj(){
        Mercado m = new Mercado();
        m.setCnpj(11111);
        assertEquals(11111, m.getCnpj());
    }
    @Test
    public void testeVerificaNome(){
        Mercado m = new Mercado();
        m.setNome("Todo Dia");
        assertEquals("Esse mercado já existe!", m.verificaNomeExistente(m.getNome()));
    }
    @Test
    public void testVerificaEndereco(){
        Mercado m = new Mercado();
        assertEquals("O endereço da loja não é válido", m.verificaEndereco(null));
    }
    @Test
    public void testVerificaProduto(){
        Mercado m = new Mercado();
        assertEquals("O mercado não possui um produto associado.", m.verificaProduto(null));
    }
}
