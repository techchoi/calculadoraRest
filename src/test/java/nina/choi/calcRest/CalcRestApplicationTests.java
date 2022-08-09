package nina.choi.calcRest;

import nina.choi.calcRest.service.OperacoesMatematicas;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class CalcRestApplicationTests {

	@Autowired
	OperacoesMatematicas operacoesMatematicas;

	@Test
	void contextLoads() {
			int valor = operacoesMatematicas.calcularOperacao("MULTIPLICACAO", 2, 2);
			System.out.println(valor);
	}

}
