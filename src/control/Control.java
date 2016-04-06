/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control;

import hibernate.dao.CargoDAO;
import hibernate.dao.UsuariosDAO;
import hibernate.model.Cargo;
import hibernate.model.Usuarios;


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
        
        UsuariosDAO user = new UsuariosDAO();
        
        System.out.println(((Usuarios) user.findAll().get(0)).getCedula());
       
        
    }
    
}
