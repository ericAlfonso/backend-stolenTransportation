package com.iwa.stolencar.commos.dto;

public class AñoDTO {

	private Integer id;
	private String value;
	private Integer motorcycleAmount;
	private Integer carAmount;
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getValue() {
		return value;
	}
	public void setValue(String value) {
		this.value = value;
	}
	public Integer getMotorcycleAmount() {
		return motorcycleAmount;
	}
	public void setMotorcycleAmount(Integer motorcycleAmount) {
		this.motorcycleAmount = motorcycleAmount;
	}
	public Integer getCarAmount() {
		return carAmount;
	}
	public void setCarAmount(Integer carAmount) {
		this.carAmount = carAmount;
	}
}
