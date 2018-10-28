/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import classes.ImovelAluguel;
import classes.ImovelVenda;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Meu computador
 */
public class ImovelVendaDAO {
        private List<ImovelVenda> lista = null;
    
    public ImovelVendaDAO() {
        lista = new ArrayList<ImovelVenda>();
    }
    
    public void adicionarImovel(ImovelVenda imovel){
        lista.add(imovel);       
    }
    
    public void removerImovel(int id){
        ImovelVenda imovel = this.buscarImovel(id);
        if(imovel != null){
            lista.remove(imovel);
        }
    }
    
   public void alterarImovel(ImovelVenda imovel){
        ImovelVenda imv = buscarImovel(imovel.getId());
        int ind = lista.indexOf(imv);
        lista.set(ind, imovel);
    }
    
    public ImovelVenda buscarImovel(int id){
        ImovelVenda imv = null;
        for(ImovelVenda imovel: lista){
            if(imovel.getId() == id) {
            }
        }
        return imv;
    }
    
    public List<ImovelVenda> todosImoveis(){
        return lista;
    }
}
