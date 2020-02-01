package com.kharoud;

public class Calculator {
	CalculateService service;
	
	public Calculator(CalculateService service) {
		this.service = service;
	}
	public int perform(int i, int j) {
		//return service.add(i, j) * 2;
		return (i+j)*2;
	}

}
