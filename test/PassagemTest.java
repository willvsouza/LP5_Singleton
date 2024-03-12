import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PassagemTest {

    @Test
    public void deveRetornarValorPassagem() {
        Passagem.getInstance().setValorPassagem(420.5);
        assertEquals(420.5, Passagem.getInstance().getValorPassagem());
    }

}









