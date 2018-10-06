/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ec.gob.agness.placetopay.comun.clases;

/**
 * Descripción de la Clase
 * @Autor: Patricio Pilco
 * @Fecha: 04/10/2018
 */
public class Credenciales {

    private String login;
    private String secretKey;

    public Credenciales() {
    }

    public Credenciales(String login, String secretKey) {
        this.login = login;
        this.secretKey = secretKey;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getSecretKey() {
        return secretKey;
    }

    public void setSecretKey(String secretKey) {
        this.secretKey = secretKey;
    }
 
}
