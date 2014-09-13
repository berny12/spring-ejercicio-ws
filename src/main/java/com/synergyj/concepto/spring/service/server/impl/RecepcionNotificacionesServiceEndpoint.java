/**
 * 
 */
package com.synergyj.concepto.spring.service.server.impl;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;

import com.synergyj.concepto.spring.entidades.jaxb.NotificacionXMLRequest;
import com.synergyj.concepto.spring.entidades.jaxb.RespuestaXMLResponse;
import com.synergyj.concepto.spring.service.server.RecepcionNotificacionesService;

/**
 * @author edgar
 *
 */

/*
 * para que sea tomaada como endpoint en el mapeo
 */
@Endpoint
public class RecepcionNotificacionesServiceEndpoint {

	 Logger logger = LoggerFactory.getLogger(RecepcionNotificacionesServiceEndpoint.class);
	 
	 @Autowired
	 RecepcionNotificacionesService recepcionNotificacionesService;
	 @PayloadRoot(namespace="http://www.synergyj.com/concepto/webservices/recepcionNotificaciones/",
			 localPart="notificacionXMLRequest")
	 @ResponsePayload
	 public RespuestaXMLResponse recibeNotificacion (@RequestPayload NotificacionXMLRequest request){
		 
		 logger.debug("recibiendo notificaion del cliente");
		 String respuestaString = recepcionNotificacionesService.recibeNotificacion(request.getNotificacion(), request.getIdModulo(), request.getIdTipoNotificacion());
		 
		 RespuestaXMLResponse respuesta = new RespuestaXMLResponse();
		 respuesta.setRespuesta(respuestaString);
		 return respuesta;
	 }
	
}
