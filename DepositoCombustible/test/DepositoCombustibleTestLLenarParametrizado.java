import static org.junit.Assert.*;
import java.util.*;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

@RunWith(Parameterized.class)

public class DepositoCombustibleTestLLenarParametrizado {
	double repostar,estadoDeposito;
	
	//constuctor
	public DepositoCombustibleTestLLenarParametrizado(double repostar, double estadoDeposito) {
		this.repostar=repostar;
		this.estadoDeposito=estadoDeposito;
	}
	@Parameters 
	public static Collection<Object[]> consumos() {
		return Arrays.asList(new Object[][] {
			{20.0,30.0},{60.0,50.0},{5.0,15.0},{-10.0,10.0}
		});
	}
	
	@Test
	public void testConsumir() {
		DepositoCombustible tank = new DepositoCombustible (50.0,10.0);
		tank.fill(repostar);
		assertEquals(estadoDeposito,tank.getDepositoNivel(),0.0);
	}

}
