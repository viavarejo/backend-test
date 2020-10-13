package com.viavarejo.backendtest.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import com.viavarejo.backendtest.dto.CheckoutRequestDTO;
import com.viavarejo.backendtest.dto.CheckoutResponseDTO;

@Service
public class CheckoutService {
	
	Double valor_produto;
	Double valor_entrada;
	Integer qntd_parcelas;
	Double valor_financiado;
	Double valor_parcela;
	Double valor_selic = 1.15/100;
	Double juros;
		
	public List<CheckoutResponseDTO> calculoPrestacoes(@RequestBody CheckoutRequestDTO request) {
				
		List<CheckoutResponseDTO> parcelas = new ArrayList<CheckoutResponseDTO>();
		
		valor_produto = request.getProduto().getValor();
		valor_entrada = request.getCondicaoPagamento().getValorEntrada();
		qntd_parcelas = request.getCondicaoPagamento().getQtdeParcelas();
		
		if(qntd_parcelas > 6) {
			juros = valor_produto * valor_selic * qntd_parcelas;
			valor_produto = valor_produto + juros;
			valor_financiado = valor_produto - valor_entrada;
			valor_parcela = valor_financiado/qntd_parcelas;
		} else {
			valor_financiado = valor_produto - valor_entrada;
			valor_parcela = valor_financiado/qntd_parcelas;
		}	
		
		for (int i = 1; i <= qntd_parcelas; i++) {
			CheckoutResponseDTO response = new CheckoutResponseDTO();
			response.setNumeroParcela(Integer.valueOf(i));
			if(qntd_parcelas > 6) {
				response.setTaxaJurosAoMes(valor_selic*100);
			} else {
				response.setTaxaJurosAoMes(0.00);
			}
			response.setValor(valor_parcela);
			parcelas.add(response);
			
		}
				
		return parcelas;
		
	}
	
}
