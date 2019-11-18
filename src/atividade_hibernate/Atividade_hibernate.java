/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atividade_hibernate;

import Entidade.Nimbus;
import visao.Telausuario;

/**
 *
 * @author lukas
 */
public class Atividade_hibernate {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Nimbus.pegaNimbus();
      Telausuario ts = new Telausuario();
      ts.setVisible(true);
    }
    
}
