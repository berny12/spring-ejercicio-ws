/**
 * 
 */
package com.synergyj.concepto.spring.service.server.impl;

import org.slf4j.LoggerFactory;
import org.slf4j.Logger;
import org.springframework.stereotype.Service;

import com.synergyj.concepto.spring.service.server.RecepcionNotificacionesService;

/**
 * @author edgar
 *
 */
@Service("RecepcionNotificacionesService")
public class RecepcionNotificacionesServiceImpl implements
		RecepcionNotificacionesService {

	public static Logger logger = LoggerFactory.getLogger(RecepcionNotificacionesServiceImpl.class);
	
	/* (non-Javadoc)
	 * @see com.synergyj.concepto.spring.service.server.RecepcionNotificacionesService#recibeNotificacion(java.lang.String, int, int)
	 */
	@Override
	public String recibeNotificacion(String notificacion, String idModulo,
			int idTipoNotificacion) {
		
		
		logger.debug("Recibiendo los siguietnes datos  {} {} {}",
				    new Object[]{notificacion,idModulo,idTipoNotificacion});
		
		return "Se proceso corectamente";
	}

}
