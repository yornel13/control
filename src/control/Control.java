/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control;

import hibernate.dao.AccionTipoDAO;
import hibernate.dao.IdentidadDAO;
import hibernate.model.AccionTipo;
import hibernate.model.Identidad;


/**
 *
 * @author user 01
 */
public class Control {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        AccionTipoDAO accionTipoDAO = new AccionTipoDAO();
        AccionTipo accionTipo = new AccionTipo();
        accionTipo.setNombre("edicion");
        accionTipo.setActivo(Boolean.TRUE);
        accionTipoDAO.save(accionTipo);
    }
    
}
