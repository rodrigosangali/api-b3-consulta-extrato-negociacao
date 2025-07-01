package sangali.com.api_b3_consulta_extrato_negociacao.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import sangali.com.api_b3_consulta_extrato_negociacao.entity.ExtratoNegociacao;
import sangali.com.api_b3_consulta_extrato_negociacao.service.ExtratoNegociacaoService;


import java.util.List;

@RestController
@RequestMapping("extrato")
public class Extrato {

    @Autowired
    ExtratoNegociacaoService extratoNegociacaoService;

    @GetMapping(value = "/negociacao")
    public List<ExtratoNegociacao> consultarExtratoNegociacao() {
        return extratoNegociacaoService.consultaPorProduto();

    }





}
