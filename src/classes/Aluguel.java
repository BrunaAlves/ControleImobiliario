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
public class Aluguel {
    private static int id;
    private Date dataAluguel;
    private ImovelAluguel imovel;
    private Cliente novoProprietario;

    public Aluguel() {
        this.id += 1;
    }
    
    public Aluguel(Date dataAluguel, ImovelAluguel imovel, Cliente novoProprietario) {
        this.dataAluguel = dataAluguel;
        this.imovel = imovel;
        this.novoProprietario = novoProprietario;
    }

    public static int getId() {
        return id;
    }

    public Date getDataAluguel() {
        return dataAluguel;
    }

    public void setDataAluguel(Date dataAluguel) {
        this.dataAluguel = dataAluguel;
    }

    public ImovelAluguel getImovel() {
        return imovel;
    }

    public void setImovel(ImovelAluguel imovel) {
        this.imovel = imovel;
    }

    public Cliente getNovoProprietario() {
        return novoProprietario;
    }

    public void setNovoProprietario(Cliente novoProprietario) {
        this.novoProprietario = novoProprietario;
    }
}
