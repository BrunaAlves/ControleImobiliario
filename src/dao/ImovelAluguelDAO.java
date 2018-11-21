/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import classes.ImovelAluguel;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

/**
 *
 * @author Meu computador
 */
public class ImovelAluguelDAO {

    private ArrayList<ImovelAluguel> lista = null;

    public ImovelAluguelDAO() {
        lista = new ArrayList<ImovelAluguel>();
    }

    public void adicionarImovel(ImovelAluguel imovel) {
        lista.add(imovel);
    }

    public void removerImovel(int id) {
        ImovelAluguel imovel = this.buscarImovel(id);
        if (imovel != null) {
            lista.remove(imovel);
        }
    }

    public void alterarImovel(ImovelAluguel imovel) {
        ImovelAluguel imv = buscarImovel(imovel.getId());
        int ind = lista.indexOf(imv);
        lista.set(ind, imovel);
    }

    public ImovelAluguel buscarImovel(int id) {
        ImovelAluguel imv = null;
        for (ImovelAluguel imovel : lista) {
            if (imovel.getId() == id) {
                imv = imovel;
            }
        }
        return imv;
    }

    public List<ImovelAluguel> buscarImovelPorTipo(String tipo) {
        List<ImovelAluguel> imoveis = new ArrayList<>();
        for (ImovelAluguel imovel : lista) {
            if (imovel.getTipo().contains(tipo)) {
                imoveis.add(imovel);
            }
        }
        return imoveis;
    }

    public List<ImovelAluguel> buscarImovelDisponivelPorTipo(String tipo) {
        List<ImovelAluguel> imoveis = new ArrayList<>();
        for (ImovelAluguel imovel : lista) {
            if (imovel.getTipo().contains(tipo) && imovel.isDisponivel()) {
                imoveis.add(imovel);
            }
        }
        return imoveis;
    }

    public List<ImovelAluguel> todosImoveis() {
        return lista;
    }

    public List<ImovelAluguel> todosImoveisDsiponiveis() {
        boolean disponivel = true;
        Predicate<ImovelAluguel> imovelPredicate = p -> p.isDisponivel() == disponivel;
        lista.removeIf(imovelPredicate);
        return lista;
    }
}
