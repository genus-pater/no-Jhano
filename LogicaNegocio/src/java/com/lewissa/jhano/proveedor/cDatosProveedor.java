/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.lewissa.jhano.proveedor;

/**
 *
 * @author eborja
 */
public class cDatosProveedor {

    private String strIdProveedor;
    private String strNombreFiscal;
    private String strNombreComercial;
    private String strDireccion;
    private String strConvencional;
    private String strCelular;
    private String strCorreo;

    public void setId(String strId) {
        strIdProveedor = strId;
    }

    public void setNombreFiscal(String strNombre) {
        strNombreFiscal = strNombre;
    }

    public void setNombreComercial(String strComercial) {
        strNombreComercial = strComercial;
    }

    public void setDireccion(String strDir) {
        strDireccion = strDir;
    }

    public void setConvencional(String strNumero) {
        strConvencional = strNumero;
    }

    public void setCelular(String strNumero) {
        strCelular = strNumero;
    }

    public void setCorreo(String strEmail) {
        strCorreo = strEmail;
    }

    String getId() {
        return strIdProveedor;
    }

    String getNombreFiscal() {
        return strNombreFiscal;
    }

    String getNombreComercial() {
        return strNombreComercial;
    }

    String getDireccion() {
        return strDireccion;
    }

    String getConvencional() {
        return strConvencional;
    }

    String getCelular() {
        return strCelular;
    }

    String getCorreo() {
        return strCorreo;
    }

}
