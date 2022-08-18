/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sueldoantiguedad;

import Entidades.Vendedor;
import Servicios.VendedrorServicio;


/**
 *
 * @author JCALELLA
 */
public class SueldoAntiguedad {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        VendedrorServicio vs = new VendedrorServicio();
        Vendedor v1 = vs.altaVendedor();
        vs.SueldoMensual(v1);
        vs.vacaciones(v1);
        
    }
    
}
