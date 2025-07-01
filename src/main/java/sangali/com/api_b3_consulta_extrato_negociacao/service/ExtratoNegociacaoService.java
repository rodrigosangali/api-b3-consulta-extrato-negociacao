package sangali.com.api_b3_consulta_extrato_negociacao.service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import sangali.com.api_b3_consulta_extrato_negociacao.entity.ExtratoNegociacao;
import sangali.com.api_b3_consulta_extrato_negociacao.repository.ExtratoNegociacaoRepository;


import java.util.*;


@Service
public class ExtratoNegociacaoService {

    @Autowired
    private ExtratoNegociacaoRepository extratoNegociacaoRepository;


    public List<ExtratoNegociacao> consultaPorProduto(){
        // Busca os produtos

        List<ExtratoNegociacao> extratoNegociacaos = extratoNegociacaoRepository.findByCodProduto("ABEV3F");

        return extratoNegociacaos;
    }


}
