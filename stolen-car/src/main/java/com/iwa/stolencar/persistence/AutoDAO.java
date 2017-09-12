package com.iwa.stolencar.persistence;

import java.util.List;

import com.iwa.stolencar.persistence.entities.Auto;

public interface AutoDAO extends InterfaceDAO<Auto>{

	List<Auto> getTopCars();
}
