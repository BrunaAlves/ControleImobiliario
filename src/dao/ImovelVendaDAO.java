/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import classes.ImovelVenda;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

/**
 *
 * @author Meu computador
 */
public class ImovelVendaDAO {

    private List<ImovelVenda> lista = null;

    public ImovelVendaDAO() {
        lista = new ArrayList<ImovelVenda>();
    }

    public void adicionarImovel(ImovelVenda imovel) {
        lista.add(imovel);
    }

    public void removerImovel(int id) {
        ImovelVenda imovel = this.buscarImovel(id);
        if (imovel != null) {
            lista.remove(imovel);
        }
    }

    public void alterarImovel(ImovelVenda imovel) {
        ImovelVenda imv = buscarImovel(imovel.getId());
        int ind = lista.indexOf(imv);
        lista.set(ind, imovel);
    }

    public ImovelVenda buscarImovel(int id) {
        ImovelVenda imv = null;
        for (ImovelVenda imovel : lista) {
            if (imovel.getId() == id) {
                imv = imovel;
            }
        }
        return imv;
    }

    public List<ImovelVenda> buscarImovelPorTipo(String tipo) {
        List<ImovelVenda> imoveis = new ArrayList<>();
        for (ImovelVenda imovel : lista) {
            if (imovel.getTipo().contains(tipo)) {
                imoveis.add(imovel);
            }
        }
        return imoveis;
    }

    public List<ImovelVenda> buscarImovelDisponivelPorTipo(String tipo) {
        List<ImovelVenda> imoveis = new ArrayList<>();
        for (ImovelVenda imovel : lista) {
            if (imovel.getTipo().contains(tipo) && imovel.isDisponivel()) {
                imoveis.add(imovel);
            }
        }
        return imoveis;
    }

    public List<ImovelVenda> todosImoveis() {
        return lista;
    }

    public List<ImovelVenda> todosImoveisDsiponiveis() {
        boolean disponivel = true;
        Predicate<ImovelVenda> imovelPredicate = p -> p.isDisponivel() == disponivel;
        lista.removeIf(imovelPredicate);
        return lista;
    }
}
