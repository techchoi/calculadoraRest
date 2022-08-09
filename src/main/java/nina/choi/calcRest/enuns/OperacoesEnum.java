package nina.choi.calcRest.enuns;

import nina.choi.calcRest.service.*;

public enum OperacoesEnum {
    SOMA,SUBTRACAO,DIVISAO,MULTIPLICACAO,ZERO;

    OperacoesEnum() {

    }
    public static OperacoesMatematicas validaOperacao(String operacao){
        if(SOMA.name().equals(operacao)){
            return new Soma();
        }
        if(SUBTRACAO.name().equals(operacao)){
            return new Subtracao();
        }
        if(DIVISAO.name().equals(operacao)){
            return new Divisao();
        }
        if(MULTIPLICACAO.name().equals(operacao)){
            return new Multipliacao();
        }else{
            return new OperacoesMatematicas();
        }

    }
}
