package com.iwa.stolencar.rest.vo;

public class DiaVO {

	private Integer id;
	private String name;
	private Integer carAmount;
	private Integer motorcycleAmount;
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Integer getCarAmount() {
		return carAmount;
	}
	public void setCarAmount(Integer carAmount) {
		this.carAmount = carAmount;
	}
	public Integer getMotorcycleAmount() {
		return motorcycleAmount;
	}
	public void setMotorcycleAmount(Integer motorcycleAmount) {
		this.motorcycleAmount = motorcycleAmount;
	}
}
