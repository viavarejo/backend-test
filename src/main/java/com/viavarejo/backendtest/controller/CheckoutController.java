package com.viavarejo.backendtest.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.viavarejo.backendtest.dto.CheckoutRequestDTO;
import com.viavarejo.backendtest.dto.CheckoutResponseDTO;
import com.viavarejo.backendtest.service.CheckoutService;

@RestController
@RequestMapping("/")
public class CheckoutController {
	
	@Autowired
	private CheckoutService checkoutService;

	@RequestMapping(value="/checkout", method= RequestMethod.POST, produces="application/json", consumes="application/json")
	public List<CheckoutResponseDTO> Checkout(@RequestBody CheckoutRequestDTO requestDTO){		
		
		return checkoutService.calculoPrestacoes(requestDTO);
	}
}
