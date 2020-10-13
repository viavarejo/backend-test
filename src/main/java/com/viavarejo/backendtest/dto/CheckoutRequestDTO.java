package com.viavarejo.backendtest.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class CheckoutRequestDTO {
	
	private ProdutoDTO produto;
	private CondicaoPagamentoDTO condicaoPagamento;

}
