/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ec.gob.agness.placetopay.comun.clases;

/**
 * Autenticación Token
 * @Autor: Patricio Pilco
 * @Fecha: 04/10/2018
 */
public abstract class AAutenticacion {
    
    private String login;
    private String seed;
    private String nonce;
    private String trankey;

    public AAutenticacion() {
    }
    
    public AAutenticacion(String login, String seed, String nonce, String trankey) {
        this.login = login;
        this.seed = seed;
        this.nonce = nonce;
        this.trankey = trankey;
    }
    
    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getSeed() {
        return seed;
    }

    public void setSeed(String seed) {
        this.seed = seed;
    }

    public String getNonce() {
        return nonce;
    }

    public void setNonce(String nonce) {
        this.nonce = nonce;
    }

    public String getTrankey() {
        return trankey;
    }

    public void setTrankey(String trankey) {
        this.trankey = trankey;
    }
    
    
}
