/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import classes.Aluguel;
import java.util.ArrayList;

/**
 *
 * @author Meu computador
 */
public class AluguelDAO {

    private ArrayList<Aluguel> lista = null;

    public AluguelDAO() {
        lista = new ArrayList<Aluguel>();
    }

    public void adicionarAluguel(Aluguel aluguel) {
        lista.add(aluguel);
    }
}
