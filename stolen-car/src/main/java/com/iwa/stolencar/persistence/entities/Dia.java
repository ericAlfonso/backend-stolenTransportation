package com.iwa.stolencar.persistence.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "DIA")
public class Dia {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "ID")
	private Integer id;
	@Column(name = "NAME", nullable = false)
	private String name;
	@Column(name = "MOTORCYCLE_AMOUNT")
	private Integer motorcycleAmount;
	@Column(name = "CAR_AMOUNT")
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
