/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.lewissa.jhano.accesodatos.ws;
import com.lewissa.jhano.accesodatos.cAccesoDatos;
import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;

/**
 *
 * @author eborja
 */
@WebService(serviceName = "wsAccesoDatos")
public class wsAccesoDatos {

    /**
     * Web service operation
     */
    @WebMethod(operationName = "insertarProveedor")
    public Boolean insertarProveedor(@WebParam(name = "strSql") String strSql) {
        //TODO write your implementation code here:
        Boolean flag1 = false; // revisa la respuesta de la base
        Boolean flag2 = false; // revisa la conexion
        cAccesoDatos accConexion = new cAccesoDatos();
        if (!accConexion.conectaDataBase()) {
            flag2 = false; //error en la conexion
        } else {
            flag2 = true; // conexion correcta
            flag1 = accConexion.actualizaDataBase(strSql);
        }
        flag1 = (flag1.equals(true)) && (flag2.equals(true));
        return flag1;
    }
}
