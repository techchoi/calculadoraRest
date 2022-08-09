package nina.choi.calcRest.service;

import nina.choi.calcRest.enuns.OperacoesEnum;
import org.springframework.stereotype.Service;

import java.util.EnumSet;
import java.util.Optional;

@Service
public class OperacoesMatematicas {



    int calculo(int numero1, int numero2){
        return 0;
    }

    public int calcularOperacao(String operacao, int numero1, int numero2){
//        Optional<OperacoesEnum> optional = EnumSet.allOf(OperacoesEnum.class)
//                .stream()
//                .filter(e -> e.equals(operacao))
//                .findFirst();

        OperacoesMatematicas operacoesMatematicas =  returnOperation(operacao);
        return operacoesMatematicas.calculo(numero1, numero2);
    }

    OperacoesMatematicas returnOperation(String operacao){
        for(OperacoesEnum op : OperacoesEnum.values()){
            if(op.name().equals(operacao)){
                return op.validaOperacao(operacao);
            }
        }
        return new OperacoesMatematicas();
    }
}
