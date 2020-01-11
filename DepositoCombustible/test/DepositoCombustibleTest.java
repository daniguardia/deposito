import static org.junit.Assert.*;

import org.junit.Test;

public class DepositoCombustibleTest {
	
	DepositoCombustible tank = new DepositoCombustible (50.0,0.0);

	@Test
	public void testGetDepositoNivel() {
		assertEquals(0,tank.getDepositoNivel(),0);
	}

	@Test
	public void testGetDepositoMax() {
		assertEquals(50.0,tank.getDepositoMax(),0);
	}

	@Test
	public void testEstaVacio() {
		assertEquals(0,tank.getDepositoNivel(),0);
	}

	@Test
	public void testEstaLleno() {
		tank.fill(25.0);
		assertFalse(tank.estaLleno());
	}

}
