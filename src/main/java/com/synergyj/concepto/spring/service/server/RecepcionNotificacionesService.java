package com.synergyj.concepto.spring.service.server;

public interface RecepcionNotificacionesService {

	
		/*
		 * metodo quye recbe la notificacion
		 * 
		 */
	
	 String recibeNotificacion(String notificacion, String idModulo, int idTipoNotificacion);
}
