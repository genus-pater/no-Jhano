/*
 * Acceso a Datos
 *Esta clase permite gestionar la base de datos,
 *Permitiendo reaizar la aplicacion del CRUD
 */
package com.lewissa.jhano.accesodatos;

import java.sql.DriverManager;
import java.util.Properties;
import com.lewissa.jhano.utilidades.cConstantes;
import java.sql.Connection;
import java.sql.SQLException;

/**
 * Acceso a Datos
 *
 * @author Fredy Janeta
 * @version 1.0
 */
public class cAccesoDatos {

    /**
     * Este metodo permite realizar la conexion a la DB
     *
     * @return conexion, variable de tipo Conecction que contiene la copnexion a
     * la DB
     * @throws ClassNotFoundException -No se encontro la clase
     * @throws java.sql.SQLException -Sentencia SQL incorrecta
     */
    public Connection conexionDataBase() throws ClassNotFoundException, SQLException {
        Connection conexion = null;
        try {
            Class.forName(cConstantes.DRIVER);
            Properties credenciales = new Properties();
            credenciales.setProperty("user", cConstantes.USER);
            credenciales.setProperty("password", cConstantes.PASSWORD);
            conexion = DriverManager.getConnection(cConstantes.URL, credenciales);
            conexion.setAutoCommit(true);

        } finally {
            if (conexion != null) {
                conexion.close();
            }
        }
        return conexion;
    }
}
