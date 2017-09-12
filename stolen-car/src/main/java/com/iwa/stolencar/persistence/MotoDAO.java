package com.iwa.stolencar.persistence;

import java.util.List;

import com.iwa.stolencar.persistence.entities.Moto;

public interface MotoDAO extends InterfaceDAO<Moto>{
	
	List<Moto> getTopMotorcycles();
}
