package nina.choi.calcRest.controller;

import nina.choi.calcRest.model.CalculoModel;
import nina.choi.calcRest.model.Resultado;
import nina.choi.calcRest.service.OperacoesMatematicas;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin(origins = "*", maxAge = 3600)
@RequestMapping("/v1/calcular")
public class OperacaoMatematicaController {

    @Autowired
    private OperacoesMatematicas operacoes;

    @PostMapping
    public Resultado calculo(@RequestBody CalculoModel calculoModel){
        return operacoes.calcularOperacao(calculoModel.getOperacao().toUpperCase(), calculoModel.getNumeroUm(), calculoModel.getNumeroDois());
    }
}
