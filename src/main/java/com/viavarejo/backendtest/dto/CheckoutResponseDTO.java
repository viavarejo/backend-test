package com.viavarejo.backendtest.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class CheckoutResponseDTO {

	private Integer numeroParcela;
	private Double valor;
	private Double taxaJurosAoMes;
}
