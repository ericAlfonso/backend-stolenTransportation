package com.iwa.stolencar.rest.vo;

public class MesVO {

	private Integer id;
	private String name;
	private Integer motorcycleAmount;
	private Integer carAmount;
	
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
