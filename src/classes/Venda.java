/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classes;

import java.util.Date;

/**
 *
 * @author Meu computador
 */
public class Venda {
    private static int id;
    private Date dataVenda;
    private ImovelVenda imovel;
    private Cliente novoProprietario;

    public Venda() {
        this.id += 1;
    }
    
    public Venda(Date dataVenda, ImovelVenda imovel, Cliente novoProprietario) {
        this.dataVenda = dataVenda;
        this.imovel = imovel;
        this.novoProprietario = novoProprietario;
    }

    public static int getId() {
        return id;
    }

    public Date getDataVenda() {
        return dataVenda;
    }

    public void setDataVenda(Date dataVenda) {
        this.dataVenda = dataVenda;
    }

    public ImovelVenda getImovel() {
        return imovel;
    }

    public void setImovel(ImovelVenda imovel) {
        this.imovel = imovel;
    }

    public Cliente getNovoProprietario() {
        return novoProprietario;
    }

    public void setNovoProprietario(Cliente novoProprietario) {
        this.novoProprietario = novoProprietario;
    }
}
