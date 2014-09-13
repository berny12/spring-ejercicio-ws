package com.synergyj.concepto.spring.service.server.test;

import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.ws.client.core.WebServiceTemplate;

import com.synergyj.concepto.spring.entidades.jaxb.NotificacionXMLRequest;
import com.synergyj.concepto.spring.entidades.jaxb.RespuestaXMLResponse;


@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations={"/testApplicationContext.xml"})
public class ClienteSpringSoap {

	@Autowired
	WebServiceTemplate webserviceTemplate;
	
	 Logger logger = LoggerFactory.getLogger(ClienteSpringSoap.class);
	
	@Test
	public void test() {
		Assert.assertNotNull(webserviceTemplate);
		NotificacionXMLRequest notificacion = new NotificacionXMLRequest();
		notificacion.setIdModulo("091521");
		notificacion.setIdTipoNotificacion(5);
		notificacion.setNotificacion("notificacion de baja");
		RespuestaXMLResponse respuesta = 
				(RespuestaXMLResponse) webserviceTemplate.marshalSendAndReceive(notificacion);
		Assert.assertNotNull(respuesta);
		logger.debug("la respuesta es {} {} {}",respuesta.getRespuesta());
		
	}

}
