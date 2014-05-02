/*
 * Acceso a Datos
 *Esta clase permite gestionar la base de datos,
 *Permitiendo reaizar la aplicacion del CRUD
 *NOTA: Manejo de exepciones sencibles a proximos cambios
 */
package com.lewissa.jhano.accesodatos;

import com.lewissa.jhano.utilidades.cConstantes;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;

/**
 * Acceso a Datos
 *
 * @author Fredy Janeta 
 * @version 1.1 02-05-2014
 */
public class cAccesoDatos {

    private Connection conConexion = null;

    /**
     * Metodo que permite realizar la conexion a la DB y me retorna confirmacion
     *
     * @return booResultado, Booleano que retorna la confirmacion de la
     * ejecucion del metodo
     */
    public Boolean conectaDataBase() {
        Boolean booResultado = false;
        try {
            Class.forName(cConstantes.DRIVER);
            Properties proCredenciales = new Properties();
            proCredenciales.setProperty("user", cConstantes.USER);
            proCredenciales.setProperty("password", cConstantes.PASSWORD);
            conConexion = DriverManager.getConnection(cConstantes.URL, proCredenciales);
            conConexion.setAutoCommit(true);
            booResultado = true;
        } finally {
            return booResultado;
        }

    }

    /**
     * Metodo que permite realizar la desconexion de la DB y retorna la
     * confirmacion
     *
     * @return booResultado, Booleano que contiene la confirmaicond de la
     * ejecicion del metodo
     */
    public Boolean desconectaDataBase() {
        Boolean booResultado = false;
        try {
            if (this.conConexion != null) {
                conConexion.close();
                booResultado = true;
            }
        } finally {
            return booResultado;
        }
    }

    /**
     * Metodo que permite realizar consultas y obtener el resultado de dicha
     * consulta.
     *
     * @param strParametroQuery, String que contiene la sentencia SQL a
     * ejecuatrse
     * @return resResultadoConsulta, ResulSet que contiene el resultado de la
     * consulta
     * @throws ClassNotFoundException Exepcion de calse no encontrada
     * @throws SQLException Exepcion de sintaxis SQL incorrecta
     */
    public ResultSet consultaDataBase(String strParametroQuery) throws ClassNotFoundException, SQLException {
        ResultSet resResultadoConsulta = null;
        Statement staCreaQuery = null;
        try {
            if (this.conConexion != null) {
                staCreaQuery = this.conConexion.createStatement();
                resResultadoConsulta = staCreaQuery.executeQuery(strParametroQuery);
            }

        } catch (SQLException e) {
            System.out.println(e.getMessage());
        } finally {
            staCreaQuery.close();
            return resResultadoConsulta;
        }

    }

    /**
     * Metodo que permite Insertar Modificar y actualizar y retorna la
     * confirmaciond de la ejecucion del metodo
     *
     * @param strQuery, String que contiene la sentencia SQL a ejecutar
     * @return booRedsultado, Booleano que conetiene la la confirmacion de la ejecucion del metodo
     */
    public Boolean actualizaDataBase(String strQuery) {
        Boolean booResultado = null;
        Statement staCreaQuery = null;
        try {
            if (this.conConexion != null) {
                staCreaQuery = this.conConexion.createStatement();
                staCreaQuery.execute(strQuery);
                staCreaQuery.close();
                booResultado = true;
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        } finally {
            return booResultado;
        }
    }

}
