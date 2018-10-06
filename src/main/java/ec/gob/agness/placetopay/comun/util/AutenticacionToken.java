/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.gob.agness.placetopay.comun.util;

import ec.gob.agness.placetopay.comun.clases.AAutenticacion;
import ec.gob.agness.placetopay.comun.clases.Credenciales;
import java.security.NoSuchAlgorithmException;

/**
 * Descripción de la Clase
 *
 * @Autor: Patricio Pilco
 * @Fecha: 04/10/2018
 */
public final class AutenticacionToken extends AAutenticacion {

    protected Credenciales credenciales;
    protected String aleatorioNonce;
    protected String cadenaTrankey;

    public AutenticacionToken(Credenciales credenciales) throws NoSuchAlgorithmException {
        this.credenciales = credenciales;
        this.setSeed(obtenerSeed());
        this.aleatorioNonce = obtenerAleatorioNonce();
        this.cadenaTrankey = obtenerCadenaTrankey();
        this.setLogin(obtenerLogin(credenciales));
        this.setNonce(obtenerNonce());
        this.setTrankey(obtenerTrankey());
    }

    private String obtenerLogin(Credenciales credendiales) {
        return credendiales.getLogin();
    }

    private String obtenerNonce() {
        return Criptografia.base64(this.aleatorioNonce.getBytes());
    }

    private String obtenerTrankey() throws NoSuchAlgorithmException {
        return Criptografia.base64(Criptografia.sha1(this.cadenaTrankey));
    }

    private String obtenerSeed() {
        return Fecha.obtenerFechaActualFormato0500();
    }

    private String obtenerAleatorioNonce() {
        return Aleatorio.aleatorioCadena();
    }

    private String obtenerCadenaTrankey() {
        return aleatorioNonce.concat(getSeed()).concat(credenciales.getSecretKey());
    }

}
