import static org.junit.Assert.*;
import java.util.*;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

@RunWith(Parameterized.class)

public class DepositoCombustibleTestParametrizado {
	double consumo,estadoDeposito;
	
	//constuctor
	public DepositoCombustibleTestParametrizado(double consumo, double estadoDeposito) {
		this.consumo=consumo;
		this.estadoDeposito=estadoDeposito;
	}
	@Parameters 
	public static Collection<Object[]> consumos() {
		return Arrays.asList(new Object[][] {
			{20.0,20.0},{60.0,40.0},{5.0,35.0},{-10.0,40.0}
		});
	}
	
	@Test
	public void testConsumir() {
		DepositoCombustible tank = new DepositoCombustible (50.0,40.0);
		tank.consumir(consumo);
		assertEquals(estadoDeposito,tank.getDepositoNivel(),0.0);
	}

}
