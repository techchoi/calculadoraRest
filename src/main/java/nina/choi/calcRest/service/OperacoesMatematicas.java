package nina.choi.calcRest.service;

import nina.choi.calcRest.enuns.OperacoesEnum;
import nina.choi.calcRest.model.Resultado;
import org.springframework.stereotype.Service;

import java.util.Arrays;

@Service
public class OperacoesMatematicas {

    int calculo(int numero1, int numero2){
        return 0;
    }

    public Resultado calcularOperacao(String operacao, int numero1, int numero2){
        OperacoesMatematicas operacoesMatematicas =  returnOperation(operacao);
        return new Resultado(operacoesMatematicas.calculo(numero1, numero2));
    }

    OperacoesMatematicas returnOperation(String operacao){
        OperacoesEnum op = (OperacoesEnum) Arrays.stream(OperacoesEnum.values()).
                filter(p -> p.name().equals(operacao)).
                findFirst().get();
        return  OperacoesEnum.validaOperacao(op.name());
    }
}
