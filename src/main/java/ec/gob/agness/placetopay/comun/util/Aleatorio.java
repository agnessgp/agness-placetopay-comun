/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ec.gob.agness.placetopay.comun.util;

import java.math.BigInteger;
import java.security.SecureRandom;

/**
 * Descripción de la Clase
 * @Autor: Patricio Pilco
 * @Fecha: 04/10/2018
 */
public final class Aleatorio {
	public static String aleatorioCadena() {
		return new BigInteger(130, new SecureRandom()).toString();
	}
}
