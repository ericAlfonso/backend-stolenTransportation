package com.iwa.stolencar.services.test;

import org.apache.log4j.Logger;
import org.hibernate.SessionFactory;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.annotation.Rollback;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.transaction.annotation.Transactional;

import com.iwa.stolencar.App;
import com.iwa.stolencar.commos.EstadisticasService;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = { App.class })
@Rollback(true)
@Transactional
public class EsdisticasServiceTest {

	private static final Logger logger = Logger.getLogger(EsdisticasServiceTest.class);
	
	@Autowired
	private SessionFactory sessionFactory;
	
	@Autowired
	private EstadisticasService estadisticasService;
	
	@Test
	public void getYearStadisticsTest() throws Exception {
		this.estadisticasService.getYearStatistics();
	}
}