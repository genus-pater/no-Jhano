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
public class cProveedor {

    public Boolean ingresarProveedor(cDatosProveedor datDatos) {
        Boolean flag = false;
        //cAccesoDatos accEjecutaQry=new cAccesoDatos();
        String strSqlIngreso;
        strSqlIngreso = "INSERT INTO proveedor (Id_prove, Nombre_fiscal, Nombre_comercial, Direccion, "
                + "Convencional, Celular, Correo) VALUES ('"+datDatos.getId()+"', '"+datDatos.getNombreFiscal()+"'"
                + ", '"+datDatos.getNombreComercial()+"', '"+datDatos.getDireccion()+"', '"+datDatos.getConvencional()+"'"
                + ", '"+datDatos.getCelular()+"', '"+datDatos.getCorreo()+"')";
        
        return flag;
    }

}
