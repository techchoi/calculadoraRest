package nina.choi.calcRest;

import nina.choi.calcRest.model.Resultado;
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
			Resultado resultado = operacoesMatematicas.calcularOperacao("SUBTRACAO", 3, 2);
			System.out.println(resultado.getValorResultado());
	}

}
