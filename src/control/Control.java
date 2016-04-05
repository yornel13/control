/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control;

import hibernate.dao.EstadoCivilDAO;

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
        EstadoCivilDAO ecdao = new EstadoCivilDAO();
        ecdao.findAll();
        System.out.println(ecdao.findAll().size());
    }
    
}
