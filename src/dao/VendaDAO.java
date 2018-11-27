/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import classes.Venda;
import java.util.ArrayList;

/**
 *
 * @author Meu computador
 */
public class VendaDAO {
    
    private ArrayList<Venda> lista = null;

    public VendaDAO() {
        lista = new ArrayList<Venda>();
    }

    public void adicionarVenda(Venda venda) {
        lista.add(venda);
    }
}
