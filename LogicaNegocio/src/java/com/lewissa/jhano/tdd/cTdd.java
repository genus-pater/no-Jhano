/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.lewissa.jhano.tdd;

import com.lewissa.jhano.proveedor.cDatosProveedor;
import com.lewissa.jhano.proveedor.cProveedor;
import junit.framework.*;

/**
 *
 * @author eborja
 */
public class cTdd extends TestCase {

    // Este test prueba el ingreso de un proveedor
    public void testIngresaProveedor() {
        cProveedor proProveedor = new cProveedor();
        cDatosProveedor datDatosProveedor = new cDatosProveedor();
        Boolean flag;
        datDatosProveedor.setId("1");
        datDatosProveedor.setNombreFiscal("Prueba");
        datDatosProveedor.setNombreComercial("Comercial");
        datDatosProveedor.setDireccion("Direccion");
        datDatosProveedor.setConvencional("1234567");
        datDatosProveedor.setCelular("1234567890");
        datDatosProveedor.setCorreo("asdfg@kk.edu");
        flag = proProveedor.ingresarProveedor(datDatosProveedor);
        assertTrue(flag);
    }

    public static Test suite() {
        return new TestSuite(cTdd.class);
    }

    public static void main(String[] args) {
        junit.textui.TestRunner.run(suite());
    }

}
