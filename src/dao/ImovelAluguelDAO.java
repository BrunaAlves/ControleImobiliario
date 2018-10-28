/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import classes.ImovelAluguel;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Meu computador
 */
public class ImovelAluguelDAO {
    private List<ImovelAluguel> lista = null;
    
    public ImovelAluguelDAO() {
        lista = new ArrayList<ImovelAluguel>();
    }
    
    public void adicionarImovel(ImovelAluguel imovel){
        lista.add(imovel);       
    }
    
    public void removerImovel(int id){
        ImovelAluguel imovel = this.buscarImovel(id);
        if(imovel != null){
            lista.remove(imovel);
        }
    }
    
   public void alterarImovel(ImovelAluguel imovel){
        ImovelAluguel imv = buscarImovel(imovel.getId());
        int ind = lista.indexOf(imv);
        lista.set(ind, imovel);
    }
    
    public ImovelAluguel buscarImovel(int id){
        ImovelAluguel imv = null;
        for(ImovelAluguel imovel: lista){
            if(imovel.getId() == id) {
            }
        }
        return imv;
    }
    
    public List<ImovelAluguel> todosImoveis(){
        return lista;
    }
}
