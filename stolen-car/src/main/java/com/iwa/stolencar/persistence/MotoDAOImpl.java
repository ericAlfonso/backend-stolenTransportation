package com.iwa.stolencar.persistence;

import java.util.List;

import org.hibernate.criterion.Restrictions;
import org.springframework.stereotype.Repository;

import com.iwa.stolencar.persistence.entities.Moto;

@Repository
@SuppressWarnings("unchecked")
public class MotoDAOImpl extends AbstractDAO<Moto> implements MotoDAO{
	
	@Override
	public List<Moto> getTopMotorcycles() {
		return (List<Moto>) getSession().createCriteria(Moto.class ,"moto")
				.add(Restrictions.between("moto.id", 0, 6)).list();
	}
}
