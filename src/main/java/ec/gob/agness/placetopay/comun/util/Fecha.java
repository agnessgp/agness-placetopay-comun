/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ec.gob.agness.placetopay.comun.util;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

/**
 * Descripción de la Clase
 * @Autor: Patricio Pilco
 * @Fecha: 04/10/2018
 */
public final class Fecha {

    	public static Date aniadirMinutosFecha(int minutes, Date beforeTime) {
		final long ONE_MINUTE_IN_MILLIS = 60000;// millisecs
		long curTimeInMs = beforeTime.getTime();
		Date afterAddingMins = new Date(curTimeInMs + (minutes * ONE_MINUTE_IN_MILLIS));
		return afterAddingMins;
	}
	
	public static String obtenerFechaActualFormato0500() {
        	return (new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss'-05:00'", Locale.getDefault())).format(new Date());
	}
        
        /**
	 * <b>
	 * Obtener fecha de expiración de autorización token con minutos añadidos.
	 * </b>
	 * <p>[Author: Patricio Pilco, Date: 4 oct. 2018]</p>
	 *
	 * @param minutos
	 * @return fecha de expiración aumentado minutos.
	 */
        public static String obtenerFechaExpiracion(int minutos) {
		  return (new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss'-05:00'", Locale.getDefault()))
				.format(aniadirMinutosFecha(minutos, new Date()));
	}
}
